package pe.edu.upc.aaw.demo01.dtos;

public class ConfigurationDTO {

    private int idConfiguration;
    private  String language;
    private  boolean notifications;

    public int getIdConfiguration() {
        return idConfiguration;
    }

    public void setIdConfiguration(int idConfiguration) {
        this.idConfiguration = idConfiguration;
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