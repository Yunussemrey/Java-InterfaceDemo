//şirket dışı çalışan
public class OutSideWorked implements IWorks{
    @Override
    public void add() {
        System.out.println("iş alındı : dış çalışan");
    }
}
