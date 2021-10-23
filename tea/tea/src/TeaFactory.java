public class TeaFactory {
    public Tea getTea(String teaType){
        if(teaType == null){
            return null;
        }
        if(teaType.equalsIgnoreCase("Black")){
            return new BlackTea();

        } else if(teaType.equalsIgnoreCase("Green")){
            return new GreenTea();

        } else if(teaType.equalsIgnoreCase("Oolong")){
            return new OolongTea();
        }
        else if(teaType.equalsIgnoreCase("White")){
            return new WhiteTea();
        }
        return null;
    }
}


