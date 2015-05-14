package org.javaprotrepticon.android.geonamesbrowser;

import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

import org.acra.ACRA;
import org.acra.ACRAConfiguration;
import org.acra.ACRAConfigurationException;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;
import org.javaprotrepticon.android.geonamesbrowser.storage.Storage;
import org.javaprotrepticon.android.geonamesbrowser.storage.model.AlternateName;
import org.javaprotrepticon.android.geonamesbrowser.storage.model.GeoName;
import org.javaprotrepticon.android.geonamesbrowser.storage.model.IsoLanguageCode;

import com.j256.ormlite.table.TableUtils;

import android.app.Application;
import android.os.AsyncTask;

@ReportsCrashes(formKey = "", resToastText = R.string.crash_message) 
public class GeoNamesBrowser extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		initAcra();
		initStorage();
	}
	
	private void initStorage() {
		try {
			PrepareStorage prepareStorage = new PrepareStorage();
			prepareStorage.execute();
			prepareStorage.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	private void initAcra() {
        ACRA.init(this);
        
		ACRAConfiguration configuration = ACRA.getConfig();
		
		try {
			configuration.setFormUri("https://qa.javaprotrepticon.org/report"); 
			configuration.setDisableSSLCertValidation(true); 
			configuration.setSocketTimeout(5000); 
			configuration.setConnectionTimeout(5000); 
			configuration.setMode(ReportingInteractionMode.TOAST);
		} catch (ACRAConfigurationException e) {
			e.printStackTrace();
		}
        
        ACRA.setConfig(configuration); 
	}
	
	public class PrepareStorage extends AsyncTask<Void, Void, Void> {

		@Override
		protected Void doInBackground(Void... params) {
			Storage storage = new Storage(getBaseContext());
			
			try {
				TableUtils.createTableIfNotExists(storage.getConnection(), GeoName.class);
				TableUtils.createTableIfNotExists(storage.getConnection(), AlternateName.class);
				TableUtils.createTableIfNotExists(storage.getConnection(), IsoLanguageCode.class);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			storage.closeConnection();
			
			return null;
		}
		
	}
	
}
