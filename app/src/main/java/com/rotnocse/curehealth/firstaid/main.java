package com.rotnocse.curehealth.firstaid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import com.rotnocse.curehealth.R;

import java.util.ArrayList;

public class main extends Activity {
    private ExpandableListView mExpandableList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        mExpandableList = (ExpandableListView)findViewById(R.id.expandable_list);

        ArrayList<Parent> arrayParents = new ArrayList<Parent>();
        ArrayList<String> arrayChildren = new ArrayList<String>();
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        ArrayList<String> arrayList3 = new ArrayList<String>();
        ArrayList<String> arrayList4 = new ArrayList<String>();

        Parent parent1 = new Parent();
        Parent parent2 = new Parent();
        Parent parent3 = new Parent();
        Parent parent4 = new Parent();
        Parent parent5 = new Parent();
        Parent parent6 = new Parent();
        arrayChildren = new ArrayList<String>();

        parent1.setTitle("First Aid for Severe Bleeding");

        arrayChildren.add("Step 1: Sanitize your hands if you can. If you have them, put on surgical gloves. This will help to prevent infection to the injured person.");
        arrayChildren.add("Step 2: Lay the injured person down flat and elevate the legs or place a pillow under the body so that the trunk is just slightly higher than the head. If the wound is in a limb, elevate the limb.");
        arrayChildren.add("Step 3: Cover the victim with a blanket, if possible, to keep body heat in.");
        arrayChildren.add("Step 4: Remove any debris or dirt from the bleeding area without removing any large chunks that may have caused the damage.");
        arrayChildren.add("Step 5: Apply pressure on the bleeding area to stop severe bleeding. If you have a clean cloth or bandage, use it. Otherwise, use whatever you have, including your hands. Hold the pressure for 20 minutes without checking the status of the bleeding.");
        arrayChildren.add("Step 6: Place a pad over the wound tightly with the edges of the wound held together for a gaping wound. Wrap the wound with a bandage if you have one. If not, use a clean cloth or whatever else you have. Bind it with adhesive tape. Continue to use your hands or whatever else you may have available.");
        arrayChildren.add("Step 7: Add cloths or any other absorbent material you might have if the bleeding does not stop and is coming through the bandage.");
        arrayChildren.add("Step 8: Place an ice pack on the wounded area. This will help to constrict blood vessels, which will help stop bleeding.");
        arrayChildren.add("Step 9: Locate the artery nearest to the wound and apply pressure to it, keeping your fingers flat and against the bone if the bleeding does not stop.");
        arrayChildren.add("Step 10: Get the injured person to the emergency room as quickly as you can when the bleeding has stopped or continue to wait for help to arrive.");
        arrayChildren.add("Source: wikiHow.");
        parent1.setArrayChildren(arrayChildren);
        arrayParents.add(parent1);

        parent2.setTitle("First Aid in Giving CPR");
        arrayList.add("Step 1: Check the victim for unresponsiveness. If the person is not responsive and not breathing or not breathing normally. Call 911 and return to the victim. In most locations the emergency dispatcher can assist you with CPR instructions.");
        arrayList.add("Step 2: If the victim is still not breathing normally, coughing or moving, begin chest compressions.  Push down in the center of the chest 2 inches 30 times. Pump hard and fast at the rate of at least 100/minute, faster than once per second.");
        arrayList.add("Step 3: Tilt the head back and lift the chin. Pinch nose and cover the mouth with yours and blow until you see the chest rise. Give 2 breaths.  Each breath should take 1 second.");
        arrayList.add("Source: Learn CPR!");
        parent2.setArrayChildren(arrayList);
        arrayParents.add(parent2);

