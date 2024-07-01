package eus.onekin.portfolioscan.etl.load.model;

import com.influxdb.annotations.Column;

import java.time.Instant;

 public abstract  class GeneralMeasurement {

    @Column(timestamp = true)
    private Instant versionTimeStamp;
    @Column(tag = true)
    private String versionName;

     @Column(tag = true)
     private String projectName;

     @Column(tag = true)
     private String projectId;

     protected GeneralMeasurement(Instant versionTimeStamp, String versionName, String projectName, String projectId) {
         this.versionTimeStamp = versionTimeStamp;
         this.versionName = versionName;
         this.projectName = projectName;
         this.projectId = projectId;
     }

     protected  GeneralMeasurement() {
     }

     public Instant getVersionTimeStamp() {
         return versionTimeStamp;
     }

     public void setVersionTimeStamp(Instant versionTimeStamp) {
         this.versionTimeStamp = versionTimeStamp;
     }

     public String getVersionName() {
         return versionName;
     }

     public void setVersionName(String versionName) {
         this.versionName = versionName;
     }

     public String getProjectName() {
         return projectName;
     }

     public void setProjectName(String projectName) {
         this.projectName = projectName;
     }

     public String getProjectId() {
         return projectId;
     }

     public void setProjectId(String projectId) {
         this.projectId = projectId;
     }
 }
