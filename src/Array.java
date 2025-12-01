public class Array {
    private int[] arrayData;
    private int size;

    //Now we create a constructor that helps define the size of the array
    public Array(int length){
        arrayData = new int[length];
    }

    //This is a method to get an item from the array
    public int getIndexOf(int number){
        for(int i = 0; i<size; i++){
            if(arrayData[i] == number){
                return i;
            }
        }
        return -1;
    }

    //This method is used to insert into the array
    public void insert(int number){
        //check if the array is full
        if(arrayData.length == size){
            int[] resizedArrayData = new int[size *2];
            for(int i = 0; i<size; i++){
                resizedArrayData[i] = arrayData[i]; //we fill the new array with the data in the old array
            }
            arrayData = resizedArrayData; // we then make sure the new temporary array is having the same name as the old one
        }

        arrayData[size++] = number; //here, we are placing the inserted number in the next available position which is the value of the size of the array. then we increase that size value by one
    }

    //This is a method to delete elements from the array
    public void delete(int number){
        int count = 0; //we use this to track the number of instances of the number we want to delete
        for(int i = 0; i < size; i++){
            if(arrayData[i] == number){
                count++;
            }
        }

        if(count == 0){
            System.out.println("Number not found!");
        }

        int[] newArray = new int[size - count];
        int j = 0; //we use this new variable to set the array positions of the new array

        for(int i = 0; i<size; i++){
            if(arrayData[i] != number){
                newArray[j] = arrayData[i];
                j++;
            }
        }

        size = size - count;
        arrayData = newArray;
    }

    //This method is used to print out the elements we append into the array after performing any changes to the array
    public String outputToString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(arrayData[i]);
            if (i < size - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
