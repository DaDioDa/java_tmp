import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FridgeDrawer 
{
    DrawerMode mode;
    Goods goods;
    float minWeight;
    LocalDate Exdate;
    boolean underWeight = false;

    FridgeDrawer(DrawerMode mode, Goods goods, float minWeight, LocalDate Exdate)
    {
        this.mode = mode;
        this.goods = goods;
        this.minWeight = minWeight;
        this.Exdate = Exdate;
    }

    //�p�G���q�ӧC�^��True
    public void CheckWeight(float curWeight)
    {
        if (curWeight < minWeight)
        {
            //�ק�//��Notifier���n�n�I�sNotifier
            underWeight = true;
        }
        else underWeight = false;
    }

    public void CheckExpDate(LocalDate curDate)
    {
        //�ק�//�[Notifier
        if(ChronoUnit.DAYS.between(curDate, Exdate) <= 3)
        {
            System.out.println(goods.g_Name + " will expire in " + ChronoUnit.DAYS.between(curDate, Exdate) + " days");
        }
    }
}
