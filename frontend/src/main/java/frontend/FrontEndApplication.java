package frontend;

import client.StringJumblerServiceImpl;
import frontend.api.JumblerApi;
import frontend.config.FrontEndConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FrontEndApplication extends Application<FrontEndConfiguration> {
	public static void main(String[] args) throws Exception {
		new FrontEndApplication().run(args);
	}

	@Override
	public void initialize(Bootstrap<FrontEndConfiguration> bootstrap) {
		// TODO Auto-generated method stub
	}

	@Override
	public void run(FrontEndConfiguration configuration, Environment environment)
			throws Exception {
		final JumblerApi api = new JumblerApi(new StringJumblerServiceImpl(), configuration.getName());
		
		environment.jersey().register(api);
	}
}
