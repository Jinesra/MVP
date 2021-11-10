package com.example.mvpapp

import android.os.Handler
import java.util.*


class Model : Contract.Model {
    // array list of strings from which
    // random strings will be selected
    // to display in the activity
    private val arrayList =
        Arrays.asList(
            "Block 1: "+
                    "Getting started",
            "Block 2: "+
                    "UI development",
            "Block 3: "+
                    "UI customization and animations",
            "Block 4: "+
                    "UI collections",
            "Block 5: "+
                    "Asynchronous programming",
            "Block 6: "+
                    "Networking",
            "Block 7: "+
                    "Permissions",
            "Block 8: "+
                    "3d-parties",
            "Block 9: "+
                    "Architecture 1",
            "Block 10: "+
                    "Architecture 2",
            "Block 11: "+
                    "App submission and CI/CD"
        )

    // this method will invoke when
    // user clicks on the button
    // and it will take a delay of
    // 1200 milliseconds to display next course detail
    override fun getNextCourse(onFinishedListener: Contract.Model.OnFinishedListener?) {
        Handler().postDelayed({ onFinishedListener!!.onFinished(getRandomString) }, 1200)
    }


    // method to select random
    // string from the list of strings
    private val getRandomString: String
        private get() {
            val random = Random()
            val index = random.nextInt(arrayList.size)
            return arrayList[index]
        }
}
