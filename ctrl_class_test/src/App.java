import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) throws Exception {

        //設定goods
        Goods g1 = new Goods(1,GoodsType.Vegetable,null,"Apple");
        Goods g2 = new Goods(2,GoodsType.RawMeat,null,"prok chop");

        //設定Drawer
        FridgeDrawer[][] fd = new FridgeDrawer[3][2];
        
        //設定ctrlr
        Controller controller = new Controller(fd);
        
        LocalDate d1 = LocalDate.of(2022, Month.MAY, 20);
        LocalDate d2 = LocalDate.of(2022, Month.MAY, 15);
        
        controller.setDrawer(0, 0, new FridgeDrawer(DrawerMode.FreshFood, g1, 100f, d1));
        controller.setDrawer(0, 1, new FridgeDrawer(DrawerMode.Freeze,g2, 100f, d2));
        /*
        controller.CheckAllWeight();
        
        System.out.println(controller.fd[0][0].goods.g_Name+ "," + controller.fd[0][1].goods.g_Name);
        controller.SwapDrawerPosition(0,0,0,1);
        System.out.println(controller.fd[0][0].goods.g_Name+ "," + controller.fd[0][1].goods.g_Name);

        controller.deleDrawer(0, 1);
        System.out.println(controller.fd[0][1].goods.g_Name);
        */
        //System.out.println(ChronoUnit.DAYS.between(d1, d2));
        //controller.checkExpDate();
    }
}
