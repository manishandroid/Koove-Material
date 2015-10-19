package com.koove.koovematerial.Model;

/**
 * Created by Manish on 10/19/2015.
 */
import com.google.gson.annotations.SerializedName;

public class Tag {

    @SerializedName("term_id")
    private Integer termId;
    @SerializedName("name")
    private String name;
    @SerializedName("slug")
    private String slug;
    @SerializedName("term_group")
    private Integer termGroup;
    @SerializedName("term_taxonomy_id")
    private Integer termTaxonomyId;
    @SerializedName("taxonomy")
    private String taxonomy;
    @SerializedName("description")
    private String description;
    @SerializedName("parent")
    private Integer parent;
    @SerializedName("count")
    private Integer count;
    @SerializedName("filter")
    private String filter;

    /**
     *
     * @return
     * The termId
     */
    public Integer getTermId() {
        return termId;
    }

    /**
     *
     * @param termId
     * The term_id
     */
    public void setTermId(Integer termId) {
        this.termId = termId;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     *
     * @param slug
     * The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     *
     * @return
     * The termGroup
     */
    public Integer getTermGroup() {
        return termGroup;
    }

    /**
     *
     * @param termGroup
     * The term_group
     */
    public void setTermGroup(Integer termGroup) {
        this.termGroup = termGroup;
    }

    /**
     *
     * @return
     * The termTaxonomyId
     */
    public Integer getTermTaxonomyId() {
        return termTaxonomyId;
    }

    /**
     *
     * @param termTaxonomyId
     * The term_taxonomy_id
     */
    public void setTermTaxonomyId(Integer termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }

    /**
     *
     * @return
     * The taxonomy
     */
    public String getTaxonomy() {
        return taxonomy;
    }

    /**
     *
     * @param taxonomy
     * The taxonomy
     */
    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The parent
     */
    public Integer getParent() {
        return parent;
    }

    /**
     *
     * @param parent
     * The parent
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     *
     * @return
     * The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The filter
     */
    public String getFilter() {
        return filter;
    }

    /**
     *
     * @param filter
     * The filter
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }

}
