package com.example.iitbbsgymkhana;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.iitbbsgymkhana.ui.FragmentBoardofGov;
import com.example.iitbbsgymkhana.ui.FragmentCampusMap;
import com.example.iitbbsgymkhana.ui.FragmentContactUS;
import com.example.iitbbsgymkhana.ui.FragmentConvocation;
import com.example.iitbbsgymkhana.ui.FragmentCouncellingTeam;
import com.example.iitbbsgymkhana.ui.FragmentCreators;
import com.example.iitbbsgymkhana.ui.FragmentCurriculum;
import com.example.iitbbsgymkhana.ui.FragmentDeans;
import com.example.iitbbsgymkhana.ui.FragmentDirector;
import com.example.iitbbsgymkhana.ui.FragmentERP;
import com.example.iitbbsgymkhana.ui.FragmentExamination;
import com.example.iitbbsgymkhana.ui.FragmentFaculty;
import com.example.iitbbsgymkhana.ui.FragmentFests;
import com.example.iitbbsgymkhana.ui.FragmentGenInfo;
import com.example.iitbbsgymkhana.ui.FragmentGymkhana;
import com.example.iitbbsgymkhana.ui.FragmentHeadofSchool;
import com.example.iitbbsgymkhana.ui.FragmentHistory;
import com.example.iitbbsgymkhana.ui.FragmentHostels;
import com.example.iitbbsgymkhana.ui.FragmentIITCampus;
import com.example.iitbbsgymkhana.ui.FragmentProffInCharge;
import com.example.iitbbsgymkhana.ui.FragmentRegistrar;
import com.example.iitbbsgymkhana.ui.FragmentReports;
import com.example.iitbbsgymkhana.ui.FragmentScholarship;
import com.example.iitbbsgymkhana.ui.FragmentSchools;
import com.example.iitbbsgymkhana.ui.FragmentSenate;
import com.example.iitbbsgymkhana.ui.FragmentSettings;
import com.example.iitbbsgymkhana.ui.FragmentSocieties;
import com.example.iitbbsgymkhana.ui.FragmentStaff;
import com.example.iitbbsgymkhana.ui.FragmentVision;
import com.example.iitbbsgymkhana.ui.FragmentWarden;
import com.example.iitbbsgymkhana.ui.home.HomeFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    Toolbar toolbar;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        //load default fragment
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, new HomeFragment());
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("Home");


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        drawerLayout.closeDrawer(GravityCompat.START);
        if(menuItem.getItemId() == R.id.home) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new HomeFragment());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Home");
        }

        if(menuItem.getItemId() == R.id.setting) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentSettings());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Settings");
        }

        if(menuItem.getItemId() == R.id.historyocampus) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentHistory());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("History of Campus");

        }

        if(menuItem.getItemId() == R.id.iitcampus) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentIITCampus());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("IIT Campus");
        }

        if(menuItem.getItemId() == R.id.vision) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentVision());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Vision");
        }

        if(menuItem.getItemId() == R.id.boardofgov) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentBoardofGov());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Board of Governors");
        }

        if(menuItem.getItemId() == R.id.senate) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentSenate());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Senate");
        }

        if(menuItem.getItemId() == R.id.reports) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentReports());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Reports");
        }

        if(menuItem.getItemId() == R.id.fests) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentFests());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Fests");
        }

        if(menuItem.getItemId() == R.id.societies) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentSocieties());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Societies");
        }

        if(menuItem.getItemId() == R.id.hostels) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentHostels());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Hostels");
        }

        if(menuItem.getItemId() == R.id.scholarship) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentScholarship());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Scholarship");
        }

        if(menuItem.getItemId() == R.id.gymkhana) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentGymkhana());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Gymkhana");
        }

        if(menuItem.getItemId() == R.id.councellingteam) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentCouncellingTeam());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Counselling Team");
        }

        if(menuItem.getItemId() == R.id.convocation) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentConvocation());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Convocation Archive");
        }

        if(menuItem.getItemId() == R.id.generalinfo) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentGenInfo());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("General Info");
        }

        if(menuItem.getItemId() == R.id.schools) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentSchools());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Schools");
        }

        if(menuItem.getItemId() == R.id.erp) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentERP());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("ERP");
        }

        if(menuItem.getItemId() == R.id.examinaion) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentExamination());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Examinations");
        }

        if(menuItem.getItemId() == R.id.director) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentDirector());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Director");
        }

        if(menuItem.getItemId() == R.id.headofschool) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentHeadofSchool());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Head of Schools");
        }

        if(menuItem.getItemId() == R.id.dean) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentDeans());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Deans");
        }

        if(menuItem.getItemId() == R.id.profincharge) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentProffInCharge());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Professors In Charge");
        }

        if(menuItem.getItemId() == R.id.warden) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentWarden());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Warden");
        }

        if(menuItem.getItemId() == R.id.faculty) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentFaculty());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Faculty");
        }

        if(menuItem.getItemId() == R.id.registrat) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentRegistrar());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Registrar");
        }

        if(menuItem.getItemId() == R.id.staff) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentStaff());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Staff");
        }

        if(menuItem.getItemId() == R.id.curriculum) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentCurriculum());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Curriculum");
        }

        if(menuItem.getItemId() == R.id.campusmap) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentCampusMap());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Campus Map");
        }

        if(menuItem.getItemId() == R.id.contactus) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentContactUS());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Contact Us");
        }

        if(menuItem.getItemId() == R.id.creators) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentCreators());
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Creators");
        }

        return true;
    }
}