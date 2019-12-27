package Banker;

import java.util.Arrays;
import java.util.Scanner;

public class BankerClass {
    Scanner sc = new Scanner(System.in);
    int[] Available ;        //可用资源
    int[][] Max;            //进程最大需求量
    int[][] Allocation;     //进程已占有资源数
    int[][] Need;           //进程还需资源数
    int[][] Request;        //进程请求数
    int[] Work;             //试分配
    int[] temp;            //进程执行顺序  用来保存安全序列
    int num = 0;           //请求分配的进程编号

    /**
     * 含参构造函数，对变量初始化
     */
    public BankerClass(int proc,int sour) {
        Available = new int[sour];          //可用资源
        Max = new int[proc][sour];          //进程最大需求量
        Allocation = new int[proc][sour];   //进程已占有资源数
        Need = new int[proc][sour];         //进程还需资源数
        Request = new int[proc][sour];      //进程请求数
        Work = new int[sour];              //试分配
        temp = new int[proc];
    }

    /**
     * 初始化
     */
    //设置各初始系统变量，并判断是否处于安全状态。
    public void start(int proc,int sour){  //proc--进程  sour--资源
        setAvailable(sour);             //设置Available数组
        setMax(proc,sour);              //设置Max矩阵
        setAllocation(proc,sour);       //设置已分lloction配矩阵A
        show(proc,sour);                //输出资源图
        SecurityAlgorithm(proc,sour);   //安全性算法
    }

    /**
     * 设置Available数组
     */
    public void setAvailable(int sour){
        System.out.println("请设置各资源的总数：");
        for (int i = 0; i < sour; i ++) {
            Available[i] = sc.nextInt();
        }
    }

    /**
     * 设置Max矩阵
     */
    public void setMax(int proc,int sour) {
        System.out.println("请输入各进程的最大资源需求量：");
        for (int i = 0; i < proc; i++) {
            for (int j = 0; j < sour; j++) {
                Max[i][j] = sc.nextInt();
            }
        }
    }

    /**
     * 设置已分配矩阵Alloction
     */
    public void setAllocation(int proc,int sour) {
        System.out.println("请设置各进程分配矩阵Alloction(已分配资源量)：");
        for (int i = 0; i < proc; i++) {
            for (int j = 0; j < sour; j++) {
                Allocation[i][j] = sc.nextInt();
            }
        }
        System.out.println("Need = Max - Allocation.");
        for (int i = 0; i < sour; i++) {     //设置Alloction矩阵
            for (int j = 0; j < proc; j++) {
                Available[i] = Available[i] - Allocation[j][i];
            }
        }
        for (int i = 0; i < proc; i++) {     //设置Need矩阵
            for (int j = 0; j < sour; j++) {
                Need[i][j] = Max[i][j] - Allocation[i][j];
            }
        }
    }

    /**
     * 输出矩阵
     */
    public void show(int proc,int sour){
        System.out.println("此时资源分配量如下：");
        System.out.println("进程  "+"   Max   "+"   Alloction "+"    Need  "+"     Available ");
        System.out.println("----------------------------------------------------");
        for(int i = 0; i < proc; i ++){
            System.out.print("P"+i+"      ");
            for(int j = 0; j < sour; j++){
                System.out.print(Max[i][j]+"  ");
            }
            System.out.print("|     ");

            for(int j = 0; j < sour; j ++){
                System.out.print(Allocation[i][j]+"  ");
            }
            System.out.print("|     ");

            for(int j = 0;j < sour; j ++){
                System.out.print(Need[i][j]+"  ");
            }
            System.out.print("|     ");

            if(i == 0){
                for(int j = 0; j < sour; j ++){
                    System.out.print(Available[j]+"  ");
                }
            }
            System.out.println();
            System.out.println("----------------------------------------------------");
        }
    }

    /**
     * 设置请求资源量Request
     */
    public void setRequest(int proc,int sour) {

        System.out.println("请输入请求资源的进程编号：");
        num = sc.nextInt();    //设置全局变量进程编号num
        if(num > proc){
            System.out.println("超出进程范围,请重新输入!");
        }
        System.out.println("请输入请求各资源的数量：");
        for (int j = 0; j < sour; j++) {
            Request[num][j] = sc.nextInt();
        }
        String str = Arrays.toString(Request[num]);
        System.out.println("进程P" + num + "对各资源请求Request：" + str+"");
        BankerAlgorithm(proc,sour);
    }

