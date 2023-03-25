public class MonitorMain {
    public static void main(String[] args) {
        Monitor mon = new Monitor(27.4, "Samsung", "SM10", "LED", 6700.0);
        System.out.println(mon);
        mon.encender();
        mon.apagar();
        mon.proyector();
    }
}
