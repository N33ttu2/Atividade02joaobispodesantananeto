package Quest_03;

public class Aviao {
        private double velocidade;
        private double altitude;
        private String modelo;
        
        public void reduzirVel(double reducaoVel) {
            this.velocidade = velocidade - reducaoVel;
        }
        
        public void aumentarVel(double aumentVel) {
            this.velocidade = velocidade + aumentVel;
        }
        public void aumentarAlt(double aumentAlt) {
            this.velocidade = velocidade + aumentAlt;
        }
        
        public void reduzirAlt(double reducaoAlt) {
            this.altitude = altitude - reducaoAlt;
        }
        
        public double getVelocidade() {
            return velocidade;
        }
    
    
    
        public void setVelocidade(int velocidade) {
            this.velocidade = velocidade;
        }
    
    
    
        public double getAltitude() {
            return altitude;
        }
    
    
    
        public void setAltitude(int altitude) {
            this.altitude = altitude;
        }
    
    
    
        public String getModelo() {
            return modelo;
        }
    
    
    
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    
    
    
        public Aviao(int velocidade, int altitude, String modelo) {
            super();
            this.velocidade = velocidade;
            this.altitude = altitude;
            this.modelo = modelo;
        }
    
        
        
}
