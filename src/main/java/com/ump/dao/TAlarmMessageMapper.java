package com.ump.dao;

import com.ump.dao.sqlProvider.TAlarmMessageSqlProvider;
import com.ump.entity.TAlarmMessage;
import com.ump.entity.TAlarmMessageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TAlarmMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    @SelectProvider(type= TAlarmMessageSqlProvider.class, method="countByExample")
    long countByExample(TAlarmMessageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TAlarmMessageSqlProvider.class, method="deleteByExample")
    int deleteByExample(TAlarmMessageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_alarm_message",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_alarm_message (id, park_id, ",
        "park_name, port_id, ",
        "port_name, computer_name, ",
        "online_status, carIn_flow, ",
        "groud_sensor_camera, groud_sensor_banister, ",
        "camera_staus, banister_status, ",
        "alarm_status, alarm_level, ",
        "alarm_time, deal_status, ",
        "user_id, user_name, ",
        "create_time)",
        "values (#{id,jdbcType=INTEGER}, #{parkId,jdbcType=INTEGER}, ",
        "#{parkName,jdbcType=VARCHAR}, #{portId,jdbcType=INTEGER}, ",
        "#{portName,jdbcType=VARCHAR}, #{computerName,jdbcType=VARCHAR}, ",
        "#{onlineStatus,jdbcType=INTEGER}, #{carinFlow,jdbcType=VARCHAR}, ",
        "#{groudSensorCamera,jdbcType=INTEGER}, #{groudSensorBanister,jdbcType=INTEGER}, ",
        "#{cameraStaus,jdbcType=INTEGER}, #{banisterStatus,jdbcType=INTEGER}, ",
        "#{alarmStatus,jdbcType=INTEGER}, #{alarmLevel,jdbcType=INTEGER}, ",
        "#{alarmTime,jdbcType=VARCHAR}, #{dealStatus,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=VARCHAR})"
    })
    int insert(TAlarmMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    @InsertProvider(type=TAlarmMessageSqlProvider.class, method="insertSelective")
    int insertSelective(TAlarmMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    @SelectProvider(type=TAlarmMessageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_name", property="parkName", jdbcType=JdbcType.VARCHAR),
        @Result(column="port_id", property="portId", jdbcType=JdbcType.INTEGER),
        @Result(column="port_name", property="portName", jdbcType=JdbcType.VARCHAR),
        @Result(column="computer_name", property="computerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="online_status", property="onlineStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="carIn_flow", property="carinFlow", jdbcType=JdbcType.VARCHAR),
        @Result(column="groud_sensor_camera", property="groudSensorCamera", jdbcType=JdbcType.INTEGER),
        @Result(column="groud_sensor_banister", property="groudSensorBanister", jdbcType=JdbcType.INTEGER),
        @Result(column="camera_staus", property="cameraStaus", jdbcType=JdbcType.INTEGER),
        @Result(column="banister_status", property="banisterStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="alarm_status", property="alarmStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="alarm_level", property="alarmLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="alarm_time", property="alarmTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="deal_status", property="dealStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR)
    })
    List<TAlarmMessage> selectByExample(TAlarmMessageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, park_id, park_name, port_id, port_name, computer_name, online_status, carIn_flow, ",
        "groud_sensor_camera, groud_sensor_banister, camera_staus, banister_status, alarm_status, ",
        "alarm_level, alarm_time, deal_status, user_id, user_name, create_time",
        "from t_alarm_message",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="park_id", property="parkId", jdbcType=JdbcType.INTEGER),
        @Result(column="park_name", property="parkName", jdbcType=JdbcType.VARCHAR),
        @Result(column="port_id", property="portId", jdbcType=JdbcType.INTEGER),
        @Result(column="port_name", property="portName", jdbcType=JdbcType.VARCHAR),
        @Result(column="computer_name", property="computerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="online_status", property="onlineStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="carIn_flow", property="carinFlow", jdbcType=JdbcType.VARCHAR),
        @Result(column="groud_sensor_camera", property="groudSensorCamera", jdbcType=JdbcType.INTEGER),
        @Result(column="groud_sensor_banister", property="groudSensorBanister", jdbcType=JdbcType.INTEGER),
        @Result(column="camera_staus", property="cameraStaus", jdbcType=JdbcType.INTEGER),
        @Result(column="banister_status", property="banisterStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="alarm_status", property="alarmStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="alarm_level", property="alarmLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="alarm_time", property="alarmTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="deal_status", property="dealStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.VARCHAR)
    })
    TAlarmMessage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TAlarmMessageSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TAlarmMessage record, @Param("example") TAlarmMessageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TAlarmMessageSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TAlarmMessage record, @Param("example") TAlarmMessageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TAlarmMessageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TAlarmMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    @Update({
        "update t_alarm_message",
        "set park_id = #{parkId,jdbcType=INTEGER},",
          "park_name = #{parkName,jdbcType=VARCHAR},",
          "port_id = #{portId,jdbcType=INTEGER},",
          "port_name = #{portName,jdbcType=VARCHAR},",
          "computer_name = #{computerName,jdbcType=VARCHAR},",
          "online_status = #{onlineStatus,jdbcType=INTEGER},",
          "carIn_flow = #{carinFlow,jdbcType=VARCHAR},",
          "groud_sensor_camera = #{groudSensorCamera,jdbcType=INTEGER},",
          "groud_sensor_banister = #{groudSensorBanister,jdbcType=INTEGER},",
          "camera_staus = #{cameraStaus,jdbcType=INTEGER},",
          "banister_status = #{banisterStatus,jdbcType=INTEGER},",
          "alarm_status = #{alarmStatus,jdbcType=INTEGER},",
          "alarm_level = #{alarmLevel,jdbcType=INTEGER},",
          "alarm_time = #{alarmTime,jdbcType=VARCHAR},",
          "deal_status = #{dealStatus,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TAlarmMessage record);
}