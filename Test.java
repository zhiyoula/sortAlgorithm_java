package com.bot.test;

public class Test {

    public static void main(String[] args) {
        // TODO 自动生成的方法存根
//      System.out.println("hello world!");
        int array_int[]={345,100,3,46,89,10,200};
//      Test test=new Test();
//      Test.base_function_for(array_int);
//      String array_str[]={"F","G","SFS","SWFWEF"};
//      Test.base_function_for(array_str);
        Sort m_sort=new Sort();
        //调用冒泡排序
        //m_sort.maopao(array_int);
        //调用选择排序
        m_sort.xuanze(array_int);
    }
    public static void base_function_for(String[] array){
        for (int i=1;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void base_function_for(int[] array){
        for (int i=1;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
//排序算法
class Sort{
    //冒泡排序
    public void maopao(int[] array){
        //设置中间值
        int temp=0;
        //循环次数
        for (int i=0;i<array.length;i++){
            //对比个数，1和2比，2和3比，先找出最大值，后找出最小值
            for (int t=0;t<array.length-i-1;t++){
                //判断当前值和下一个值的大小
                if (array[t]>array[t+1]){
                    //大小值对换位置
                    temp=array[t];
                    array[t]=array[t+1];
                    array[t+1]=temp;
                }
            }
        }
        //调用for方法，输出数组内的值
        Test.base_function_for(array);
    }
    //选择排序
    public void xuanze(int[] array){
        //设置中间变量
        int temp_v=0;
        //循环外层数组，从0开始
        for (int i=0;i<array.length;i++){
            //设置最小下标
            int temp_k=i;
            //循环内层数组，从1开始
            for (int t=i+1;t<array.length;t++){
                //如果内层数组的当前元素值大于外层元素的当前元素值
                if (array[t]<array[temp_k]){
                    //记录内层元素的下标为最小下标
                    temp_k=t;
                }
            }
            //如果最小元素不是外层数组的当前元素
            if (temp_k!=i){
                //对换外层数组的当前元素和最小元素的位置
                temp_v=array[i];
                array[i]=array[temp_k];
                array[temp_k]=temp_v;   
            }
        }
        //调用for方法，输出数组内的值
        Test.base_function_for(array);
    }
}
