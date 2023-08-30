class Box{
    float height,width,breath;
    void setbox(float h,float b, float w){
        height=h;
        width=w;
        breath=b;
    }
    void volume(){
        float vol=height*width*breath;
        System.out.println("volume is "+vol);
    }
    void area(){
        float a=2*(width*breath + height*breath);
        System.out.println("area is "+a);
    }
}
public class program {

    public static void main(String[] args) {
        
        // if (args.length != 3) {
        //    System.out.println("please enter 3 numbers");
        //    System.exit(0); 
        // } else {
           Box foo = new Box();
           foo.setbox(8, 8,8);
           foo.volume();
           foo.area(); 
        // }
    }
    
}
