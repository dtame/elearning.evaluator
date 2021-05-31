package cm.e_learning.knowledge_imparting.persistence.core;

import cm.e_learning.knowledge_imparting.core.KnowledgeConcept;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

/**
 * @document KnowledgeConceptDAO
 * @date May 20, 2021, 11:53:14 PM
 * @author Njinga TCHAPTCHET
 */
public class KnowledgeConceptDAO {

    private static final String PREREQUISITE = "prerequisite";
    private Graph<KnowledgeConcept, RelationshipEdge> g = new DefaultDirectedGraph<>(RelationshipEdge.class);

    public KnowledgeConceptDAO() {
        KnowledgeConcept n1 = new KnowledgeConcept("Voltage");
        KnowledgeConcept n2 = new KnowledgeConcept("Resistance");
        KnowledgeConcept n3 = new KnowledgeConcept("Electric current");
        KnowledgeConcept n4 = new KnowledgeConcept("Diode");
        KnowledgeConcept n5 = new KnowledgeConcept("Power source");
        KnowledgeConcept n6 = new KnowledgeConcept("Ohm's law");
        KnowledgeConcept n7 = new KnowledgeConcept("Kirchoff's laws");
        KnowledgeConcept n8 = new KnowledgeConcept("Zener diode");
        KnowledgeConcept n9 = new KnowledgeConcept("Parallel connection");
        KnowledgeConcept n10 = new KnowledgeConcept("Series connection");
        KnowledgeConcept n11 = new KnowledgeConcept("Circuit");
        KnowledgeConcept n12 = new KnowledgeConcept("Norton Theorem");
        KnowledgeConcept n13 = new KnowledgeConcept("Thevenin Theorem");
        KnowledgeConcept n14 = new KnowledgeConcept("Superposition Theorem");
        KnowledgeConcept n15 = new KnowledgeConcept("Wheaston Bridge");

        // add the vertices
        g.addVertex(n1);
        g.addVertex(n2);
        g.addVertex(n3);
        g.addVertex(n4);
        g.addVertex(n5);
        g.addVertex(n6);
        g.addVertex(n7);
        g.addVertex(n8);
        g.addVertex(n9);
        g.addVertex(n10);
        g.addVertex(n11);
        g.addVertex(n12);
        g.addVertex(n13);
        g.addVertex(n14);
        g.addVertex(n15);

        g.addEdge(n1, n3, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n1, n4, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n2, n6, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n3, n6, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n3, n7, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n4, n8, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n5, n9, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n5, n10, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n6, n9, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n6, n10, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n7, n9, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n7, n10, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n8, n9, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n8, n10, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n9, n11, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n10, n11, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n11, n12, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n11, n13, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n11, n14, new RelationshipEdge(PREREQUISITE));
        g.addEdge(n11, n15, new RelationshipEdge(PREREQUISITE));

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

    public Graph<KnowledgeConcept, RelationshipEdge> getKnowledgeConceptGraph() {
        return this.g;
    }
}
