class LocalGlobal {

     int global = 100;
    void show() {
           
        
        int local = 50;

        System.out.println("Local Variable = " + local);
        System.out.println("Global Variable = " + global);
    }

    public static void main(String[] args) {

       LocalGlobal obj = new LocalGlobal();

        obj.show();

    }
}
