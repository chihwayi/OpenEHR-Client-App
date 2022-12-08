package com.openehrmap.petetestcomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-12-06T09:14:40.806574+02:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.24.0-SNAPSHOT"
)
public interface BloodPressureAnyEventChoice {
  Double getDiastolicMagnitude();

  void setDiastolicMagnitude(Double diastolicMagnitude);

  NullFlavour getDiastolicNullFlavourDefiningCode();

  void setDiastolicNullFlavourDefiningCode(NullFlavour diastolicNullFlavourDefiningCode);

  Cluster getExertion();

  void setExertion(Cluster exertion);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  String getDiastolicUnits();

  void setDiastolicUnits(String diastolicUnits);

  String getSystolicUnits();

  void setSystolicUnits(String systolicUnits);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getSystolicNullFlavourDefiningCode();

  void setSystolicNullFlavourDefiningCode(NullFlavour systolicNullFlavourDefiningCode);

  Double getSystolicMagnitude();

  void setSystolicMagnitude(Double systolicMagnitude);
}
