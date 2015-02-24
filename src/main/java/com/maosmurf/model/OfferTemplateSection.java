package com.maosmurf.model;

/**
 * Enum for offer template sections
 */
public enum OfferTemplateSection
{
    VEHICLE_PICTURES("vehiclePictures"),
    OPTIONAL_EQUIPMENT("optionalEquipment"),
    STANDARD_EQUIPMENT("standardEquipment"),
    CONDITION("condition");

    private String offerSection;

    OfferTemplateSection(final String offerSection)
    {
        this.offerSection = offerSection;
    }

    public String getOfferSection()
    {
        return offerSection;
    }

    /**
     * Returns offer template section by section name
     *
     * @param sectionName {@link String}
     * @return {@link OfferTemplateSection}
     */
    public static OfferTemplateSection getOfferSectionByName(final String sectionName)
    {
        for (OfferTemplateSection offerTemplateSection : OfferTemplateSection.values())
        {
            if (offerTemplateSection.getOfferSection().equals(sectionName))
            {
                return offerTemplateSection;
            }
        }
        return null;
    }
}
