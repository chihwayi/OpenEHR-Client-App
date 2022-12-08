package com.openehrmap.petetestcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datastructures.ItemTree;
import java.lang.Long;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-12-06T09:14:40.727564+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.24.0-SNAPSHOT"
)
public class BloodPressure24HourAverageIntervalEvent implements IntervalEventEntity {
  /**
   * Path: petetest/Blood pressure/24 hour average/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: petetest/Blood pressure/24 hour average/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: petetest/Blood pressure/24 hour average/blood pressure
   * Description: @ internal @
   */
  @Path("/data[at0003]")
  private ItemTree bloodPressure;

  /**
   * Path: petetest/Blood pressure/24 hour average/Exertion
   * Description: Details about physical activity undertaken at the time of blood pressure measurement.
   */
  @Path("/state[at0007]/items[at1030]")
  private Cluster exertion;

  /**
   * Path: petetest/Blood pressure/24 hour average/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  /**
   * Path: petetest/Blood pressure/24 hour average/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: petetest/Blood pressure/24 hour average/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setMathFunctionDefiningCode(MathFunction mathFunctionDefiningCode) {
     this.mathFunctionDefiningCode = mathFunctionDefiningCode;
  }

  public MathFunction getMathFunctionDefiningCode() {
     return this.mathFunctionDefiningCode ;
  }

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setBloodPressure(ItemTree bloodPressure) {
     this.bloodPressure = bloodPressure;
  }

  public ItemTree getBloodPressure() {
     return this.bloodPressure ;
  }

  public void setExertion(Cluster exertion) {
     this.exertion = exertion;
  }

  public Cluster getExertion() {
     return this.exertion ;
  }

  public void setSampleCount(Long sampleCount) {
     this.sampleCount = sampleCount;
  }

  public Long getSampleCount() {
     return this.sampleCount ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }
}
