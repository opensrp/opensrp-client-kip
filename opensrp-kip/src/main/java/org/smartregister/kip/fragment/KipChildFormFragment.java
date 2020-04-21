package org.smartregister.kip.fragment;

import android.os.Bundle;

import com.vijay.jsonwizard.constants.JsonFormConstants;

import org.smartregister.child.fragment.ChildFormFragment;
import org.smartregister.child.presenter.ChildFormFragmentPresenter;
import org.smartregister.kip.interactor.ChildFormInteractor;
import org.smartregister.kip.presenter.KipChildFormFragmentPresenter;

public class KipChildFormFragment extends ChildFormFragment {

    private OnReactionVaccineSelected OnReactionVaccineSelected;

    public static KipChildFormFragment getFormFragment(String stepName) {
        KipChildFormFragment jsonFormFragment = new KipChildFormFragment();
        Bundle bundle = new Bundle();
        bundle.putString(JsonFormConstants.JSON_FORM_KEY.STEPNAME, stepName);
        jsonFormFragment.setArguments(bundle);
        return jsonFormFragment;
    }

    public OnReactionVaccineSelected getOnReactionVaccineSelected() {
        return OnReactionVaccineSelected;
    }

    public void setOnReactionVaccineSelected(OnReactionVaccineSelected onReactionVaccineSelected) {
        this.OnReactionVaccineSelected = onReactionVaccineSelected;
    }

    @Override
    protected ChildFormFragmentPresenter createPresenter() {
        return new KipChildFormFragmentPresenter(this, ChildFormInteractor.getChildInteractorInstance());
    }

    public interface OnReactionVaccineSelected {
        void updateDatePicker(String date);
    }
}