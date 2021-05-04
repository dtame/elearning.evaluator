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
     * @return the knowledgeConceptlList
     */
    public List<KnowledgeConceptStrength> getKnowledgeConceptStrengthList();

    /**
     * @param knowledgeConceptStrengthList the knowledgeConceptStrengthList to
     * set
     */
    public void setKnowledgeConceptStrengthList(List<KnowledgeConceptStrength> knowledgeConceptStrengthList);

    /**
     * @return the prerequisiteLessonList
     */
    public List<Lesson> getPrerequisiteLessonList();

    /**
     * @param prerequisiteLessonList the prerequisiteLessonList to set
     */
    public void setPrerequisiteLessonList(List<Lesson> prerequisiteLessonList);

    public class KnowledgeConceptStrength {

        private KnowledgeConcept knowledgeConcept;
        private double strength; // 0 ≤ strength ≤ 1

        /**
         * @return the knowledgeConcept
         */
        public KnowledgeConcept getKnowledgeConcept() {
            return knowledgeConcept;
        }

        /**
         * @param knowledgeConcept the knowledgeConcept to set
         */
        public void setKnowledgeConcept(KnowledgeConcept knowledgeConcept) {
            this.knowledgeConcept = knowledgeConcept;
        }

        /**
         * @return the strength
         */
        public double getStrength() {
            return strength;
        }

        /**
         * @param strength the strength to set
         */
        public void setStrength(double strength) {
            this.strength = strength;
        }
    }
}
