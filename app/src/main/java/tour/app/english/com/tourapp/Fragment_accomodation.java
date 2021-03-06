package tour.app.english.com.tourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_accomodation.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_accomodation#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_accomodation extends Fragment {
    Button question1, question2, question3;
    LinearLayout layout;

    QuestionData questionData = new QuestionData();
    PutGetCategories putGetCategories = new PutGetCategories();
    PutGetSentences putGetSentences = new PutGetSentences();

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_fragment_accomodation, null);

        question1 = view.findViewById(R.id.accQ1);
        question2 = view.findViewById(R.id.accQ2);
        question3 = view.findViewById(R.id.accQ3);

        layout = view.findViewById(R.id.layout_fragment_question_accomodation);

        question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(getActivity(), QuestionActivity.class);
                putGetCategories.putCategories();

                String category = putGetCategories.getCategory(1);
                putGetSentences.putsentece(category);

                String englishQuestion = putGetSentences.getEnglishSentence(category, 0);
                String korean = putGetSentences.getKoreanSentence(category, 0);
                String answercheck = putGetSentences.getAnserCheck(category, 0);

                intent1.putExtra("Category", category);
                intent1.putExtra("Question", englishQuestion);
                intent1.putExtra("Korean", korean);
                intent1.putExtra("Answercheck", answercheck);

                startActivity(intent1);
            }
        });

        question2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity(), QuestionActivity.class);

                putGetCategories.putCategories();

                String category = putGetCategories.getCategory(1);
                putGetSentences.putsentece(category);

                String englishQuestion = putGetSentences.getEnglishSentence(category, 1);
                String korean = putGetSentences.getKoreanSentence(category, 1);
                String answercheck = putGetSentences.getAnserCheck(category, 1);

                intent1.putExtra("Category", category);
                intent1.putExtra("Question", englishQuestion);
                intent1.putExtra("Korean", korean);
                intent1.putExtra("Answercheck", answercheck);

                startActivity(intent1);
            }
        });

        question3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity(), QuestionActivity.class);
                putGetCategories.putCategories();

                String category = putGetCategories.getCategory(1);
                putGetSentences.putsentece(category);

                String englishQuestion = putGetSentences.getEnglishSentence(category, 2);
                String korean = putGetSentences.getKoreanSentence(category, 2);
                String answercheck = putGetSentences.getAnserCheck(category, 2);

                intent1.putExtra("Category", category);
                intent1.putExtra("Question", englishQuestion);
                intent1.putExtra("Korean", korean);
                intent1.putExtra("Answercheck", answercheck);

                startActivity(intent1);
            }
        });

        return view;
    }
}