    /**
     * 银行家算法
     */
    public void BankerAlgorithm(int proc,int sour) {
        boolean T = true;
        int b = 0;
        int count = 0;
        int number = 0;
        for(int i = 0;i < sour;i++){
            if(Request[num][i] <= Need[num][i]){   //判断Request是否小于Need
                count++;      //保存有几类资源满足Request是否小于Need
            }
        }
        for(int i = 0;i < sour;i++){    //判断Request资源是否小于Available资源
            if(Request[num][i] <= Available[i]){
                number ++;         //保存有几类资源满足Request是否小于Available
            }
        }

        if (count == sour) {   //判断几类资源满足Request是否小于Need
            if(number == sour) {    //判断几类资源满足Request是否小于Available
                //T = true 时，改变数据  可分配
                for (int i = 0; i < sour; i++) {
                    Available[i] -= Request[num][i];
                    Allocation[num][i] += Request[num][i];
                    Need[num][i] -= Request[num][i];
                }
            } else {      //如果不满足Request资源小于Available资源
                System.out.println("当前没有足够的资源可分配，进程P" + num + "需等待。");
                T = false;
            }
        }else {    //如果不满足Request小于Need
            System.out.println("进程P" + num + "请求已经超出最大需求量Need.");
            T = false;
        }

        if(T == true){
            show(proc,sour);
            System.out.println("现在进入安全算法：");
            System.out.println("---------------------------------------------------------------");
            boolean sign = SecurityAlgorithm(proc,sour);
            if(sign == false){
                System.out.println("进程" + num + "申请资源后，分配失败,系统进入死锁状态!");
                for (int i = 0; i < sour; i++) {
                    //恢复到分配之前的数值
                    Available[i] += Request[num][i];
                    Allocation[num][i] -= Request[num][i];
                    Need[num][i] += Request[num][i];
                }
            } else{     //通过安全性检测
                for(int i = 0;i < sour;i++){
                    if(Need[num][i] == 0){    //需求得到满足
                        b++;
                    }
                }
                if(b == sour){
                    for (int i = 0; i < sour; i++) {
                        Available[i] += Allocation[num][i];  //回收资源
                    }
                   show(proc,sour);
                }
            }
        }
    }



    /**
     * 安全性算法
     * @param proc
     * @param sour
     */
    public boolean SecurityAlgorithm(int proc,int sour) {
        boolean[] Finish = new boolean[proc];   //初始化Finish
        for (int i = 0; i < proc; i++) {
            Finish[i] = false;      //表示都还未分配
        }
        boolean lable = false;
        int apply;       //计数标志
        int count = 0;   //完成进程数
        for (int i = 0; i < sour; i ++) {   //设置工作向量
            Work[i] = Available[i];
        }
        boolean flag = true;

        while (count < proc) {     //三重循环 遍历所有进程
            //只有count找到一个安全进程才会自增  当执行到最外层循环 及安全性检测结束
            if (flag) {
                System.out.println("进程  " + "   Work  " + "   Alloction " + "    Need  " + "     Work+Alloction " + "  Finish");
                System.out.println("------------------------------------------------------------------");
                flag = false;
            }
            for (int i = 0; i < proc; i++) {   //遍历进程
                apply = 0;
                for (int n = 0; n < sour; n++) {
                    if (Finish[i] == false && Need[i][n] <= Work[n]) {  //判断进程是否已试分配成功
                        //Work[i] = Available[i];
                        // 若没有分配，且资源需求数小于可用资源数，输出
                        apply++;  //判断上层某进程的资源数是是否全部满足条件
                    }
                }
                if (apply == sour) {
                    System.out.print("P" + i + "      ");
                    //输出Work
                    for (int m = 0; m < sour; m++) {
                        System.out.print(Work[m] + "  ");
                    }
                    System.out.print("|     ");

                    for (int j = 0; j < sour; j++) {
                        Work[j] += Allocation[i][j];
                    }

                    Finish[i] = true;  //当前进程能满足时，设为true表示已分配
                    temp[count] = i;  //进程执行顺序   保存安全序列的顺序
                    count++;          //满足，进程数加1
                    for (int j = 0; j < sour; j++) {
                        System.out.print(Allocation[i][j] + "  ");
                    }
                    System.out.print("|     ");

                    for (int j = 0; j < sour; j++) {
                        System.out.print(Need[i][j] + "  ");
                    }
                    System.out.print("|     ");

                    for (int j = 0; j < sour; j++) {
                        System.out.print(Work[j] + "  ");
                    }
                    System.out.print("\t" + " |  ");
                    System.out.println("\t" + Finish[i]);
                  //  System.out.println("------------------------------------------------------------------");
                }
            }
        }
            if (count == proc) {
                lable = true;
                System.out.println("系统是安全的");
                System.out.println("此时存在一个安全序列：");
                for (int i = 0; i < proc; i ++) {
                    System.out.print("P" + temp[i]);
                    if (i < proc - 1) {
                        System.out.print("-->");
                    }
                }
                System.out.println();
            }
            if(count < proc) {
                lable = false;
                for (int i = 0; i < proc; i++) {
                    if (Finish[i] == false) {
                        System.out.println("当前系统处于不安全状态,故不存在安全序列");
                        break;
                    }
                }
            }
        return lable;    //true 存在安全序列
    }
}
