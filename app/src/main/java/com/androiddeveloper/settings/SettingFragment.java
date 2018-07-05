package com.androiddeveloper.settings;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.preference.PreferenceManager;
import android.support.v7.preference.PreferenceScreen;
import android.support.v7.preference.SwitchPreferenceCompat;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by azhar on 3/8/2017.
 */

public class SettingFragment extends PreferenceFragmentCompat implements SharedPreferences.OnSharedPreferenceChangeListener {
      private SharedPreferences preferences;

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.prefere);





        getPreferenceManager().
                findPreference(getResources()
                        .getString(R.string.salary_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

                Toast.makeText(getActivity(),getResources()
                        .getString(R.string.salary_key),Toast.LENGTH_LONG).show();

//                Intent intent = new Intent(getContext(),MainActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);
                return false;
            }
        });


        getPreferenceManager().
                findPreference(getResources()
                        .getString(R.string.job_sector_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

//                Intent intent = new Intent(getContext(),MainActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);

                Toast.makeText(getActivity(),getResources()
                        .getString(R.string.job_sector_key),Toast.LENGTH_LONG).show();
                return false;
            }
        });

        getPreferenceManager().
                findPreference(getResources()
                        .getString(R.string.privacy_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

//                Intent intent = new Intent(getContext(),MainActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);

                Toast.makeText(getActivity(),getResources()
                        .getString(R.string.privacy_key),Toast.LENGTH_LONG).show();
                return false;
            }
        });


        getPreferenceManager().
                findPreference(getResources()
                        .getString(R.string.notification_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

//                Intent intent = new Intent(getContext(),MainActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);

                Toast.makeText(getActivity(),getResources()
                        .getString(R.string.notification_key),Toast.LENGTH_LONG).show();
                return false;
            }
        });



        getPreferenceManager().
                findPreference(getResources()
                        .getString(R.string.terms_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

//                Intent intent = new Intent(getContext(),MainActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);

                Toast.makeText(getActivity(),getResources()
                        .getString(R.string.terms_key),Toast.LENGTH_LONG).show();
                return false;
            }
        });
        getPreferenceManager().
                findPreference(getResources()
                        .getString(R.string.privacy_policy_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

//                Intent intent = new Intent(getContext(),MainActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);

                Toast.makeText(getActivity(),getResources()
                        .getString(R.string.privacy_policy_key),Toast.LENGTH_LONG).show();
                return false;
            }
        });

        getPreferenceManager().
                findPreference(getResources()
                        .getString(R.string.share_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

//                Intent intent = new Intent(getContext(),MainActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);

                Toast.makeText(getActivity(),getResources()
                        .getString(R.string.share_key),Toast.LENGTH_LONG).show();
                return false;
            }
        });

        getPreferenceManager().
                findPreference(getResources()
                        .getString(R.string.delete_account_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

//                Intent intent = new Intent(getContext(),MainActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);

                Toast.makeText(getActivity(),getResources()
                        .getString(R.string.delete_account_key),Toast.LENGTH_LONG).show();
                return false;
            }
        });



        getPreferenceManager().
                findPreference(getResources()
                        .getString(R.string.signout_key)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {

//                Intent intent = new Intent(getContext(),MainActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);

                Toast.makeText(getActivity(),getResources()
                        .getString(R.string.signout_key),Toast.LENGTH_LONG).show();
                return false;
            }
        });



    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
//        Preference pref = findPreference(key);
//        if (pref != null) {
//            if(!(pref instanceof CheckBoxPreference)){
//                String value = sharedPreferences.getString(pref.getKey(),"");
//                setPreferenceSummary(pref,value);
//            }
//        }
//        String locale = this.getResources().getConfiguration().locale.getDisplayName();
////        String LAnglocale = locale.getDefault().getDisplayName();
//        String lan = Locale.getDefault().getDisplayLanguage();
//        String langCode = Locale.getDefault().getLanguage(); //to get usual language code
//
//        System.out.println(lan + "\n" + langCode + "\n" + locale);
//        if (key.equals(getResources().getString(R.string.language_key))) {
//            languagePeference.setSummary(locale);
//        }
//        if (key.equals(getResources().getString(R.string.auto_scan_key))) {
//            boolean test = sharedPreferences.getBoolean(getResources().getString(R.string.auto_scan_key), true);
//            //Do whatever you want here. This is an example.
//            if (test) {
////                testPref.setSummary("Enabled");
//                System.out.println(test);
//            } else {
////                testPref.setSummary("Disabled");
//                System.out.println(test);
//            }
//
//            if (key.equals(getResources().getString(R.string.clear_cache_key))) {
//                boolean clear_cache = sharedPreferences.getBoolean(getResources().getString(R.string.clear_cache_key), true);
//                //Do whatever you want here. This is an example.
//                if (clear_cache) {
////                testPref.setSummary("Enabled");
//                    System.out.println(clear_cache);
//                } else {
////                testPref.setSummary("Disabled");
//                    System.out.println(clear_cache);
//                }
//
//
//            }
//
//        }
    }

//    private void setPreferenceSummary(Preference preference, String value) {
//
//        if(preference instanceof ListPreference){
//            ListPreference listPreference = (ListPreference)preference;
//            int preIndex = listPreference.findIndexOfValue(value);
//            if(preIndex >= 0){
//                listPreference.setSummary(listPreference.getEntries()[preIndex]);
//            }
//        }
//    }

    @Override
    public void onResume() {
        super.onResume();

//        preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
//        boolean clear_cache = preferences.getBoolean(getResources().getString(R.string.clear_cache_key), true);
//        if (clear_cache) {
////                testPref.setSummary("Enabled");
//            System.out.println(clear_cache);
//        } else {
////                testPref.setSummary("Disabled");
//            System.out.println(clear_cache);
//        }
//        boolean test = preferences.getBoolean(getResources().getString(R.string.auto_scan_key), true);
//
//        if (test) {
////            testPref.setSummary("Enabled");
//        } else {
////            testPref.setSummary("Disabled");
//        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);




    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }


}
