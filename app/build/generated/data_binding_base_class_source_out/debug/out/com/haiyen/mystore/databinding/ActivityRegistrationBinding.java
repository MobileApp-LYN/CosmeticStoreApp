// Generated by view binder compiler. Do not edit!
package com.haiyen.mystore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.haiyen.mystore.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegistrationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText email;

  @NonNull
  public final Button loginBtn;

  @NonNull
  public final EditText name;

  @NonNull
  public final EditText password;

  @NonNull
  public final ImageView regImg;

  @NonNull
  public final TextView signIn;

  @NonNull
  public final TextView textView;

  private ActivityRegistrationBinding(@NonNull ConstraintLayout rootView, @NonNull EditText email,
      @NonNull Button loginBtn, @NonNull EditText name, @NonNull EditText password,
      @NonNull ImageView regImg, @NonNull TextView signIn, @NonNull TextView textView) {
    this.rootView = rootView;
    this.email = email;
    this.loginBtn = loginBtn;
    this.name = name;
    this.password = password;
    this.regImg = regImg;
    this.signIn = signIn;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegistrationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.login_btn;
      Button loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.name;
      EditText name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.reg_img;
      ImageView regImg = ViewBindings.findChildViewById(rootView, id);
      if (regImg == null) {
        break missingId;
      }

      id = R.id.sign_in;
      TextView signIn = ViewBindings.findChildViewById(rootView, id);
      if (signIn == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityRegistrationBinding((ConstraintLayout) rootView, email, loginBtn, name,
          password, regImg, signIn, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
