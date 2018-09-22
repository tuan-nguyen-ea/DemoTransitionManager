# DemoTransitionManager
Animations with just one line of code using TransitionManager class.

## Code
```
button.setOnClickListener {
            // Begin Transition for parent ViewGroup that contains 2 buttons
            // Animations with just one line of code.
            TransitionManager.beginDelayedTransition(container)
            if (item.visibility == View.GONE) {
                item.visibility = View.VISIBLE
            } else {
                item.visibility = View.GONE
            }
        }
```

## References
* [Animate all the things. Transitions in Android](https://medium.com/@andkulikov/animate-all-the-things-transitions-in-android-914af5477d50)
* [Android TransitionManager](https://developer.android.com/reference/android/transition/TransitionManager)

## Authors

* **Tuan Nguyen** - Gmail: *tuan25abc@gmail.com*