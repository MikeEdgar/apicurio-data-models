package io.apicurio.datamodels.asyncapi.v2.models;

import java.util.LinkedHashMap;
import java.util.List;

import io.apicurio.datamodels.asyncapi.models.AaiComponents;
import io.apicurio.datamodels.asyncapi.models.AaiCorrelationId;
import io.apicurio.datamodels.asyncapi.models.AaiMessage;
import io.apicurio.datamodels.asyncapi.models.AaiParameter;
import io.apicurio.datamodels.asyncapi.models.AaiSecurityScheme;
import io.apicurio.datamodels.asyncapi.models.IAaiTrait;
import io.apicurio.datamodels.asyncapi.v2.visitors.IAai20Visitor;
import io.apicurio.datamodels.compat.JsonCompat;
import io.apicurio.datamodels.core.models.Node;
import io.apicurio.datamodels.core.visitors.IVisitor;

/**
 * @author Jakub Senko <jsenko@redhat.com>
 */
public class Aai20Components extends AaiComponents {

    /**
     * Constructor.
     */
    public Aai20Components() {
    }

    public Aai20Components(Node parent) {
        super(parent);
    }

    @Override
    public void accept(IVisitor visitor) {
        IAai20Visitor v = (IAai20Visitor) visitor;
        v.visitComponents(this);
    }

    @Override
    public List<AaiMessage> getMessagesList() {
        return JsonCompat.mapToList(messages);
    }

    @Override
    public List<AaiSecurityScheme> getSecuritySchemesList() {
        return JsonCompat.mapToList(securitySchemes);
    }

    @Override
    public List<AaiParameter> getParametersList() {
        return JsonCompat.mapToList(parameters);
    }

    @Override
    public List<AaiCorrelationId> getCorrelationIdsList() {
        return JsonCompat.mapToList(correlationIds);
    }

    @Override
    public List<IAaiTrait> getTraitsList() {
        return JsonCompat.mapToList(traits);
    }

    @Override
    public void addSchema(String key, Object value) {
        if(schemas == null)
            schemas = new LinkedHashMap<>();
        schemas.put(key, value);
    }

    @Override
    public void addMessage(String key, AaiMessage value) {
        if(messages == null)
            messages = new LinkedHashMap<>();
        messages.put(key, value);
    }

    @Override
    public void addSecurityScheme(String key, AaiSecurityScheme value) {
        if(securitySchemes == null)
            securitySchemes = new LinkedHashMap<>();
        securitySchemes.put(key, value);
    }

    @Override
    public void addParameter(String key, AaiParameter value) {
        if(parameters == null)
            parameters = new LinkedHashMap<>();
        parameters.put(key, value);
    }

    @Override
    public void addCorrelationId(String key, AaiCorrelationId value) {
        if(correlationIds == null)
            correlationIds = new LinkedHashMap<>();
        correlationIds.put(key, value);
    }
    
    @Override
    public void addTrait(String key, IAaiTrait value) {
        if(traits == null)
            traits = new LinkedHashMap<>();
        traits.put(key, value);
    }
}