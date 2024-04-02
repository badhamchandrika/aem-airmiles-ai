package ai.aem.airmiles.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.cq.export.json.ExporterConstants;
import com.fasterxml.jackson.annotation.JsonInclude;

import ai.aem.airmiles.core.models.componentelements.CTAModel;
import lombok.Getter;

@Model(
		adaptables = SlingHttpServletRequest.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
		resourceType = "airmiles-ai/components/hero"
)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HeroModel {		
	
	@Getter
	@ValueMapValue
	private String headerText;
	
	@Getter
	@ValueMapValue
	private String midText;	
	
	@Getter
	@ValueMapValue
	private String backgroundImage;
	
	@Getter
	@ValueMapValue
	private String backgroundImageAltText;
	
	@Getter
	@ValueMapValue
	private String productImage;
	
	@Getter
	@ValueMapValue
	private String productImageAltText;
	
	@Getter
	@ValueMapValue
	private String alignment;
	
	@Getter
	@ValueMapValue
	private String cssClass;
	
	@Getter
	@ChildResource
	private CTAModel cta;
}
