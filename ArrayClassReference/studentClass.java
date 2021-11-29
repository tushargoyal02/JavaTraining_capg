class studentClass{
    int id;
    String name;
    int age;

    void compute(){
        System.out.println("id "+id);
        System.out.println("name "+name);
        System.out.println("age "+age);
    }

    public static void main(String[] args){
        studentClass s = new studentClass();
        s.compute();
    }
}