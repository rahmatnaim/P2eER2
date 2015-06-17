package my.utm.rmc.p2eer;

/**
 * Created by rahmatnaim on 6/8/15.
 */

public class Guide {
    private String title, thumbnailUrl;
    private String definition;
    private int pid;
    private String requirement;
    private String period;
    private String allocation;
    private String kpi;
    private String howto;
    private String evaluation;
    private String category;

    public Guide() { }
    public Guide(int pid, String title, String definition, String requirement, String period,
                 String allocation, String kpi, String howto, String evaluation, String category,
                 String thumbnailUrl) {
        this.pid = pid;
        this.title = title;
        this.definition = definition;
        this.requirement = requirement;
        this.period = period;
        this.allocation = allocation;
        this.kpi = kpi;
        this.howto = howto;
        this.evaluation = evaluation;
        this.category = category;
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getTitle() { return title; }
    public void setTitle(String name) { this.title = name; }

    public String getThumbnailUrl() { return thumbnailUrl; }
    public void setThumbnailUrl(String thumbnailUrl) { this.thumbnailUrl = thumbnailUrl; }

    public String getDefinition() { return definition;}
    public void setDefinition(String definition) { this.definition = definition; }

    public int getPid() { return pid; }
    public void setPid(int pid) { this.pid = pid; }

    public String getRequirement() { return requirement; }
    public void setRequirement(String requirement) { this.requirement = requirement; }

    public String getPeriod() { return period;}
    public void setPeriod(String period) { this.period = period; }

    public String getAllocation() { return allocation;}
    public void setAllocation(String allocation) { this.allocation = allocation; }

    public String getKpi() { return kpi;}
    public void setKpi(String kpi) { this.kpi = kpi; }

    public String getHowto() { return howto;}
    public void setHowto(String howto) { this.howto = howto; }

    public String getEvaluation() { return evaluation;}
    public void setEvaluation(String evaluation) { this.evaluation = evaluation; }

    public String getCategory() { return category;}
    public void setCategory(String category) { this.category = category; }

}

