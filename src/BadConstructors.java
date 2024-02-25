public class BadConstructors {
    private int x;
    private int y;
    private int width;
    private int height;
    public  BadConstructors(){
        this.x=0;
        this.y=0;
        this.width=0;
        this.height=0;
    }

    public BadConstructors(int width,int height){
        this.x=0;
        this.y=0;
        this.width=width;
        this.height=height;
    }
    public BadConstructors(int x,int y,int height,int width){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

}
