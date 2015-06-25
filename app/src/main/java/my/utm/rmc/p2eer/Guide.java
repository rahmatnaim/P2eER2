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
    private String bengkelOs;
    private String meetingOs;
    private String bengkelLocal;
    private String meetingLocal;
    private String activityFunding;
    private String activitySource;
    private String activityUmum;
    private String reportDev;
    private String reportFinal;
    private String vsiriTransfer;
    private String saluranPantau;
    private String lanjutTempoh;
    private String methodPantau;

    public Guide() { }
    public Guide(int pid, String title, String definition, String requirement, String period,
                 String allocation, String kpi, String howto, String evaluation, String category,
                 String thumbnailUrl, String bengkelOs, String meetingOs, String bengkelLocal,
                 String meetingLocal, String activityFunding, String activitySource, String activityUmum) {
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
        this.bengkelOs = bengkelOs;
        this.meetingOs = meetingOs;
        this.bengkelLocal = bengkelLocal;
        this.meetingLocal = meetingLocal;
        this.activityFunding = activityFunding;
        this.activitySource = activitySource;
        this.activityUmum = activityUmum;
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


    public String getBengkelOs() {
        return bengkelOs;
    }

    public void setBengkelOs(String bengkelOs) {
        this.bengkelOs = bengkelOs;
    }

    public String getMeetingOs() {
        return meetingOs;
    }

    public void setMeetingOs(String meetingOs) {
        this.meetingOs = meetingOs;
    }

    public String getBengkelLocal() {
        return bengkelLocal;
    }

    public void setBengkelLocal(String bengkelLocal) {
        this.bengkelLocal = bengkelLocal;
    }

    public String getMeetingLocal() {
        return meetingLocal;
    }

    public void setMeetingLocal(String meetingLocal) {
        this.meetingLocal = meetingLocal;
    }

    public String getActivityFunding() {
        return activityFunding;
    }

    public void setActivityFunding(String activityFunding) {
        this.activityFunding = activityFunding;
    }

    public String getActivitySource() {
        return activitySource;
    }

    public void setActivitySource(String activitySource) {
        this.activitySource = activitySource;
    }

    public String getActivityUmum() {
        return activityUmum;
    }

    public void setActivityUmum(String activityUmum) {
        this.activityUmum = activityUmum;
    }

    public String getMethodPantau() {
        return methodPantau;
    }

    public void setMethodPantau(String methodPantau) {
        this.methodPantau = methodPantau;
    }

    public String getLanjutTempoh() {
        return lanjutTempoh;
    }

    public void setLanjutTempoh(String lanjutTempoh) {
        this.lanjutTempoh = lanjutTempoh;
    }

    public String getSaluranPantau() {
        return saluranPantau;
    }

    public void setSaluranPantau(String saluranPantau) {
        this.saluranPantau = saluranPantau;
    }

    public String getVsiriTransfer() {
        return vsiriTransfer;
    }

    public void setVsiriTransfer(String vsiriTransfer) {
        this.vsiriTransfer = vsiriTransfer;
    }

    public String getReportFinal() {
        return reportFinal;
    }

    public void setReportFinal(String reportFinal) {
        this.reportFinal = reportFinal;
    }

    public String getReportDev() {
        return reportDev;
    }

    public void setReportDev(String reportDev) {
        this.reportDev = reportDev;
    }
}

