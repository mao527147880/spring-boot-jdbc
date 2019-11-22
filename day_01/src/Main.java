import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("欢迎观临 万达影音城111111");
        System.out.println("欢迎观临 万达影音城222222");
        System.out.println("欢迎观临 万达影音城333333");
        Scanner sc = new Scanner(System.in);
        boolean isLoop = true;
        while(isLoop){
            System.out.println("请选择你需要去的区，1.休闲区 2.观影区");
            int serve = sc.nextInt();
            if(serve == 1){
                System.out.println("你是想要吃的还是喝的");
                System.out.println("饮品区请按110，小吃区请按120");
                int eatDrink = sc.nextInt();
                if (eatDrink == 110){
                    System.out.println("欢迎来到小吃区");
                    System.out.println("请选择： 111.可乐 112 奶茶 113 咖啡");
                    int eat = sc.nextInt();
                    switch (eat){
                        case(111):
                            System.out.println("给您的可乐，1000元请慢用");
                            break;
                        case(112):
                            System.out.println("给您的奶茶，888元请慢用");
                            break;
                        case(113):
                            System.out.println("给您的可乐，777元请慢用");
                            break;
                        default:
                            System.out.println("你喝个锤子你喝");
                            break;
                    }

                } else if(eatDrink == 120){
                    System.out.println("欢迎来到小吃区");
                    System.out.println("请选择： 121.爆米花 122 汉堡 123 炸鸡");
                    int eat = sc.nextInt();
                    switch (eat){
                        case(121):
                            System.out.println("给您的爆米花，130元请慢用");
                            break;
                        case(122):
                            System.out.println("给您的汉堡，220元请慢用");
                            break;
                        case(123):
                            System.out.println("给您的炸鸡，19元请慢用");
                            break;
                        default:
                            System.out.println("你吃个锤子你喝");
                            break;
                    }
                } else{
                    System.out.println("让你输110,120 没看到？？？？？");
                }
                //开始进入观影区
            } else if (serve == 2){
                System.out.println("你是看喜剧片还是爱情片还是科幻片");
                System.out.println("喜剧片请按21，爱情片请按22，科幻片请按23");
                int look = sc.nextInt();
                if (look== 21){
                    System.out.println("请选择喜剧片： 211.美人鱼  212 功夫熊猫  213 唐人街探案 \n");
                    int comedy = sc.nextInt();
                    switch (comedy){
                        case(211):
                            System.out.println("这是你的《美人鱼》影票，请收好");
                            break;
                        case(212):
                            System.out.println("这是你的《功夫熊猫》影票，请收好");
                            break;
                        case(213):
                            System.out.println("这是你的《唐人街探案》影票，请收好");
                            break;
                        default:
                            System.out.println("你看的哪门子喜剧片？？？？");
                            break;
                    }

                } else if(look == 120){
                    System.out.println("请选择爱情片：221.左耳   222 栀子花开  223 灰姑娘");
                    int love = sc.nextInt();
                    switch (love){
                        case(221):
                            System.out.println("这是你的《左耳》影票，请收好");
                            break;
                        case(222):
                            System.out.println("这是你的《栀子花开》影票，请收好");
                            break;
                        case(223):
                            System.out.println("这是你的《灰姑娘》影票，请收好");
                            break;
                        default:
                            System.out.println("你看的哪门子爱情片？？？？");
                            break;
                    }
                } else if(look == 23){
                    System.out.println("请选择科幻片片：231.银河护卫队  232 蚁人  233 西游记-三打白骨精\n");
                    int love = sc.nextInt();
                    switch (love){
                        case(231):
                            System.out.println("这是你的《银河护卫队》影票，请收好");
                            break;
                        case(232):
                            System.out.println("这是你的《 蚁人》影票，请收好");
                            break;
                        case(233):
                            System.out.println("这是你的《西游记-三打白骨精》影票，请收好");
                            break;
                        default:
                            System.out.println("你看的哪门子科幻片？？？？");
                            break;
                    }
                } else {
                    System.out.println("你是不是来看片的？？？好好输入！！！");
                }
            } else{
                System.out.println("你想上天？？？");
            }
        }

    }
}
