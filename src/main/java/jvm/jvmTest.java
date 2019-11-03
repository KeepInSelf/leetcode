package jvm;

/**
 * -XX:NewSize=5242880   设置新生代初始大小5M
 * -XX:MaxNewSize=5242880 设置新生代最大大小5M
 * -XX:InitialHeapSize=10485760  设置初始堆大小10M
 * -XX:MaxHeapSize=10485760   设置堆最大大小10M
 * -XX:SurvivorRatio=8   设置新生代eden和survivor的比例8:1 也就是说S区大小为0.5M
 * -XX:PretenureSizeThreshold=10485760  设置对象超多10M直接进入老年代
 * -XX:+UseParNewGC   新生代使用ParNew垃圾收集器
 * -XX:+UseConcMarkSweepGC 老年代使用CMS垃圾回收器
 * -XX:+PrintGCDetails
 * -XX:+PrintGCTimeStamps
 * -Xloggc:gc.log
 */
public class jvmTest {
    public static void main(String[] args) {
        Byte[] array1 = new Byte[999*1024];
        array1=null;
        array1 = new Byte[2*1024 * 1024];
        array1 = null;
        array1 = new Byte[512 * 1024];
        array1 = new Byte[512 * 1024];
        array1=null;
        array1 = new Byte[1024 * 1024];
//        array1 = new Byte[1024 * 1024];
//        array1 = null;
//        Byte[] array2 = new Byte[2*1024 * 1024];
    }
}
