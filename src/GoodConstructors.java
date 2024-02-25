public class GoodConstructors {
    private int x;
    private int y;
    private int height;
    private int width;

    public GoodConstructors(){
        this(0,0);
    }
    public GoodConstructors(int width,int height){
        this(0,0,width,height);
    }

    public GoodConstructors(int x,int y,int width,int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
}
