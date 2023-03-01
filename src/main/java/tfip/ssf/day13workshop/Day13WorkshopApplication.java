package tfip.ssf.day13workshop;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static tfip.ssf.day13workshop.util.IOUtil.*;

@SpringBootApplication
public class Day13WorkshopApplication {

	private static final Logger logger = LoggerFactory.getLogger(Day13WorkshopApplication.class);

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(Day13WorkshopApplication.class);
		DefaultApplicationArguments appArgs = new DefaultApplicationArguments(args);
		List<String> opsVal = appArgs.getOptionValues("dataDir");
		if( null != opsVal){
			logger.info("" + (String)opsVal.get(0));
			createDir((String)opsVal.get(0));
		} else {
			System.exit(1);
		}

		app.run(args);
	}

}