        parent3.setTitle("First Aid for Nosebleeding");
        arrayList2.add("Step1: Sit upright and lean forward. By remaining upright, you reduce blood pressure in the veins of your nose. This discourages further bleeding. Sitting forward will help you avoid swallowing blood, which can irritate your stomach.");
        arrayList2.add("Step2: Pinch your nose. Use your thumb and index finger to pinch your nostrils shut. Breathe through your mouth. Continue to pinch for five to 10 minutes. Pinching sends pressure to the bleeding point on the nasal septum and often stops the flow of blood.");
        arrayList2.add("Step3: To prevent re-bleeding, don't pick or blow your nose and don't bend down for several hours after the bleeding episode. During this time remember to keep your head higher than the level of your heart.");
        arrayList2.add("Step4: If re-bleeding occurs, blow out forcefully to clear your nose of blood clots and spray both sides of your nose with a decongestant nasal spray containing oxymetazoline (Afrin, Mucinex Moisture Smart, others). Pinch your nose again as described above and call your doctor.");
        arrayList2.add("Source: MayoClinic ");
        parent3.setArrayChildren(arrayList2);
        arrayParents.add(parent3);

        parent4.setTitle("First Aid for Sprain (R.I.C.E. Method");
        arrayList3.add("Step1: Rest the injured limb. Your doctor may recommend not putting any weight on the injured area for 48 hours. But don't avoid all activity. Even with an ankle sprain, you can usually still exercise other muscles to minimize deconditioning. For example, you can use an exercise bicycle with arm exercise handles, working both your arms and the uninjured leg while resting the injured ankle on another part of the bike. That way you still get three-limb exercise to keep up your cardiovascular conditioning.");
        arrayList3.add("Step2: Ice the area. Use a cold pack, a slush bath or a compression sleeve filled with cold water to help limit swelling after an injury. Try to ice the area as soon as possible after the injury and continue to ice it for 15 to 20 minutes, four to eight times a day, for the first 48 hours or until swelling improves. If you use ice, be careful not to use it too long, as this could cause tissue damage.");
        arrayList3.add("Step3: Compress the area with an elastic wrap or bandage. Compressive wraps or sleeves made from elastic or neoprene are best.");
        arrayList3.add("Step4: Elevate the injured limb above your heart whenever possible to help prevent or limit swelling.");
        arrayList3.add("Source: MayoClinic ");
        parent4.setArrayChildren(arrayList3);
        arrayParents.add(parent4);

        parent5.setTitle("First Aid for Heart Attack");
        arrayList4.add("Step1: Call 911 or your local emergency medical assistance number. Don't tough out the symptoms of a heart attack for more than five minutes. If you don't have access to emergency medical services, have a neighbor or a friend drive you to the nearest hospital. Drive yourself only as a last resort, if there are absolutely no other options, and realize that it places you and others at risk when you drive under these circumstances.");
        arrayList4.add("Step2: Chew and swallow an aspirin, unless you're allergic to aspirin or have been told by your doctor never to take aspirin. But seek emergency help first, such as calling 911.");
        arrayList4.add("Step3: Take nitroglycerin, if prescribed. If you think you're having a heart attack and your doctor has previously prescribed nitroglycerin for you, take it as directed. Do not take anyone else's nitroglycerin, because that could put you in more danger.");
        arrayList4.add("Step4: Begin CPR if the person is unconscious. If you're with a person who might be having a heart attack and he or she is unconscious, tell the 911 dispatcher or another emergency medical specialist. You may be advised to begin cardiopulmonary resuscitation (CPR). If you haven't received CPR training, doctors recommend skipping mouth-to-mouth rescue breathing and performing only chest compressions (about 100 per minute). The dispatcher can instruct you in the proper procedures until help arrives.");
        arrayList4.add("Source: MayoClinic ");
        parent5.setArrayChildren(arrayChildren);
        arrayParents.add(parent5);

        parent6.setTitle("This App is for School Compliance and Requirement Only.");
        arrayParents.add(parent6);

        mExpandableList.setAdapter(new MyCustomAdapter(main.this,arrayParents));

    }

    public void enterInfo(View view) {
        Intent intent = new Intent(this, main.class);
        startActivity(intent);
    }
}