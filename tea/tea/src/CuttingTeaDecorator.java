public class CuttingTeaDecorator extends TeaDecorator{
    private final Tea t;

    public CuttingTeaDecorator(Tea t){
        this.t=t;
    }



    @Override
    public String makeTea() {
        return t.makeTea()+" ,Cutting";
    }
}
