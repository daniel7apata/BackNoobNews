package pe.edu.upc.aaw.demo01.dtos;

public class ConfiguracionDTO {

    private int idSettings;
    private  String language;
    private  boolean notifications;

    public int getIdSettings() {
        return idSettings;
    }

    public void setIdSettings(int idSettings) {
        this.idSettings = idSettings;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isNotifications() {
        return notifications;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }
}