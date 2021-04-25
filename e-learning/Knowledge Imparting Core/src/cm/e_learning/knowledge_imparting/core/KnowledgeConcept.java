package cm.e_learning.knowledge_imparting.core;

import java.util.List;

/**
 * @document KnowledgeConcept
 * @date Apr 22, 2021, 8:49:12 PM
 * @author Njinga TCHAPTCHET
 */
public class KnowledgeConcept {

    private String title;
    private String description;
    private String keywords;
    private List<SubjectDomain> subjectDomainList;

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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * @return the subjectDomainList
     */
    public List<SubjectDomain> getSubjectDomainList() {
        return subjectDomainList;
    }

    /**
     * @param subjectDomainList the subjectDomainList to set
     */
    public void setSubjectDomainList(List<SubjectDomain> subjectDomainList) {
        this.subjectDomainList = subjectDomainList;
    }
}
