package cm.e_learning.knowledge_imparting.core;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;

/**
 * @document Course
 * @date Apr 24, 2021, 5:51:28 PM
 * @author Njinga TCHAPTCHET
 */
public class Course {

    private String code;
    private String name;
    private Graph<Lesson, DefaultEdge> lessonList;
}
