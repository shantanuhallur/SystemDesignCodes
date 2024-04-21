class Test {
    public static void main(String[] args) {
        CacheProxyWork work = new CacheProxyWork();
        System.out.println(work.fun1(5)); 
        System.out.println("---------------------------");
        System.out.println(work.fun1(5)); 
    }
}