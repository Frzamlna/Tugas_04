package LCD;
public class LCD {
     //isi bagian ini
    private String Status;
    private int Volume;
    private int Brightness;
    private String Cable;

    // buat method yang ada pada soal 
    public LCD() {
        this.Status = "Off";
        this.Volume = 0;
        this.Brightness = 50;
        this.Cable = "HDMI";
    }

    // Method mengubah LCD menjadi status on
    public void turnOn() {
        this.Status = "On";
    }

    // Method mengubah LCD menjadi status off
    public void turnOff() {
        this.Status = "Off";
    }

    // Method untuk status freeze LCD
    public void Freeze() {
        this.Status = "Freeze";
    }

    // Method untuk set volume
    public void setVolume(int volume) {
        this.Volume = volume;
    }

    // Method untuk menambah volume
    public int volumeUp() {
        this.Volume++;
        return this.Volume;
    }

    // Method untuk set brightness
    public void setBrightness(int brightness) {
        this.Brightness = brightness;
    }

    // Method untuk mengurangi brightness
    public int brightnessDown() {
        this.Brightness--;
        return this.Brightness;
    }

    public void setCable(int option) {
        //lengkapi method ini dengan mennggunakan array
        String[] cables = {"HDMI", "VGA", "DVI", "DisplayPort"};
        this.Cable = cables[0];
    }

    public void displayMessage() {
        //lengkapi method ini
        System.out.println("LCD Status: " + this.Status);
        System.out.println("Volume: " + this.Volume);
        System.out.println("Brightness: " + this.Brightness);

        // Display opsi cable
        System.out.println("Cable: " + this.Cable);
    }
}