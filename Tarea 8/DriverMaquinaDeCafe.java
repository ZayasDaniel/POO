public class DriverMaquinaDeCafe {

    public static void main(String[] args) {

        MaquinaDeCafe maquina = new MaquinaDeCafe();

        maquina.hacerExpreso();
        maquina.hacerExpreso();
        maquina.hacerCapuchino();
        maquina.hacerCapuchino();
        maquina.hacerAmericano();
        maquina.hacerAmericano();

        // A continuacion pedimos que nos muestre nuestro deposito.
        System.out.println( maquina.obtenerCantidadIngredientes());


    }
}
