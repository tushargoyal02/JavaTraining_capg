class arraystudent_reference{

    static void arrays(){

        // three students array with studentClass as reference
        studentClass[] stdarray = new studentClass[3];

        // We get Null as we creted object reference of class student
        System.out.println("First Array :"+stdarray[0]);

        // creating studentClass object into an array
        stdarray[0] = new studentClass();
        
        // initialize in each array element
        stdarray[0] = new studentClass();
        System.out.println("First Array :"+stdarray[0]);

        //  variable initialzie with first object
        stdarray[0].id=100;

        stdarray[0].compute();
        // std1.id=10;
        // std1.name="Tushar";


    }

    public static void main(String[] args){
        arrays();
    }
}