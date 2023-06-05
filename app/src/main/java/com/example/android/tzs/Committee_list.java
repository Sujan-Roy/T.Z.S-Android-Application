package com.example.android.tzs;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.tzs.Arts_facluty_student.Student_list;
import com.example.android.tzs.FunctionMember.Functioning_list;

public class Committee_list extends AppCompatActivity {
 ListView commitee_Member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committee_list);
        commitee_Member = (ListView) findViewById(R.id.listcommittee);
        final String[] nameslist={"President","Vice-Presient","General-Secretary","Joint-Secretry","Organizational-Secretary",
        "Vice-Organizational Secretary","Register-Secretary","Vice-Register-Secretary","Cultural-Sectretary","Woman-Secretary",
        "Finace-Secretary","Vice-Finace Secretary","Felicitation-Secretary","Promoting-Secretary","Vice-Promoting Secretary",
                "Functioning Member"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,nameslist);
        commitee_Member.setAdapter(adapter);

        commitee_Member.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               String item_number=nameslist[position];
                Toast.makeText(Committee_list.this,item_number,Toast.LENGTH_SHORT).show();
                switch (item_number){
                    case "President":
                        Dialog dialog= new Dialog(Committee_list.this);
                        dialog.setContentView(R.layout.president_dialog_box);
                        dialog.show();
                        break;
                    case "Vice-Presient":
                        Dialog dialog_Vice_president = new Dialog(Committee_list.this);
                        dialog_Vice_president.setContentView(R.layout.vice_presient_dialog);
                        dialog_Vice_president.show();
                        break;
                    case "General-Secretary":
                        Dialog dialog_secretary=new Dialog(Committee_list.this);
                        dialog_secretary.setContentView(R.layout.secretary_dialog_box);
                        dialog_secretary.show();
                        break;
                    case "Joint-Secretry":
                        Dialog dialog_jointsecretary=new Dialog(Committee_list.this);
                        dialog_jointsecretary.setContentView(R.layout.joint_secretary_dialog);
                        dialog_jointsecretary.show();
                        break;
                    case "Organizational-Secretary":
                        Dialog dialog_organis_secretary = new Dialog(Committee_list.this);
                        dialog_organis_secretary.setContentView(R.layout.organizational_secretary_dialog);
                        dialog_organis_secretary.show();
                        break;
                    case "Vice-Organizational Secretary":
                        Dialog dialog_Viceorganise = new Dialog(Committee_list.this);
                        dialog_Viceorganise.setContentView(R.layout.vic_organizational_dialog);
                        dialog_Viceorganise.show();
                        break;
                    case "Register-Secretary":
                        Dialog dialog_register = new Dialog(Committee_list.this);
                        dialog_register.setContentView(R.layout.register_secretary_dialog);
                        dialog_register.show();
                        break;
                    case "Vice-Register-Secretary":
                        Dialog dialog_vice_register = new Dialog(Committee_list.this);
                        dialog_vice_register.setContentView(R.layout.vice_register_secretary_dialog);
                        dialog_vice_register.show();
                        break;
                    case "Cultural-Sectretary":
                        Dialog dialog_culture_secretary = new Dialog(Committee_list.this);
                        dialog_culture_secretary.setContentView(R.layout.cultural_sectretary_dialog);
                        dialog_culture_secretary.show();
                        break;
                    case "Woman-Secretary":
                        Dialog dialog_woman_secretary = new Dialog(Committee_list.this);
                        dialog_woman_secretary.setContentView(R.layout.woman_secretary_dialog);
                        dialog_woman_secretary.show();
                        break;
                    case "Finace-Secretary":
                        Dialog dialog_finace_secretary = new Dialog(Committee_list.this);
                        dialog_finace_secretary.setContentView(R.layout.finace_secretary_dialog);
                        dialog_finace_secretary.show();
                        break;
                    case "Vice-Finace Secretary":
                        Dialog dialog_vice_fin_secretary = new Dialog(Committee_list.this);
                        dialog_vice_fin_secretary.setContentView(R.layout.vice_finace_secretary_dialog);
                        dialog_vice_fin_secretary.show();
                        break;
                    case "Felicitation-Secretary":
                        Dialog dialog_feliction_secretary = new Dialog(Committee_list.this);
                        dialog_feliction_secretary.setContentView(R.layout.felicitation_secretary_dialog);
                        dialog_feliction_secretary.show();
                        break;
                    case "Promoting-Secretary":
                        Dialog dialog_promot_secretary = new Dialog(Committee_list.this);
                        dialog_promot_secretary.setContentView(R.layout.promoting_secretary_dialog);
                        dialog_promot_secretary.show();
                        break;
                    case "Vice-Promoting Secretary":
                        Dialog dialog_vice_prom_dialog = new Dialog(Committee_list.this);
                        dialog_vice_prom_dialog.setContentView(R.layout.vice_promoting_secretary_dialog);
                        dialog_vice_prom_dialog.show();
                        break;
                    case "Functioning Member":
                        Intent intent_Member = new Intent(Committee_list.this, Functioning_list.class);
                        startActivity(intent_Member);
                        break;
                    default:
                        Dialog Error = new Dialog(Committee_list.this);
                        Error.setTitle("Please Choose Correct Option");
                        Error.show();
                        break;







                }
              /*  if(item_number=="President"){
                    Dialog dialog= new Dialog(Committee_list.this);
                    dialog.setContentView(R.layout.president_dialog_box);
                    dialog.show();

                }*/
            }
        });

    }
}
