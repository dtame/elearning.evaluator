package cm.e_learning.knowledge_imparting.persistence.core;

import cm.e_learning.knowledge_imparting.core.Lesson;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

/**
 * @document LessonDAO
 * @date May 20, 2021, 6:59:56 PM
 * @author Njinga TCHAPTCHET
 */
public class LessonDAO {

    private Graph<Lesson, RelationshipEdge> g = new DefaultDirectedGraph<>(RelationshipEdge.class);

    public LessonDAO() {
        Lesson l11 = new Lesson("1.1", "Electrical Quantities and SI Units");
        Lesson l12 = new Lesson("1.2", "Force, Work, and Power");
        Lesson l13 = new Lesson("1.3", "Electric Charge and Current");
        Lesson l14 = new Lesson("1.4", "Electric Potential");
        Lesson l15 = new Lesson("1.5", "Energy and Electrical Power");
        Lesson l16 = new Lesson("1.6", "Constant and Variable Functions");
        Lesson l21 = new Lesson("2.1", "Passive and Active Elements");
        Lesson l22 = new Lesson("2.2", "Sign Conventions");
        Lesson l23 = new Lesson("2.3", "Voltage-Current Relations");
        Lesson l24 = new Lesson("2.4", "Resistance");
        Lesson l25 = new Lesson("2.5", "Inductance");
        Lesson l26 = new Lesson("2.6", "Capacitance");
        Lesson l27 = new Lesson("2.7", "Circuit Diagrams");
        Lesson l28 = new Lesson("2.8", "Nonlinear Resistors");
        Lesson l31 = new Lesson("3.1", "Circuit Laws introduction");
        Lesson l32 = new Lesson("3.2", "Kirchhoff’s Voltage Law");
        Lesson l33 = new Lesson("3.3", "Kirchhoff’s Current Law");
        Lesson l34 = new Lesson("3.4", "Circuit Elements in Series");
        Lesson l35 = new Lesson("3.5", "Circuit Elements in Parallel");
        Lesson l36 = new Lesson("3.6", "Voltage Division");
        Lesson l37 = new Lesson("3.7", "Current Division");
        Lesson l41 = new Lesson("4.1", "The Branch Current Method");
        Lesson l42 = new Lesson("4.2", "The Mesh Current Method");
        Lesson l43 = new Lesson("4.3", "Matrices and Determinants");
        Lesson l44 = new Lesson("4.4", "The Node Voltage Method");
        Lesson l45 = new Lesson("4.5", "Input and Output Resistance");
        Lesson l46 = new Lesson("4.6", "Transfer Resistance");
        Lesson l47 = new Lesson("4.7", "Network Reduction");
        Lesson l48 = new Lesson("4.8", "Superposition");
        Lesson l49 = new Lesson("4.9", "Thévenin’s and Norton’s Theorems");
        Lesson l410 = new Lesson("4.10", "Maximum Power Transfer Theorem");

        g.addVertex(l11);
        g.addVertex(l12);
        g.addVertex(l13);
        g.addVertex(l14);
        g.addVertex(l15);
        g.addVertex(l16);
        g.addVertex(l21);
        g.addVertex(l22);
        g.addVertex(l23);
        g.addVertex(l24);
        g.addVertex(l25);
        g.addVertex(l26);
        g.addVertex(l27);
        g.addVertex(l28);
        g.addVertex(l31);
        g.addVertex(l32);
        g.addVertex(l33);
        g.addVertex(l34);
        g.addVertex(l35);
        g.addVertex(l36);
        g.addVertex(l37);
        g.addVertex(l41);
        g.addVertex(l42);
        g.addVertex(l43);
        g.addVertex(l44);
        g.addVertex(l45);
        g.addVertex(l46);
        g.addVertex(l47);
        g.addVertex(l48);
        g.addVertex(l49);
        g.addVertex(l410);

        g.addEdge(l11, l12, new RelationshipEdge(""));
        g.addEdge(l12, l13, new RelationshipEdge(""));
        g.addEdge(l13, l14, new RelationshipEdge(""));
        g.addEdge(l14, l15, new RelationshipEdge(""));
        g.addEdge(l15, l16, new RelationshipEdge(""));
        g.addEdge(l16, l21, new RelationshipEdge(""));
        g.addEdge(l21, l22, new RelationshipEdge(""));
        g.addEdge(l22, l23, new RelationshipEdge(""));
        g.addEdge(l23, l24, new RelationshipEdge(""));
        g.addEdge(l24, l25, new RelationshipEdge(""));
        g.addEdge(l25, l26, new RelationshipEdge(""));
        g.addEdge(l26, l27, new RelationshipEdge(""));
        g.addEdge(l27, l28, new RelationshipEdge(""));
        g.addEdge(l28, l31, new RelationshipEdge(""));
        g.addEdge(l31, l32, new RelationshipEdge(""));
        g.addEdge(l32, l33, new RelationshipEdge(""));
        g.addEdge(l33, l34, new RelationshipEdge(""));
        g.addEdge(l34, l35, new RelationshipEdge(""));
        g.addEdge(l35, l36, new RelationshipEdge(""));
        g.addEdge(l36, l37, new RelationshipEdge(""));
        g.addEdge(l37, l41, new RelationshipEdge(""));
        g.addEdge(l41, l42, new RelationshipEdge(""));
        g.addEdge(l42, l43, new RelationshipEdge(""));
        g.addEdge(l43, l44, new RelationshipEdge(""));
        g.addEdge(l44, l45, new RelationshipEdge(""));
        g.addEdge(l45, l46, new RelationshipEdge(""));
        g.addEdge(l46, l47, new RelationshipEdge(""));
        g.addEdge(l47, l48, new RelationshipEdge(""));
        g.addEdge(l48, l49, new RelationshipEdge(""));
        g.addEdge(l49, l410, new RelationshipEdge(""));
    }

    public Graph<Lesson, RelationshipEdge> getLessonGraph() {
        return this.g;
    }

    public class RelationshipEdge
            extends
            DefaultEdge {

        private String label;

        /**
         * Constructs a relationship edge
         *
         * @param label the label of the new edge.
         *
         */
        public RelationshipEdge(String label) {
            this.label = label;
        }

        /**
         * Gets the label associated with this edge.
         *
         * @return edge label
         */
        public String getLabel() {
            return label;
        }

        @Override
        public String toString() {
//            return "(" + getSource() + " : " + getTarget() + " : " + label + ")";
            return "";
        }
    }
}
