import java.time.LocalDate;

public class Controller 
{



    //View//////////////////////////////////////////////////////////////

    //Model//////////////////////////////////////////////////////////
    public FridgeDrawer[][] fd;


    Controller(FridgeDrawer[][] fd){
        this.fd = fd;
    }

    //�]�w��l
    public void setDrawer(int i, int j, FridgeDrawer fridegeDrawer) {
        fd[i][j] = fridegeDrawer;
    }

    //�M����l
    public void deleDrawer(int i, int j)
    {
        fd[i][j] = null;
    }

    //���o�Ҧ���l
    public FridgeDrawer[][] getDrawer()
    {
        return fd;
    }

    //�ˬd���q    
    public void CheckAllWeight()
    {
        for (int i = 0; i < fd.length; i++)
        {
            for (int j = 0; j < fd[0].length;j++)
            {
                if(fd[i][j] != null)
                {
                    //�ק�//��WeightSensor���n�n�令�ܼ�
                    fd[i][j].CheckWeight(10);
                }
            }
        }
    }

    //�洫��m
    public void SwapDrawerPosition(int i, int j, int x, int y)
    {
        FridgeDrawer temp = fd[i][j];
        fd[i][j] = fd[x][y];
        fd[x][y] = temp;
    }

    //������� �i��C�ѩI�s�@��
    public void checkExpDate()
    {
        for (int i = 0; i < fd.length; i++)
        {
            for (int j = 0; j < fd[0].length;j++)
            {
                if(fd[i][j] != null) fd[i][j].CheckExpDate(LocalDate.now());                
            }
        }
    }
}
