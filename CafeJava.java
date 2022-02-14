public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";
        
        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 5;
        double precioFiltro = 2.5;
        double precioLeche = 3.0;
        double precioCapuchino = 3.5;
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = false;
        boolean estaListoOrden3 = true;
        boolean estaListoOrden4 = false;

        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        

    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //
        System.out.println(saludoGeneral + cliente1);
        if(estaListoOrden1){
            System.out.println(cliente1 + mensajeListo);
            System.out.println(mensajeMostrarTotal+precioMocha);
        }
        else{
            System.out.println(cliente1 + mensajePendiente);
        }
        if(estaListoOrden4){
            System.out.println(cliente4 + mensajeListo);
            System.out.println(mensajeMostrarTotal+precioCapuchino);
        }
        else{
            System.out.println(cliente4 + mensajePendiente);
        }
        if(estaListoOrden2){
            System.out.println(cliente2 + mensajeListo);
            System.out.println(mensajeMostrarTotal+2 *precioLeche);
        }
        else{
            System.out.println(cliente2 + mensajePendiente);
        }
        if(estaListoOrden3){
            System.out.println(cliente3 + mensajeListo);
            System.out.println(mensajeMostrarTotal+precioMocha);
            System.out.println(cliente3+ " se dio cuenta que le cobraron mal, y decide pagar la diferencia.");
            System.out.println(mensajeMostrarTotal+(precioMocha-precioLeche));
        }
        else{
            System.out.println(cliente3 + mensajePendiente);
        }

    }
}