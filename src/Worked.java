//şirket içi çalışan
public class Worked implements IWorks, IMoney,IAfternoon{

   IWorks works;
    @Override
    public void add() {
        System.out.println("iş alındı");
            works.add();
    }

    @Override
    public void addMoney() {
        System.out.println("maaş alındı");

    }

    @Override
    public void addAfternoon() {
        System.out.println("öğle yemeği alındı");

    }
}
