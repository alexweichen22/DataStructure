package alex02FakeArrayList;

public class CustomArrayOfInts
{
    // Define constant and variables
    final int defaultInt = -2147483648;
    private int[] data = new int[1];
    private int size=0;

    // Define constructors (Overloading)
    public CustomArrayOfInts(){
        size=1;
        data[0] = defaultInt;
    }
    public CustomArrayOfInts(int input){
        size=2;
        data=new int[2];
        data[0]=input;
        data[1]=defaultInt;
    }
    public CustomArrayOfInts(int[] inputArray){
        data = new int[(int)Math.pow(2,inputArray.length)];
        for(int i=0;i<data.length;i++){
            data[i]=i<inputArray.length? inputArray[i]:defaultInt;
        }
    }

    // Define getter
    public int[] getData(){
        return data;
    }

    // Define setter
    // Caution: Defined Leading elements by Initialization or Add
    // .........V.S. Undefined Trailing elements with defaultInt value
    public void setData(int[] inData){
        data = inData;
    }

    public int size(){return size;}

    // Add (basic)
    public void add(int value){
        int[] temp = new int[size*2];
        for(int i=0;i<size;i++){
            temp[i]=data[i];
            temp[size+i]=defaultInt;
        }
        data = temp;
        size*=2;
        for(int j=0;j<size;j++){
            if (data[j]==defaultInt){
                data[j]=value;
                break;
            }
        }
    }

    // Add (Overloading)
    public void add(int[] valueArray){
        for(int i=0;i<valueArray.length;i++){
            add(valueArray[i]);
        }
    }

    // Delete by value
    public boolean deleteByValue(int value){
        if (value == defaultInt){
            try {
                throw new IllegalArgumentException();
            }
            catch(Exception exc){
                System.out.println("Index entered is out of boundary!");
            }
        }
        int sizeValidTemp = sizeValid();

        for(int i=0;i<sizeValidTemp;i++){
            if(data[i]==value){
                for(int j=i;j<sizeValidTemp;j++) {
                    data[j]=data[j+1];
                }
                    return true;
            }
        }
        return false;
    }


    // Delete by index
    public void deleteByIndex(int index){
        if (index<0 || index>=sizeValid()){
            try {
                throw new IllegalArgumentException();
            }
            catch(Exception exc){
                System.out.println("Index entered is out of boundary!");
            }
        }
        int sizeValidTemp = sizeValid();
        for(int i=index;i<sizeValidTemp;i++){
            data[i]=data[i+1];
        }
    }

    // Insert Value At Index
    public void insertValueAtIndex(int value, int index){

    }

    //
    public void clear(){
        data = new int[1];
        data[0]=defaultInt;
    }

    //
    public int get(int index) throws Exception {
        try {
            return data[index];
        }
        catch(IndexOutOfBoundsException exc){
            System.out.println(exc.getMessage());
        }
        return defaultInt;
    }

    //
    public int[] getSlice(int startIdx, int length){
        return new int[]{1,2};
    }

    // Helper method (size of the valid elements, defined instead of defaultValue)
    public int sizeValid() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == defaultInt) {return i;}
        }
        return data.length;
    }

    // ToString method override
    @Override
    public String toString(){
        String out = "[";
        for(int i=0;i<sizeValid();i++){
            out += (data[i]+ (i==sizeValid()-1?"]":", "));
        }
        return out;
    }
}



