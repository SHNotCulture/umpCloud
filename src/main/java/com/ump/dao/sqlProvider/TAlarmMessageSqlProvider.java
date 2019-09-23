package com.ump.dao.sqlProvider;

import com.ump.entity.TAlarmMessage;
import com.ump.entity.TAlarmMessageCriteria.Criteria;
import com.ump.entity.TAlarmMessageCriteria.Criterion;
import com.ump.entity.TAlarmMessageCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TAlarmMessageSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    public String countByExample(TAlarmMessageCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_alarm_message");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    public String deleteByExample(TAlarmMessageCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_alarm_message");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    public String insertSelective(TAlarmMessage record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_alarm_message");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.VALUES("park_id", "#{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getParkName() != null) {
            sql.VALUES("park_name", "#{parkName,jdbcType=VARCHAR}");
        }
        
        if (record.getPortId() != null) {
            sql.VALUES("port_id", "#{portId,jdbcType=INTEGER}");
        }
        
        if (record.getPortName() != null) {
            sql.VALUES("port_name", "#{portName,jdbcType=VARCHAR}");
        }
        
        if (record.getComputerName() != null) {
            sql.VALUES("computer_name", "#{computerName,jdbcType=VARCHAR}");
        }
        
        if (record.getOnlineStatus() != null) {
            sql.VALUES("online_status", "#{onlineStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCarinFlow() != null) {
            sql.VALUES("carIn_flow", "#{carinFlow,jdbcType=VARCHAR}");
        }
        
        if (record.getGroudSensorCamera() != null) {
            sql.VALUES("groud_sensor_camera", "#{groudSensorCamera,jdbcType=INTEGER}");
        }
        
        if (record.getGroudSensorBanister() != null) {
            sql.VALUES("groud_sensor_banister", "#{groudSensorBanister,jdbcType=INTEGER}");
        }
        
        if (record.getCameraStaus() != null) {
            sql.VALUES("camera_staus", "#{cameraStaus,jdbcType=INTEGER}");
        }
        
        if (record.getBanisterStatus() != null) {
            sql.VALUES("banister_status", "#{banisterStatus,jdbcType=INTEGER}");
        }
        
        if (record.getAlarmStatus() != null) {
            sql.VALUES("alarm_status", "#{alarmStatus,jdbcType=INTEGER}");
        }
        
        if (record.getAlarmLevel() != null) {
            sql.VALUES("alarm_level", "#{alarmLevel,jdbcType=INTEGER}");
        }
        
        if (record.getAlarmTime() != null) {
            sql.VALUES("alarm_time", "#{alarmTime,jdbcType=VARCHAR}");
        }
        
        if (record.getDealStatus() != null) {
            sql.VALUES("deal_status", "#{dealStatus,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserName() != null) {
            sql.VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    public String selectByExample(TAlarmMessageCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("park_id");
        sql.SELECT("park_name");
        sql.SELECT("port_id");
        sql.SELECT("port_name");
        sql.SELECT("computer_name");
        sql.SELECT("online_status");
        sql.SELECT("carIn_flow");
        sql.SELECT("groud_sensor_camera");
        sql.SELECT("groud_sensor_banister");
        sql.SELECT("camera_staus");
        sql.SELECT("banister_status");
        sql.SELECT("alarm_status");
        sql.SELECT("alarm_level");
        sql.SELECT("alarm_time");
        sql.SELECT("deal_status");
        sql.SELECT("user_id");
        sql.SELECT("user_name");
        sql.SELECT("create_time");
        sql.FROM("t_alarm_message");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TAlarmMessage record = (TAlarmMessage) parameter.get("record");
        TAlarmMessageCriteria example = (TAlarmMessageCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_alarm_message");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        }
        
        if (record.getParkName() != null) {
            sql.SET("park_name = #{record.parkName,jdbcType=VARCHAR}");
        }
        
        if (record.getPortId() != null) {
            sql.SET("port_id = #{record.portId,jdbcType=INTEGER}");
        }
        
        if (record.getPortName() != null) {
            sql.SET("port_name = #{record.portName,jdbcType=VARCHAR}");
        }
        
        if (record.getComputerName() != null) {
            sql.SET("computer_name = #{record.computerName,jdbcType=VARCHAR}");
        }
        
        if (record.getOnlineStatus() != null) {
            sql.SET("online_status = #{record.onlineStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCarinFlow() != null) {
            sql.SET("carIn_flow = #{record.carinFlow,jdbcType=VARCHAR}");
        }
        
        if (record.getGroudSensorCamera() != null) {
            sql.SET("groud_sensor_camera = #{record.groudSensorCamera,jdbcType=INTEGER}");
        }
        
        if (record.getGroudSensorBanister() != null) {
            sql.SET("groud_sensor_banister = #{record.groudSensorBanister,jdbcType=INTEGER}");
        }
        
        if (record.getCameraStaus() != null) {
            sql.SET("camera_staus = #{record.cameraStaus,jdbcType=INTEGER}");
        }
        
        if (record.getBanisterStatus() != null) {
            sql.SET("banister_status = #{record.banisterStatus,jdbcType=INTEGER}");
        }
        
        if (record.getAlarmStatus() != null) {
            sql.SET("alarm_status = #{record.alarmStatus,jdbcType=INTEGER}");
        }
        
        if (record.getAlarmLevel() != null) {
            sql.SET("alarm_level = #{record.alarmLevel,jdbcType=INTEGER}");
        }
        
        if (record.getAlarmTime() != null) {
            sql.SET("alarm_time = #{record.alarmTime,jdbcType=VARCHAR}");
        }
        
        if (record.getDealStatus() != null) {
            sql.SET("deal_status = #{record.dealStatus,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserName() != null) {
            sql.SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_alarm_message");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("park_id = #{record.parkId,jdbcType=INTEGER}");
        sql.SET("park_name = #{record.parkName,jdbcType=VARCHAR}");
        sql.SET("port_id = #{record.portId,jdbcType=INTEGER}");
        sql.SET("port_name = #{record.portName,jdbcType=VARCHAR}");
        sql.SET("computer_name = #{record.computerName,jdbcType=VARCHAR}");
        sql.SET("online_status = #{record.onlineStatus,jdbcType=INTEGER}");
        sql.SET("carIn_flow = #{record.carinFlow,jdbcType=VARCHAR}");
        sql.SET("groud_sensor_camera = #{record.groudSensorCamera,jdbcType=INTEGER}");
        sql.SET("groud_sensor_banister = #{record.groudSensorBanister,jdbcType=INTEGER}");
        sql.SET("camera_staus = #{record.cameraStaus,jdbcType=INTEGER}");
        sql.SET("banister_status = #{record.banisterStatus,jdbcType=INTEGER}");
        sql.SET("alarm_status = #{record.alarmStatus,jdbcType=INTEGER}");
        sql.SET("alarm_level = #{record.alarmLevel,jdbcType=INTEGER}");
        sql.SET("alarm_time = #{record.alarmTime,jdbcType=VARCHAR}");
        sql.SET("deal_status = #{record.dealStatus,jdbcType=INTEGER}");
        sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        sql.SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=VARCHAR}");
        
        TAlarmMessageCriteria example = (TAlarmMessageCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TAlarmMessage record) {
        SQL sql = new SQL();
        sql.UPDATE("t_alarm_message");
        
        if (record.getParkId() != null) {
            sql.SET("park_id = #{parkId,jdbcType=INTEGER}");
        }
        
        if (record.getParkName() != null) {
            sql.SET("park_name = #{parkName,jdbcType=VARCHAR}");
        }
        
        if (record.getPortId() != null) {
            sql.SET("port_id = #{portId,jdbcType=INTEGER}");
        }
        
        if (record.getPortName() != null) {
            sql.SET("port_name = #{portName,jdbcType=VARCHAR}");
        }
        
        if (record.getComputerName() != null) {
            sql.SET("computer_name = #{computerName,jdbcType=VARCHAR}");
        }
        
        if (record.getOnlineStatus() != null) {
            sql.SET("online_status = #{onlineStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCarinFlow() != null) {
            sql.SET("carIn_flow = #{carinFlow,jdbcType=VARCHAR}");
        }
        
        if (record.getGroudSensorCamera() != null) {
            sql.SET("groud_sensor_camera = #{groudSensorCamera,jdbcType=INTEGER}");
        }
        
        if (record.getGroudSensorBanister() != null) {
            sql.SET("groud_sensor_banister = #{groudSensorBanister,jdbcType=INTEGER}");
        }
        
        if (record.getCameraStaus() != null) {
            sql.SET("camera_staus = #{cameraStaus,jdbcType=INTEGER}");
        }
        
        if (record.getBanisterStatus() != null) {
            sql.SET("banister_status = #{banisterStatus,jdbcType=INTEGER}");
        }
        
        if (record.getAlarmStatus() != null) {
            sql.SET("alarm_status = #{alarmStatus,jdbcType=INTEGER}");
        }
        
        if (record.getAlarmLevel() != null) {
            sql.SET("alarm_level = #{alarmLevel,jdbcType=INTEGER}");
        }
        
        if (record.getAlarmTime() != null) {
            sql.SET("alarm_time = #{alarmTime,jdbcType=VARCHAR}");
        }
        
        if (record.getDealStatus() != null) {
            sql.SET("deal_status = #{dealStatus,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserName() != null) {
            sql.SET("user_name = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_message
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TAlarmMessageCriteria example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}