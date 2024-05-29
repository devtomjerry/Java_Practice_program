class CompileTimePolymerphism{

    public void display (int a){
        System.out.println("Argument: "+ a);
    }

    public void display (int a, int b){
        System.out.println("Argument :"+ a+ "and "+ b);
    }

    public static void main(String[] args) {
        CompileTimePolymerphism obj = new CompileTimePolymerphism();
        obj.display(10);
        obj.display(10, 20);
    }
}