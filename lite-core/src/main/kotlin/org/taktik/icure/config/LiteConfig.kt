package org.taktik.icure.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Profile("app")
@Configuration
class LiteConfig {

	@Value("\${icure.model.useCardinalDataModel:false}")
	var useCardinalDataModel: Boolean = false

}