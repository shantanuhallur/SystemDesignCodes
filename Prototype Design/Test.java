class Test {
    public static void main(String[] args) {
        Shape c1 = new Circle();
        Shape c2 = c1.cloneShape();
        //c2 is a whole different object with same property values as c1.
        //c2 and c1 are 2 different object as we return a deep copy of the object
        //in the cloeShape function.
    }
}