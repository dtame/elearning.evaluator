/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.e_learning.knowledge_imparting.ui.view;

import cm.e_learning.knowledge_imparting.core.KnowledgeConcept;
import cm.e_learning.knowledge_imparting.core.Lesson;
import cm.e_learning.knowledge_imparting.persistence.core.KnowledgeConceptDAO;
import cm.e_learning.knowledge_imparting.persistence.core.LessonDAO;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.swing.mxGraphComponent;
import java.io.IOException;
import org.jgrapht.Graph;
import org.jgrapht.ext.JGraphXAdapter;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//cm.e_learning.knowledge_imparting.ui.view//GraphView//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "GraphViewTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "editor", openAtStartup = false)
@ActionID(category = "Window", id = "cm.e_learning.knowledge_imparting.ui.view.GraphViewTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_GraphViewAction",
        preferredID = "GraphViewTopComponent"
)
@Messages({
    "CTL_GraphViewAction=GraphView",
    "CTL_GraphViewTopComponent=GraphView Window",
    "HINT_GraphViewTopComponent=This is a GraphView window"
})
public final class GraphViewTopComponent extends TopComponent {

    public GraphViewTopComponent() {
        try {
            initComponents();

            LessonDAO lessonDAO = new LessonDAO();
            Graph<Lesson, LessonDAO.RelationshipEdge> lessonGraph = lessonDAO.getLessonGraph();
            displayLessonGraph(lessonGraph);

            KnowledgeConceptDAO knowledgeConceptDAO = new KnowledgeConceptDAO();
            Graph<KnowledgeConcept, KnowledgeConceptDAO.RelationshipEdge> knowledgeConceptGraph = knowledgeConceptDAO.getKnowledgeConceptGraph();
            displayKnowledgeGraph(knowledgeConceptGraph);
//        setName(Bundle.CTL_GraphViewTopComponent);
//        setToolTipText(Bundle.HINT_GraphViewTopComponent());
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }

    }

    public void displayLessonGraph(Graph<Lesson, LessonDAO.RelationshipEdge> g) throws IOException {

        JGraphXAdapter<Lesson, LessonDAO.RelationshipEdge> graphAdapter
                = new JGraphXAdapter<>(g);
        mxHierarchicalLayout layout = new mxHierarchicalLayout(graphAdapter);
        layout.execute(graphAdapter.getDefaultParent());

//        BufferedImage image
//                = mxCellRenderer.createBufferedImage(graphAdapter, null, 2, Color.WHITE, true, null);
//        File imgFile = new File("/home/nganze2/graph.png");
//        ImageIO.write(image, "PNG", imgFile);
        mxGraphComponent graphComponent = new mxGraphComponent(graphAdapter);
        graphComponent.setAntiAlias(true);
        graphComponent.setCenterPage(true);
        graphComponent.setZoomFactor(2);
        graphComponent.setPanning(true);
        jPanel3.add(graphComponent);
//        JSONExporter jSONExporter = new JSONExporter();
//
//        StringWriter stringWriter = new StringWriter();
//        jSONExporter.exportGraph(g, stringWriter);

    }

    public void displayKnowledgeGraph(Graph<KnowledgeConcept, KnowledgeConceptDAO.RelationshipEdge> g) throws IOException {

        JGraphXAdapter<KnowledgeConcept, KnowledgeConceptDAO.RelationshipEdge> graphAdapter
                = new JGraphXAdapter<>(g);
        mxHierarchicalLayout layout = new mxHierarchicalLayout(graphAdapter);
        layout.execute(graphAdapter.getDefaultParent());

//        BufferedImage image
//                = mxCellRenderer.createBufferedImage(graphAdapter, null, 2, Color.WHITE, true, null);
//        File imgFile = new File("/home/nganze2/graph.png");
//        ImageIO.write(image, "PNG", imgFile);
        mxGraphComponent graphComponent = new mxGraphComponent(graphAdapter);
        graphComponent.setAntiAlias(true);
        graphComponent.setCenterPage(true);
        graphComponent.setZoomFactor(2);
        graphComponent.setPanning(true);
        jPanel4.add(graphComponent);
//        JSONExporter jSONExporter = new JSONExporter();
//
//        StringWriter stringWriter = new StringWriter();
//        jSONExporter.exportGraph(g, stringWriter);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(GraphViewTopComponent.class, "GraphViewTopComponent.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 40, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel3, gridBagConstraints);

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(GraphViewTopComponent.class, "GraphViewTopComponent.jLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 40, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jPanel4, gridBagConstraints);

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
