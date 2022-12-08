package com.openehrmap;

import com.nedap.archie.rm.RMObject;
import com.openehrmap.petetestcomposition.PetetestComposition;
import com.openehrmap.petetestcomposition.definition.BloodPressure24HourAverageIntervalEvent;
import com.openehrmap.petetestcomposition.definition.BloodPressureObservation;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.flattener.Unflattener;
import org.ehrbase.serialisation.jsonencoding.CanonicalJson;
import org.ehrbase.serialisation.xmlencoding.CanonicalXML;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;

public class App {

    public static void main(String[] args){

        PetetestComposition composition = new PetetestComposition();
        composition.setLanguage(Language.EN);

        BloodPressureObservation bloodPressure = new BloodPressureObservation();
        BloodPressure24HourAverageIntervalEvent n24HourAve = new BloodPressure24HourAverageIntervalEvent();
        n24HourAve.setSampleCount(1000000L);
        bloodPressure.setN24HourAverage(n24HourAve);
        composition.setBloodPressure(bloodPressure);

        TemplateProvider provider = new PetetestTemplateProvider();
        Unflattener unflattener = new Unflattener(provider);
        RMObject rmObject = unflattener.unflatten(composition);

        CanonicalJson canonicalJson = new CanonicalJson();
        CanonicalXML canonicalXML = new CanonicalXML();

        System.out.println(canonicalXML.marshal(rmObject));
    }
}
