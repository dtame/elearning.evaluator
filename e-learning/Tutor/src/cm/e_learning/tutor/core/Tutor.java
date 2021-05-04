package cm.e_learning.tutor.core;

import cm.e_learning.knowledge_imparting.core.Curriculum;
import cm.e_learning.knowledge_imparting.core.KnowledgeGraph;
import cm.e_learning.knowledge_imparting.core.Lesson;
import cm.e_learning.learner.api.profile.LearnerProfile;
import cm.e_learning.learner.api.profile.LearningGoal;
import cm.e_learning.learner.api.tracking.LearnerEvaluationHistory;
import cm.e_learning.learner.api.tracking.LearnerLessonHistory;

/**
 * @document Tutor
 * @date May 3, 2021, 11:37:39 PM
 * @author Njinga TCHAPTCHET
 */
public class Tutor {

    public Lesson getNextLesson(LearningGoal learningGoal,
            LearnerLessonHistory lessonHistory,
            LearnerEvaluationHistory evaluationHistory,
            KnowledgeGraph knowledgeGraph,
            LearnerProfile learnerProfile,
            Curriculum curriculum) {
        return null;
    }
}
