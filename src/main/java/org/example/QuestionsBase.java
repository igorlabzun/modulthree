package org.example;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBase {
    private static QuestionsBase instance;
    private List<Question> questions;
    private  int currentQuestionsIndex;

    private QuestionsBase(){
        questions = new ArrayList<>();
        questions.add(new Question("img/1.png",
                "Ubuntu",
                "Debian",
                "Linux",
                "Fedora",3));

        questions.add(new Question("img/2.png",
                "Java",
                "Jacobs",
                "Struts",
                "Javascript",1));

        questions.add(new Question("img/3.png",
                "HTML",
                "HTTP",
                "Cisco",
                "CSS",4));
        questions.add(new Question("img/4.png",
                "Delphi",
                "MySQL",
                "SuperSQL",
                "SQL Server",2));

        currentQuestionsIndex = 0;

    }

    public static synchronized QuestionsBase getInstance() {
        if(instance == null){
            instance = new QuestionsBase();
        }
        return instance;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}

