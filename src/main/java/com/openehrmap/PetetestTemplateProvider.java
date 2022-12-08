package com.openehrmap;

import org.ehrbase.test_data.operationaltemplate.OperationalTemplateTestData;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.openehr.schemas.v1.OPERATIONALTEMPLATE;
import org.openehr.schemas.v1.TemplateDocument;
import org.apache.xmlbeans.XmlException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

public class PetetestTemplateProvider implements TemplateProvider {

    @Override
    public Optional<OPERATIONALTEMPLATE> find(String templateId) {
        InputStream stream = getClass().getResourceAsStream("/petetest.opt");
        try{
            TemplateDocument template = TemplateDocument.Factory.parse(stream);
            return Optional.ofNullable(template.getTemplate());
        }
        catch(IOException | XmlException e){
            System.out.println(e);
            return Optional.ofNullable(null);
        }

    }
}
