package edu.neu.mgen;

public class lab2 {
    public static String[] switchWord(String[] arr){//method called switchWord, name:arr,type:string
        String[] newArray = new String[arr.length];

        for(int i=0; i< arr.length;i++) {
            String name = arr[i];
            if (name.length() <= 1) {
                newArray[i] = name;
            } else {
                char first = name.charAt(0);
                char last = name.charAt(name.length() - 1);
                String middle = name.substring(1, name.length() - 1);
                String newName = (" " + last + middle + first);
                newName = Character.toUpperCase(newName.charAt(0)) + newName.substring(1);
                newArray[i] = newName;
            }
        }
        return newArray;
    }
    public static void printArray(String[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
        public static void main(String[] args){
            String[] names = {"Emma","Alice","Lily","Mike","Jane"};
            System.out.print("newName= ");
            printArray(names);

            System.out.print("\nswitchword= ");
            printArray(switchWord(names));

        }

    }


