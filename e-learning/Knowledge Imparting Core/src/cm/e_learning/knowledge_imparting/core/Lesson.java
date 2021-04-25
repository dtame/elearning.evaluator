package cm.e_learning.knowledge_imparting.core;

import java.util.List;

/**
 * @document Lesson
 * @date Apr 15, 2021, 7:07:38 PM
 * @author Njinga TCHAPTCHET
 */
public class Lesson {

    private String title;
    private String summary;
    private GradeLevel gradeLevel;
    private String learnerPrerequisiteCompetencies;
    private String teacherPrerequisiteCompetencies;
    private List<KnowledgeConcept> knowledgeConceptlList;
    private List<Lesson> prerequisiteLessonList;
}
