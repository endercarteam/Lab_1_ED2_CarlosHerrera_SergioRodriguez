/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1_ed_2;

/**
 *
 * @author carlo
 */
public class Listas_P {
 static Nodo PTR;

    static class Nodo {
        int Identificador_P;
        int Identificacion_P;
        String Nom_P;
        int Edad_P;
        String Fecha_P;
        String Genero_P;
        String Estado_P;
        String Email_P;
        String Nivel_P;
        int Ingresos_P;
        String Dir_P;
        int Tel_P;
        
        Nodo link;

        Nodo(int a, int b, String c, int d, String e, String f, String g, String h, String i, int j, String k, int l) {
            this.Identificador_P = a;
            this.Identificacion_P= b;
            this.Nom_P = c;
            this.Edad_P = d;
            this.Fecha_P = e;
            this.Genero_P = f;
            this.Estado_P = g;
            this.Email_P = h;
            this.Nivel_P = i;
            this.Ingresos_P = j;
            this.Dir_P = k;
            this.Tel_P = l;
            this.link = null;
        }

        public int getIdentificador_P() {
            return Identificador_P;
        }

        public int getIdentificacion_P() {
            return Identificacion_P;
        }

        public String getNom_P() {
            return Nom_P;
        }

        public int getEdad_P() {
            return Edad_P;
        }

        public String getFecha_P() {
            return Fecha_P;
        }

        public String getGenero_P() {
            return Genero_P;
        }

        public String getEstado_P() {
            return Estado_P;
        }

        public String getEmail_P() {
            return Email_P;
        }

        public String getNivel_P() {
            return Nivel_P;
        }

        public int getIngresos_P() {
            return Ingresos_P;
        }

        public String getDir_P() {
            return Dir_P;
        }

        public int getTel_P() {
            return Tel_P;
        }

       

        public Nodo getLink() {
            return link;
        }

        public void setLink(Nodo link) {
            this.link = link;
        }
         
         public void insertar(int a, int b, String c, int d, String e, String f, String g, String h, String i, int j, String k, int l) {
        Nodo Nuevo_Nodo = new Nodo(a, b, c, d, e, f, g, h, i, j, k, l);
        if (PTR == null){
          PTR = Nuevo_Nodo;
          
        }
        Nodo Ultimo_Nodo = PTR;
        while(Ultimo_Nodo != null){
        Ultimo_Nodo = Ultimo_Nodo.link;    
        }
        Ultimo_Nodo = Nuevo_Nodo;
    }

    }    
}
