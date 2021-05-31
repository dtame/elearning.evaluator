package cm.e_learning.knowledge_imparting.core;

import java.util.List;

/**
 * @document Lesson
 * @date Apr 15, 2021, 7:07:38 PM
 * @author Njinga TCHAPTCHET
 */
public class Lesson {

    private String title;
    private String code;
    private String summary;
    private GradeLevel gradeLevel;
    private String learnerPrerequisiteCompetencies;
    private String teacherPrerequisiteCompetencies;
    private List<KnowledgeConcept> knowledgeConceptlList;
    private List<Lesson> prerequisiteLessonList;

    public Lesson(String code, String title) {
        this.code = code;
        this.title = title;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return the gradeLevel
     */
    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    /**
     * @param gradeLevel the gradeLevel to set
     */
    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    /**
     * @return the learnerPrerequisiteCompetencies
     */
    public String getLearnerPrerequisiteCompetencies() {
        return learnerPrerequisiteCompetencies;
    }

    /**
     * @param learnerPrerequisiteCompetencies the
     * learnerPrerequisiteCompetencies to set
     */
    public void setLearnerPrerequisiteCompetencies(String learnerPrerequisiteCompetencies) {
        this.learnerPrerequisiteCompetencies = learnerPrerequisiteCompetencies;
    }

    /**
     * @return the teacherPrerequisiteCompetencies
     */
    public String getTeacherPrerequisiteCompetencies() {
        return teacherPrerequisiteCompetencies;
    }

    /**
     * @param teacherPrerequisiteCompetencies the
     * teacherPrerequisiteCompetencies to set
     */
    public void setTeacherPrerequisiteCompetencies(String teacherPrerequisiteCompetencies) {
        this.teacherPrerequisiteCompetencies = teacherPrerequisiteCompetencies;
    }

    /**
     * @return the knowledgeConceptlList
     */
    public List<KnowledgeConcept> getKnowledgeConceptlList() {
        return knowledgeConceptlList;
    }

    /**
     * @param knowledgeConceptlList the knowledgeConceptlList to set
     */
    public void setKnowledgeConceptlList(List<KnowledgeConcept> knowledgeConceptlList) {
        this.knowledgeConceptlList = knowledgeConceptlList;
    }

    /**
     * @return the prerequisiteLessonList
     */
    public List<Lesson> getPrerequisiteLessonList() {
        return prerequisiteLessonList;
    }

    /**
     * @param prerequisiteLessonList the prerequisiteLessonList to set
     */
    public void setPrerequisiteLessonList(List<Lesson> prerequisiteLessonList) {
        this.prerequisiteLessonList = prerequisiteLessonList;
    }

    @Override
    public String toString() {
        return code + " " + title;
    }
}
