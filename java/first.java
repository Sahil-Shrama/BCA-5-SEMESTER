class a{
    private void mymethod(){
        System.out.println("helllo");
    }
}

class b extends a{
    public void kem() {
      System.out.println("namaste");
    }
        public static void main(String[] args) {
        
        b obj = new b();
        obj.mymethod();
        
    
}}