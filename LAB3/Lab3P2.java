class Lab3P2 {
    public static void main(String[] args) {
        Lab3P2 mol = new Lab3P2(); // same as the class name, an object need to be created.
        mol.display();
        mol.display(10, 20);
        mol.display("You are cool");
    }

    public void display () {
        System.out.println("Hello World");
    }

    public int display (int x, int y) {
        System.out.println("Hello World");
        return x;
    }

    public String display (String u) {
        System.out.println("Hi");
        return u;
    }
}

//singlton class usage then only we create a constructor which is private