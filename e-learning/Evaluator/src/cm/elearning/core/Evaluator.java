package cm.elearning.core;

import cm.e_learning.knowledge_imparting.core.Assessment;
import cm.e_learning.knowledge_imparting.core.Course;
import cm.e_learning.knowledge_imparting.core.Curriculum;
import cm.e_learning.knowledge_imparting.core.KnowledgeConcept;
import cm.e_learning.knowledge_imparting.core.KnowledgeGraph;
import cm.e_learning.learner.api.profile.LearnerProfile;
import cm.e_learning.learner.api.tracking.LearnerEvaluationHistory;
import cm.e_learning.learner.api.tracking.LearnerLessonHistory;

/**
 * @document Evaluator
 * @date Apr 13, 2021, 5:42:51 PM
 * @author Njinga TCHAPTCHET
 */
public class Evaluator {

    public Evaluator() {
    }

    public Assessment getNextAssessment(Course course,
            LearnerLessonHistory lessonHistory,
            LearnerEvaluationHistory evaluationHistory,
            KnowledgeGraph knowledgeGraph,
            LearnerProfile learnerProfile,
            Curriculum curriculum) {
        return null;
    }

    public Assessment getNextTest(KnowledgeConcept knowledgeConcept,
            LearnerLessonHistory lessonHistory,
            LearnerEvaluationHistory evaluationHistory,
            KnowledgeGraph knowledgeGraph,
            LearnerProfile learnerProfile) {
        return null;
    }
}
