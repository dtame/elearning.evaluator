package cm.e_learning.knowledge_imparting.core;

import java.util.List;

/**
 * @document Exercice
 * @date Apr 24, 2021, 9:11:14 PM
 * @author Njinga TCHAPTCHET
 */
public class Exercice implements Assessment {

    private String title;
    private String summary;
    private List<GradeLevel> gradeLevel;
    private String learnerPrerequisiteCompetencies;
    private List<KnowledgeConceptStrength> knowledgeConceptStrengthList;
    private List<Lesson> prerequisiteLessonList;

    /**
     * @return the title
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the summary
     */
    @Override
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    @Override
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return the learnerPrerequisiteCompetencies
     */
    @Override
    public String getLearnerPrerequisiteCompetencies() {
        return learnerPrerequisiteCompetencies;
    }

    /**
     * @param learnerPrerequisiteCompetencies the
     * learnerPrerequisiteCompetencies to set
     */
    @Override
    public void setLearnerPrerequisiteCompetencies(String learnerPrerequisiteCompetencies) {
        this.learnerPrerequisiteCompetencies = learnerPrerequisiteCompetencies;
    }

    /**
     * @return the knowledgeConceptStrengthList
     */
    public List<KnowledgeConceptStrength> getKnowledgeConceptStrengthList() {
        return knowledgeConceptStrengthList;
    }

    /**
     * @param knowledgeConceptStrengthList the knowledgeConceptStrengthList to
     * set
     */
    public void setKnowledgeConceptStrengthList(List<KnowledgeConceptStrength> knowledgeConceptStrengthList) {
        this.knowledgeConceptStrengthList = knowledgeConceptStrengthList;
    }

    /**
     * @return the prerequisiteLessonList
     */
    @Override
    public List<Lesson> getPrerequisiteLessonList() {
        return prerequisiteLessonList;
    }

    /**
     * @param prerequisiteLessonList the prerequisiteLessonList to set
     */
    @Override
    public void setPrerequisiteLessonList(List<Lesson> prerequisiteLessonList) {
        this.prerequisiteLessonList = prerequisiteLessonList;
    }

}
