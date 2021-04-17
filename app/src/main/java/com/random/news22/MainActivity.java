package com.random.news22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mrecyclerview;
    Adapter madapter;
    TextView All;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        All = (TextView)findViewById(R.id.all);
        mrecyclerview = findViewById(R.id.recyclerview);
       mrecyclerview.setLayoutManager(new LinearLayoutManager(this));
LinearLayoutManager layoutManager = new LinearLayoutManager(this);
layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
mrecyclerview.setLayoutManager(layoutManager);
        All.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent all = new Intent(MainActivity.this,route.class);
                startActivity(all);

            }
        });

      /*  GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        mrecyclerview.setLayoutManager(gridLayoutManager);*/

        madapter = new Adapter(this,getmyList());
        mrecyclerview.setAdapter(madapter);
        }

        private ArrayList<Model>getmyList(){
        ArrayList<Model>models = new ArrayList<>();


        Model m = new Model();
        m.setTitle("Google is redefining mobile with artificial intelligence");
        m.setImage(R.drawable.imagees);
        m.setDescription("Some experts believe that Apple wouldn’t take such steps.The Realme 8 5G bearing model designation RMX3241 bagged NBTC certification last week, and now it has been certified by FCC as well, moving it a step closer to the launch. The FCC listing reveals that the Realme 8 5G will pack a 5,000 mAh battery...Oppo has been spewing Reno phones left and right and even if the full Reno5 lineup is not complete yet, the Reno 6 is already appearing on the horizon. Multiple leaks have revealed a new Oppo PEPM00 phone is in the works, and a screenshot...");
        models.add(m);

            m= new Model();
            m.setTitle("BJP Chief JP Nadda releases party's manifesto for Assam, makes 10 commitments");
            m.setImage(R.drawable.imageees);
            m.setDescription("BJP Chief JP Nadda releases party's manifesto for Assam, makes 10 commitments BJP Discussion BJP Chief JP Nadda releases party's manifesto for Assam, makes 10 commitmentsUnion Minister Hardeep Singh Puri quote tweeted the statement by the MEA and clarified, “The reformist legislation relating to agricultural sector were passed by India's parliament after full debate & discussion. The govt has already held 11 rounds of talks with some farmers who expressed their reservations about the laws.”\n" +
                    "\n" +
                    "“It is unfortunate to see vested interest groups trying to derail the process and protests by enforcing their agenda. We saw this on Republic Day and are seeing it again when some public figures are making statements without ascertaining facts and proper understanding of issues,” the minister added.\n" +
                    "\n" +
                    "Minister of State for Youth Affairs and Sports Kiren Rijiju said, “For 1000 of years India was defeated, occupied, looted & ruled by the invaders not because India was weak but there was always a Jaichand. We need to ask who’s behind this international propaganda to defame India, the minister added.");
            models.add(m);


            m = new Model();
            m.setTitle("Cheteshwar Pujara was spotted hitting sixes against Deepak Chahar and Karn Sharma");
            m.setImage(R.drawable.iimage);
            m.setDescription("Known as a Test specialist, Pujara had missed out on IPL contracts in the recent past. However, Chennai Super Kings snapped him up at the IPL 2021 auction in February at his base price of Rs 50 lakh. While questions are being asked if Pujara would be able to find a spot in the CSK XI, the India star is certainly answering them with his approach in the training sessions.\n" +
                    "\n" +
                    "On Tuesday, Cheteshwar Pujara was seen hitting the balls into the stands at ease during a practice session with the CSK. In a video clip going viral on social media, Pujara can be spotted taking the attack to the likes of Deepak Chahar and Karn Sharma.\n" +
                    "\n" +
                    "Pujara can be seen batting with a remodelled stance as he hits on the up against the CSK bowlers. Pujara was seen playing a slog sweep against Karn Sharma and he even danced down the track to hit a left-arm spinner into the stands. Pujara had no intention of keeping the ball down the ground, contrary to his approach in Test cricket.");
            models.add(m);


            m = new Model();
            m.setTitle("Bengaluru: Influencer Hitesha Chandranee booked for assaulting Zomato worker Kamaraj");
            m.setImage(R.drawable.iiimage);
            m.setDescription("he Bengaluru police have booked model and influencer Hitesha Chandranee, who had accused a Zomato delivery person of hitting her, for assault.\n" +
                    "\n" +
                    "An FIR has been filed against Hitesha Chandranee based on a complaint by the Zomato employee Kamaraj.\n" +
                    "\n" +
                    "She has been accused of wrongful restraint, assault, intentional insult and criminal intimidation.\n" +
                    "\n" +
                    "A video of Hitesha alleging that she had been assaulted by a Zomato employee over delayed delivery had gone viral on social media on March 9.According to her, Kamaraj had gotten violent after he had delayed her food delivery and she had complained about it to Zomato customer care and asked him to take the order back.\n" +
                    "\n" +
                    "An FIR was filed against Kamaraj for assaulting the Instagram model.\n" +
                    "\n" +
                    "A day later, the delivery person Kamaraj, who was suspended by Zomato, shared his version of events. According to him, Hitesha had hit him with a slipper, hurled abuses at him and tried to punch him when she accidentally hurt herself.\n" +
                    "\n" +
                    "Zomato, which had initially assured Hitesha Chandranee that it would help her with the police investigation along with assistance on the medical care required, later clarified it was also with Kamaraj extending all possible support.");
            models.add(m);

             m = new Model();
            m.setTitle("Delhi, other parts of North India to see more dust storms till Thursday, says IMD");
            m.setImage(R.drawable.immage);
            m.setDescription("It was the hottest day in March since March 31, 1945, when Delhi recorded a maximum of 40.5 degrees Celsius,\" he said.\n" +
                    "\n" +
                    "\"Low wind speed and plenty of sun due to clear skies over the last three to four days led to high temperatures,\" Srivastava said. Delhi had recorded a maximum of 39.6 degrees Celsius on March 29, 1973, the third hottest day in March.\n" +
                    "\n" +
                    "The weather stations at Najafgarh, Narela, Pitampura and Pusa recorded maximum temperatures of 41.8 degrees Celsius, 41.7 degrees Celsius, 41.6 degrees Celsius, and 41.5 degrees Celsius, the IMD said.\n" +
                    "\n" +
                    "According to Skymet Weather, strong dust-raising winds from the West and northwest direction are expected to continue over Punjab, Haryana, North Rajasthan, Delhi, Uttar Pradesh, Jharkhand and Bihar for a few days. Winds are expected to subside by April 2 evening, it said.\n" +
                    "\n" +
                    "What is heat wave?\n" +
                    "For the plains, a \"heatwave\" is declared when the maximum temperature is more than 40 degrees Celsius, and at least 4.5 notches above normal. A \"severe\" heatwave is declared if departure from normal temperature is more than 6.5 degrees Celsius, according to the IMD.\n" +
                    "\n" +
                    "No let-up in heat wave conditions in Odisha\n" +
                    "There seems to be no respite from heat wave condition in Odisha as at least 17 stations recorded temperature above 40 degrees Celsius and Baripada town becoming the hottest place in the state with the mercury touching 44.6 degrees Celsius on Tuesday, according to the weather department.\n" +
                    "\n" +
                    "The twin cities of Cuttack and Bhubaneswar recorded a maximum temperature of 40.5 and 39.8 degrees Celsius.\n" +
                    "\n" +
                    "Meanwhile, the India Meteorological Department (IMD) has said the maximum temperature (day temperature) is likely to rise by around 2 degrees Celsius during the next 48 hours and it will slide by 2-3 degrees after three days in the districts of Odisha.\n" +
                    "\n" +
                    "The IMD issued a yellow warning for the next three days in 20 of the state’s 30 districts.");
            models.add(m);

             m = new Model();
            m.setTitle("The efficacy of double masking: What health experts have to say");
            m.setImage(R.drawable.immmage);
            m.setDescription("ith the discovery of new more contagious coronavirus variants across the world, some healthcare experts are now encouraging people to upgrade their cloth masks. Conventionally three types of masks are being used to prevent Covid-19 a cloth mask, surgical mask and an N95 mask. But now, questions are being raised against the efficacy of cloth and surgical masks in preventing Covid-19’s new strains.\n" +
                    "\n" +
                    "Some health officials are now suggesting a practice popularly called as double masking simply the use of two face masks to increase the level of protection from the coronavirus.\n" +
                    "\n" +
                    "The practice had generated buzz when US President Biden, Vice-President Kamala Harris, transportation secretary Pete Buttigieg and his husband, Chasten Buttigieg and other officials were clicked wearing two masks.\n" +
                    "\n" +
                    "Top US infectious-disease specialist and chief medical adviser to President Joe Biden, Dr Anthony Fauci endorses double masking because “it just makes more sense” as layering masks reduces the porosity of your face covering and is more likely to do a better job of protecting you from infectious respiratory droplets.\n" +
                    "\n" +
                    "But even as Fauci and some experts recommend wearing two layers of face masks instead of just one, the US’ Centers for Disease Control (CDC) is yet to officially recommend double masking.\n" +
                    "\n" +
                    "“Double mask is totally not required, and it is not as per guidelines. There is no benefit in wearing two masks. A single mask is enough to protect you. Some people think that wearing two masks will not cause infection and it will provide more protection, but this is totally false,” Dr Suresh Kumar, Director, Lok Nayak Jai Prakash Hospital told India Today.\n" +
                    "\n" +
                    "ADVERTISEMENT\n" +
                    "\n" +
                    "Dr Kumar, author of Clinical approach to Covid-19 in India also said that there is no such study which says double masking will provide extra protection.\n" +
                    "\n" +
                    "Dr Jugal Kishore, Director, Professor & Head, Department of Community Medicine, Safdarjung Hospital, said masks are advocated in high-risk areas. In the rest of the places, cloth masks are not even able to protect from common bacteria.\n" +
                    "\n" +
                    "“Wearing two masks is not important at all. In high-risk areas, N-95 is a better mask to use because it has a better seal around the mouth, but it is a costly affair. However, double masking is not important. There is no research to back this claim,” Dr Kishore said.\n" +
                    "\n" +
                    "“You can protect your fellow being from wearing a mask. The main aim of a mask is to prevent the droplets from our mouth while speaking to enter someone else’s mouth. Mask is for the person who is suffering and not for the healthy, but it is recommended because we are not aware of who is a carrier of the virus,” he added.\n" +
                    "\n" +
                    "Dr. Harish Chafle, Consultant Intensivist and Chest Physician, Global Hospital said, “Nowadays, many people are seen wearing two masks which is only helpful if you wear a single layer cloth mask. Moreover, you must know that wearing two masks will reduce but not eliminate the risk of Covid. If you are wearing a single mask that has three layers of cloth then it is okay to wear only one mask.”\n" +
                    "\n" +
                    "In countries like Germany and France, citizens are required to wear a medical-grade or surgical mask while using a public transport and while being in the public sphere like visiting a supermarket. Fabric masks are no longer permitted under the new mask rules in Germany, while in France, their use is strongly discouraged.\n" +
                    "\n" +
                    "“While the current advice was to use a simple cloth or surgical mask for masses and N95 for HCW but with the new variants coming up, it is advisable for masses to upgrade to surgical mask superimposed by cloth mask or two cloth masks together. Two masks are certainly better than a single mask,” Dr Arun Gupta, President Delhi Medical Council.\n" +
                    "\n" +
                    "“N95 is considered more effective but is not comfortable to wear as it is difficult to breathe in, so people may not wear them properly. The issue of compliance and availability will crop up,” said Dr Gupta.\n" +
                    "\n" +
                    "Dr Tushau Prasad, Consultant Emergency Medicine, Wockhardt Hospital, Mumbai said, \"Double masking is not needed if you are wearing an N-95 mask with sufficient filtering that is 95 per cent or more of airborne pathogens. You can go for double masking but make sure that you don’t have to sacrifice comfort or ventilation and wear it if you can breathe freely. If you wish to use two masks, wear a surgical mask first and then a cotton mask on top for added protection. Face fitting mask that fits properly (snugly around the nose and chin with no large gaps around the sides of the face) is important.”\n" +
                    "\n" +
                    "ADVERTISEMENT\n" +
                    "\n" +
                    "Dr Om Shrivastava, Infectious Diseases Specialist, Jaslok Hospital, Mumbai, also said that there is no evidence that double mask provides better protection.\n" +
                    "\n" +
                    "“Even an N95 mask is to be used at hospitals only where Covid patients are being treated. Which means an N95 mask for day-to-day life is not necessary. A 3-ply mask is enough for protection from Covid. There is no evidence to say that double masking provides more protection.”\n" +
                    "\n" +
                    "With inputs from Pankaj Jain in Delhi and Mustafa Shaikh in Mumbai.");
            models.add(m);


            return models;








        }
}