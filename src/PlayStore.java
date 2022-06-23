public class PlayStore {

        private String Youtobe;
        private String Facebook;
        private String Twitter;
        private String Whatsapp;
        private String Instagram;
        private String Line;
        private String Google;
        private String Game;
        private String Ghost;
        private String Hago;
        private String Messeger;
        private String Tokopedia;
        private String Shoppee;



        public PlayStore(String Bug, String Dark, String Dragon, String Elictric, String Fairly){
            this.Youtobe= Youtobe;
            this.Facebook= Facebook;
            this.Twitter= Twitter;
            this.Whatsapp= Whatsapp;
            this.Instagram= Instagram;

        }
        public String getBug(){
            return this.Youtobe;
        }
        public void setBug(String bug){
            this.Youtobe = Youtobe;
        }
        public String getDark(){
            return this.Facebook;
        }
        public void setDark(String JumlahCC){
            this.Facebook= Facebook;
        }
        public String getDragon(){
            return this.Twitter;
        }
        public void setDragon(String Dragon){
            this.Twitter = Twitter;
        }
        public String getElectric(){
            return this.Whatsapp;
        }
        public void setElictric(String Electric){
            this.Whatsapp = Whatsapp;
        }
        public String getFairly(){
            return this.Instagram;
        }
        public void setFairly(){
            this.Instagram = Instagram;
        }

        public static void main(String[] args){
            ArrayList PlayStore= new ArrayList();
            PlayStore = new PlayStore;
            PlayStore.set("Youtobe");
            PlayStore.set("Facebook");
            PlayStore.set("Twitter");
            PlayStore.set("Whatsapp");
            PlayStore.set("Instagram");

        }

        public void Printpokemongo(){
            System.out.println(Youtobe+" "+Facebook+" "+Twitter+" "+Whatsapp+" "+Instagram);
        }

    }

