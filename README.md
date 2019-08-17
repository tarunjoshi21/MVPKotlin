# MVPKotlin
This demo describes how to apply MVP architecture using Kotlin in Android.

**What is MVP?**
MVP stands for Model-view-presenter is a derivation of MVC (Model-view-controller) architecture pattern which mostly used for building user interfaces.
In *MVP*, the presenter acts as a middle man between model and view. In *MVP*, all presentation logic is pushed to presenter.

**Model**

*In an application with a good layered architecture, this model would only be the gateway to the domain layer or business logic. See it as the provider of the data we want to display in the view. Model’s responsibilities include using APIs, caching data, managing databases and so on.*
Here **LoginInterector.kt** is the model.

**View**

*The View, usually implemented by an Activity, will contain a reference to the presenter. The only thing that the view will do is to call a method from the Presenter every time there is an interface action.*

Here, **MainActivity.kt** and **LovinView.kt** are the part if Views

**Presenter**

*The Presenter is responsible to act as the middle man between View and Model. It retrieves data from the Model and returns it formatted to the View. But unlike the typical MVC, it also decides what happens when you interact with the View.*

Here, **LoginPresenter.kt** is the presenter.
