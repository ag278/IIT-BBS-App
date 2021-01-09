package com.example.iitbbsgymkhana;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

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
        fragmentTransaction.add(R.id.fragment_container, new MainFragment());
        fragmentTransaction.commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.setting_menu, menu);
        return true;
    }




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        drawerLayout.closeDrawer(GravityCompat.START);
        if(menuItem.getItemId() == R.id.home) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new MainFragment());
            fragmentTransaction.commit();
        }


        if(menuItem.getItemId() == R.id.historyocampus) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentHistory());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.iitcampus) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentIITCampus());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.vision) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentVision());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.boardofgov) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentBoardofGov());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.senate) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentSenate());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.reports) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentReports());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.fests) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentFests());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.societies) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentSocieties());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.hostels) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentHostels());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.scholarship) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentScholarship());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.gymkhana) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentGymkhana());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.councellingteam) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentCouncellingTeam());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.convocation) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentConvocation());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.generalinfo) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentGenInfo());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.schools) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentSchools());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.erp) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentERP());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.examination) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentExamination());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.director) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentDirector());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.headofschool) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentHeadofSchool());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.dean) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentDeans());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.profincharge) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentProffInCharge());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.warden) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentWarden());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.faculty) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentFaculty());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.registrat) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentRegistrar());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.staff) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentStaff());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.curriculum) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentCurriculum());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.campusmap) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentCampusMap());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.contactus) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentContactUS());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId() == R.id.creators) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new FragmentCreators());
            fragmentTransaction.commit();
        }

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
            {
                Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT).show();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new FragmentSettings());
                fragmentTransaction.commit();
            }
                return true;
            case R.id.item2:
            {
                Toast.makeText(this, "My profile selected", Toast.LENGTH_SHORT).show();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new FragmentMyProfile());
                fragmentTransaction.commit();
            }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}