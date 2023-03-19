package utils;

import java.io.IOException;
import java.util.Properties;

import com.github.dockerjava.api.model.Config;
import com.google.common.base.MoreObjects.ToStringHelper;

public class ConfigurationSanjib {
	private Properties properties;
    
	public String getProperty(String Key) {
		return properties.getProperty(Key);
	}

	public ConfigurationSanjib() {
		loadProperty();
	}
	public void loadProperty() {
    	properties =new Properties();
    	try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
