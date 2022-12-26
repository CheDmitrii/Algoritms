package SetOfNotation;

public class Notations {
    private String[] array;
    private int size;
    private int copacity;

    {
        size = 0;
        array = new String[0];
        copacity = 0;
    }
    public Notations(){}
    public Notations(String[] array){
        this.size = array.length;
        this.array = new String[this.size];
    }

    public boolean isFull(){
        return size == copacity;
    }

    public boolean isEmpty(){
        return copacity == 0;
    }

    public void addElement(String elemment){
        if (isFull()){
            String[] helpArray = new String[this.size + 10];
            for (int i = 0; i < helpArray.length; i++){
                if (i < this.array.length){
                    helpArray[i] = this.array[i];
                }
            }
            helpArray[this.array.length] = elemment;
            this.array = new String[helpArray.length];
            for (int i = 0; i < array.length; i++){
                array[i] = helpArray[i];
            }
        }else{


        }
    }
}
