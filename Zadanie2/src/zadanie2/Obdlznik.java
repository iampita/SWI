
package zadanie2;

//***********OBDLZNIK***************
 class Obdlznik extends GeomTvar{
   
     public double sirka;
     public double dlzka;
 
    public Obdlznik(int x, int y, double sirka, double dlzka){
        super(x,y);
        this.sirka = sirka;
        this.dlzka = dlzka;
    }
    
    @Override
    protected double VypocitajObsah() {
        return sirka*dlzka;
    }

    @Override
    protected double VypocitajObvod() {
        return (2*sirka)+(2*dlzka);
    }

}

//**********STVOREC***************
  class Stvorec extends GeomTvar{
      
      public double sirka;
   
      public Stvorec(int x,int y, double sirka){
          super(x,y);
          this.sirka=sirka;
      }
      
    @Override
    protected double VypocitajObsah() {
        return sirka*sirka;
    }

    @Override
    protected double VypocitajObvod() {
        return 4*sirka;
    }    
}

//***********KRUH*****************
    class Kruh extends GeomTvar {
        
    public double polomer;
        
        public Kruh(int x, int y,double polomer){
            super(x,y);
            this.polomer=polomer;  
        }
        
    @Override
    protected double VypocitajObsah() {
        return Math.PI*polomer*polomer;
    }

    @Override
    protected double VypocitajObvod() {
        return Math.PI*polomer*2;
    }            
}

//******ROVNOSTRANNY TROJUHOLNIK******************
    class Trojuholnik extends GeomTvar {
      
    public double dlzka;
    
        public Trojuholnik(int x, int y, double dlzka){
            super(x,y);
            this.dlzka=dlzka; 
        }
        
    @Override
    protected double VypocitajObsah() {
        return ((Math.sqrt(3)*dlzka*dlzka)/4);
    }

    @Override
    protected double VypocitajObvod() {
        return 3*dlzka;
    }           
 }