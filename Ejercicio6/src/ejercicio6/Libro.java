
package ejercicio6;

public class Libro {
    
    String titulo, pnombre, snombre, papellido, ISBN, pag, edic, edit, ciu, pais, fechaedic;
    
    public Libro(){}
    
        public String gettitulo() {return this.titulo;}
        public String getpnombre() {return this.pnombre;}
        public String getsnombre() {return this.snombre;}
        public String getpapellido() {return this.papellido;}
        public String getISBN() {return this.ISBN;}
        public String getpag() {return this.pag;}
        public String getedic() {return this.edic;}
        public String getedit() {return this.edit;}
        public String getciu() {return this.ciu;}
        public String getpais() {return this.pais;}
        public String getfechaedic() {return this.fechaedic;}
        
        public void settitulo(String t) {this.titulo = t;}
        public void setpnombre(String pn) {this.pnombre = pn;}
        public void setsnombre(String sn) {this.snombre = sn;}
        public void setpapellido(String pa) {this.papellido = pa;}
        public void setISBN(String i) {this.ISBN = i;}
        public void setpag(String p) {this.pag = p;}
        public void setedic(String e) {this.edic = e;}
        public void setedit(String ed) {this.edit = ed;}
        public void setciu(String c) {this.ciu = c;}
        public void setpais(String ps) {this.pais = ps;}
        public void setfechaedic(String f) {this.fechaedic = f;}
        
        public void mostrar(Libro Libro1){
            System.out.println("\n*********************************");
            System.out.println("Titulo: "+Libro1.gettitulo());
            System.out.println(Libro1.getedic()+" edicion");
            System.out.println("Autor: "+Libro1.getpnombre()+", "+Libro1.getsnombre()+". "+Libro1.getpapellido());
            System.out.println("ISBN: "+Libro1.getISBN());
            System.out.println(Libro1.getedit()+", "+Libro1.getciu()+"("+Libro1.getpais()+"), "+Libro1.getfechaedic());
            System.out.println(Libro1.getpag()+" paginas");
    
    }
        
        
        }
    

