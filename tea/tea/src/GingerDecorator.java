public class GingerDecorator extends TeaDecorator{
    private Tea t;

    public GingerDecorator(Tea t){
        this.t=t;
    }



    @Override
    public String makeTea() {
        return t.makeTea()+" ,Ginger";
    }
}
