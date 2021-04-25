package cm.e_learning.knowledge_imparting.core;

import java.util.List;

/**
 * @document Assessment
 * @date Apr 25, 2021, 4:55:27 PM
 * @author Njinga TCHAPTCHET
 */
public interface Assessment {

    /**
     * @return the title
     */
    public String getTitle();

    /**
     * @param title the title to set
     */
    public void setTitle(String title);

    /**
     * @return the summary
     */
    public String getSummary();

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary);

    /**
     * @return the learnerPrerequisiteCompetencies
     */
    public String getLearnerPrerequisiteCompetencies();

    /**
     * @param learnerPrerequisiteCompetencies the
     * learnerPrerequisiteCompetencies to set
     */
    public void setLearnerPrerequisiteCompetencies(String learnerPrerequisiteCompetencies);

    /**
     * @return the teacherPrerequisiteCompetencies
     */
    public String getTeacherPrerequisiteCompetencies();

    /**
     * @param teacherPrerequisiteCompetencies the
     * teacherPrerequisiteCompetencies to set
     */
    public void setTeacherPrerequisiteCompetencies(String teacherPrerequisiteCompetencies);

    /**
     * @return the knowledgeConceptlList
     */
    public List<KnowledgeConcept> getKnowledgeConceptlList();

    /**
     * @param knowledgeConceptlList the knowledgeConceptlList to set
     */
    public void setKnowledgeConceptlList(List<KnowledgeConcept> knowledgeConceptlList);

    /**
     * @return the prerequisiteLessonList
     */
    public List<Lesson> getPrerequisiteLessonList();

    /**
     * @param prerequisiteLessonList the prerequisiteLessonList to set
     */
    public void setPrerequisiteLessonList(List<Lesson> prerequisiteLessonList);
}
