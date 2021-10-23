import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternTesting
{
    @Test
    public void DecoratorTesting()
    {
        TeaFactory teaFactory=new TeaFactory();
        Tea tea=teaFactory.getTea("Black");
        tea=new CuttingTeaDecorator(tea);
        assertEquals("Black tea | ,Cutting",tea.makeTea());
        tea=new BrownSugarDecorator(tea);
        assertEquals("Black tea | ,Cutting ,Brown Sugar",tea.makeTea());
    }

    @Test
    public void FactoryTesting()
    {
        TeaFactory teaFactory=new TeaFactory();

        Tea tea=teaFactory.getTea("White");


        assertEquals(tea instanceof WhiteTea,true);
    }
}
