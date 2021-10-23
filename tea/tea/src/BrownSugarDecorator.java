public class BrownSugarDecorator extends TeaDecorator{
    private Tea t;

    public BrownSugarDecorator(Tea t){
        this.t=t;
    }



    @Override
    public String makeTea() {
        return t.makeTea()+" ,Brown Sugar";
    }
}
