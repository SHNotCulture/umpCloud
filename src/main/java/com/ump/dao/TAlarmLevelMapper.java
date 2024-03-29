package com.ump.dao;

import com.ump.dao.sqlProvider.TAlarmLevelSqlProvider;
import com.ump.entity.TAlarmLevel;
import com.ump.entity.TAlarmLevelCriteria;
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

public interface TAlarmLevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_level
     *
     * @mbg.generated
     */
    @SelectProvider(type= TAlarmLevelSqlProvider.class, method="countByExample")
    long countByExample(TAlarmLevelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_level
     *
     * @mbg.generated
     */
    @DeleteProvider(type=TAlarmLevelSqlProvider.class, method="deleteByExample")
    int deleteByExample(TAlarmLevelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_level
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_alarm_level",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_level
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_alarm_level (id, level, ",
        "url)",
        "values (#{id,jdbcType=INTEGER}, #{level,jdbcType=INTEGER}, ",
        "#{url,jdbcType=VARCHAR})"
    })
    int insert(TAlarmLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_level
     *
     * @mbg.generated
     */
    @InsertProvider(type=TAlarmLevelSqlProvider.class, method="insertSelective")
    int insertSelective(TAlarmLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_level
     *
     * @mbg.generated
     */
    @SelectProvider(type=TAlarmLevelSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="level", property="level", jdbcType=JdbcType.INTEGER),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR)
    })
    List<TAlarmLevel> selectByExample(TAlarmLevelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_level
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, level, url",
        "from t_alarm_level",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="level", property="level", jdbcType=JdbcType.INTEGER),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR)
    })
    TAlarmLevel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_level
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TAlarmLevelSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TAlarmLevel record, @Param("example") TAlarmLevelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_level
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TAlarmLevelSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TAlarmLevel record, @Param("example") TAlarmLevelCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_level
     *
     * @mbg.generated
     */
    @UpdateProvider(type=TAlarmLevelSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TAlarmLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alarm_level
     *
     * @mbg.generated
     */
    @Update({
        "update t_alarm_level",
        "set level = #{level,jdbcType=INTEGER},",
          "url = #{url,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TAlarmLevel record);
}