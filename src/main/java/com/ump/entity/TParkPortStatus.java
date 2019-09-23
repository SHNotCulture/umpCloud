package com.ump.entity;

public class TParkPortStatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.park_id
     *
     * @mbg.generated
     */
    private Integer parkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.park_name
     *
     * @mbg.generated
     */
    private String parkName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.port_id
     *
     * @mbg.generated
     */
    private Integer portId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.port_name
     *
     * @mbg.generated
     */
    private String portName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.computer_name
     *
     * @mbg.generated
     */
    private String computerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.id_address
     *
     * @mbg.generated
     */
    private String idAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.online_status
     *
     * @mbg.generated
     */
    private Integer onlineStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.carIn_flow
     *
     * @mbg.generated
     */
    private String carinFlow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.groud_sensor_camera
     *
     * @mbg.generated
     */
    private Integer groudSensorCamera;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.groud_sensor_banister
     *
     * @mbg.generated
     */
    private Integer groudSensorBanister;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.camera_staus
     *
     * @mbg.generated
     */
    private Integer cameraStaus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.banister_status
     *
     * @mbg.generated
     */
    private Integer banisterStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.alarm_status
     *
     * @mbg.generated
     */
    private Integer alarmStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.camera_carplate
     *
     * @mbg.generated
     */
    private String cameraCarplate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_park_port_status.camera_url
     *
     * @mbg.generated
     */
    private String cameraUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.id
     *
     * @return the value of t_park_port_status.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.id
     *
     * @param id the value for t_park_port_status.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.park_id
     *
     * @return the value of t_park_port_status.park_id
     *
     * @mbg.generated
     */
    public Integer getParkId() {
        return parkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.park_id
     *
     * @param parkId the value for t_park_port_status.park_id
     *
     * @mbg.generated
     */
    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.park_name
     *
     * @return the value of t_park_port_status.park_name
     *
     * @mbg.generated
     */
    public String getParkName() {
        return parkName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.park_name
     *
     * @param parkName the value for t_park_port_status.park_name
     *
     * @mbg.generated
     */
    public void setParkName(String parkName) {
        this.parkName = parkName == null ? null : parkName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.port_id
     *
     * @return the value of t_park_port_status.port_id
     *
     * @mbg.generated
     */
    public Integer getPortId() {
        return portId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.port_id
     *
     * @param portId the value for t_park_port_status.port_id
     *
     * @mbg.generated
     */
    public void setPortId(Integer portId) {
        this.portId = portId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.port_name
     *
     * @return the value of t_park_port_status.port_name
     *
     * @mbg.generated
     */
    public String getPortName() {
        return portName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.port_name
     *
     * @param portName the value for t_park_port_status.port_name
     *
     * @mbg.generated
     */
    public void setPortName(String portName) {
        this.portName = portName == null ? null : portName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.computer_name
     *
     * @return the value of t_park_port_status.computer_name
     *
     * @mbg.generated
     */
    public String getComputerName() {
        return computerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.computer_name
     *
     * @param computerName the value for t_park_port_status.computer_name
     *
     * @mbg.generated
     */
    public void setComputerName(String computerName) {
        this.computerName = computerName == null ? null : computerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.id_address
     *
     * @return the value of t_park_port_status.id_address
     *
     * @mbg.generated
     */
    public String getIdAddress() {
        return idAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.id_address
     *
     * @param idAddress the value for t_park_port_status.id_address
     *
     * @mbg.generated
     */
    public void setIdAddress(String idAddress) {
        this.idAddress = idAddress == null ? null : idAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.online_status
     *
     * @return the value of t_park_port_status.online_status
     *
     * @mbg.generated
     */
    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.online_status
     *
     * @param onlineStatus the value for t_park_port_status.online_status
     *
     * @mbg.generated
     */
    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.carIn_flow
     *
     * @return the value of t_park_port_status.carIn_flow
     *
     * @mbg.generated
     */
    public String getCarinFlow() {
        return carinFlow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.carIn_flow
     *
     * @param carinFlow the value for t_park_port_status.carIn_flow
     *
     * @mbg.generated
     */
    public void setCarinFlow(String carinFlow) {
        this.carinFlow = carinFlow == null ? null : carinFlow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.groud_sensor_camera
     *
     * @return the value of t_park_port_status.groud_sensor_camera
     *
     * @mbg.generated
     */
    public Integer getGroudSensorCamera() {
        return groudSensorCamera;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.groud_sensor_camera
     *
     * @param groudSensorCamera the value for t_park_port_status.groud_sensor_camera
     *
     * @mbg.generated
     */
    public void setGroudSensorCamera(Integer groudSensorCamera) {
        this.groudSensorCamera = groudSensorCamera;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.groud_sensor_banister
     *
     * @return the value of t_park_port_status.groud_sensor_banister
     *
     * @mbg.generated
     */
    public Integer getGroudSensorBanister() {
        return groudSensorBanister;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.groud_sensor_banister
     *
     * @param groudSensorBanister the value for t_park_port_status.groud_sensor_banister
     *
     * @mbg.generated
     */
    public void setGroudSensorBanister(Integer groudSensorBanister) {
        this.groudSensorBanister = groudSensorBanister;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.camera_staus
     *
     * @return the value of t_park_port_status.camera_staus
     *
     * @mbg.generated
     */
    public Integer getCameraStaus() {
        return cameraStaus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.camera_staus
     *
     * @param cameraStaus the value for t_park_port_status.camera_staus
     *
     * @mbg.generated
     */
    public void setCameraStaus(Integer cameraStaus) {
        this.cameraStaus = cameraStaus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.banister_status
     *
     * @return the value of t_park_port_status.banister_status
     *
     * @mbg.generated
     */
    public Integer getBanisterStatus() {
        return banisterStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.banister_status
     *
     * @param banisterStatus the value for t_park_port_status.banister_status
     *
     * @mbg.generated
     */
    public void setBanisterStatus(Integer banisterStatus) {
        this.banisterStatus = banisterStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.alarm_status
     *
     * @return the value of t_park_port_status.alarm_status
     *
     * @mbg.generated
     */
    public Integer getAlarmStatus() {
        return alarmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.alarm_status
     *
     * @param alarmStatus the value for t_park_port_status.alarm_status
     *
     * @mbg.generated
     */
    public void setAlarmStatus(Integer alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.camera_carplate
     *
     * @return the value of t_park_port_status.camera_carplate
     *
     * @mbg.generated
     */
    public String getCameraCarplate() {
        return cameraCarplate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.camera_carplate
     *
     * @param cameraCarplate the value for t_park_port_status.camera_carplate
     *
     * @mbg.generated
     */
    public void setCameraCarplate(String cameraCarplate) {
        this.cameraCarplate = cameraCarplate == null ? null : cameraCarplate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_park_port_status.camera_url
     *
     * @return the value of t_park_port_status.camera_url
     *
     * @mbg.generated
     */
    public String getCameraUrl() {
        return cameraUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_park_port_status.camera_url
     *
     * @param cameraUrl the value for t_park_port_status.camera_url
     *
     * @mbg.generated
     */
    public void setCameraUrl(String cameraUrl) {
        this.cameraUrl = cameraUrl == null ? null : cameraUrl.trim();
    }
}