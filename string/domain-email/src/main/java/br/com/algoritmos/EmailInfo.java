package br.com.algoritmos;

public class EmailInfo {

    private String domain;
    private String name;
    private boolean isBrazilian;


    public EmailInfo(String name, String domain, boolean isBrazilian) {
        this.name = name;
        this.domain = domain;
        this.isBrazilian = isBrazilian;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBrazilian() {
        return isBrazilian;
    }

    public void setBrazilian(boolean brazilian) {
        isBrazilian = brazilian;
    }

    @Override
    public String toString() {
        return "EmailInfo{" +
                "domain='" + domain + '\'' +
                ", name='" + name + '\'' +
                ", isBrazilian=" + isBrazilian +
                '}';
    }
}
