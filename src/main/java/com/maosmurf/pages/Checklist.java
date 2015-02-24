package com.maosmurf.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.OptionModel;
import org.apache.tapestry5.SelectModel;
import org.apache.tapestry5.ValueEncoder;
import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.internal.OptionModelImpl;
import org.apache.tapestry5.internal.SelectModelImpl;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.services.TypeCoercer;
import org.apache.tapestry5.util.EnumValueEncoder;

import com.maosmurf.model.OfferTemplateSection;

public class Checklist
{
    @Component(parameters = {
        "selected=selected",
        "encoder=encoder",
        "model=model",
        "disabled=disabled"
    })
    private org.apache.tapestry5.corelib.components.Checklist checklist;

    @Inject
    private TypeCoercer typeCoercer;

    public List<OfferTemplateSection> getSelected()
    {

        final List<OfferTemplateSection> offerSections = new ArrayList<OfferTemplateSection>();
        offerSections.add(OfferTemplateSection.VEHICLE_PICTURES);
        offerSections.add(OfferTemplateSection.STANDARD_EQUIPMENT);
        return offerSections;
    }

    public boolean getDisabled()
    {
        return true;
    }

    public ValueEncoder getEncoder()
    {
        return new EnumValueEncoder<OfferTemplateSection>(typeCoercer, OfferTemplateSection.class);
    }

    public SelectModel getModel()
    {
        final ArrayList<OptionModel> optionModels = new ArrayList<OptionModel>();
        for (OfferTemplateSection sec : OfferTemplateSection.values())
        {
            optionModels.add(new OptionModelImpl(sec.name(), sec));
        }
        return new SelectModelImpl(null, optionModels);
    }

}
