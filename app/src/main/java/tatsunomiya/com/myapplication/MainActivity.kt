package tatsunomiya.com.myapplication

import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener(this)

    }


    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()


        }
    }

    private fun showTimePickerDialog() {

        val cal = Calendar.getInstance()
        var hour = Int
        val minute: Int


        var  test = 60


        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                cal.set(Calendar.HOUR_OF_DAY, hour)
                cal.set(Calendar.MINUTE, minute)
//                var getTime =   cal.set(Calendar.HOUR_OF_DAY, hour)
                var getTime = hour
                var getTime2 = minute

                if ( getTime >=   2 && getTime <=  9 ) {
                    textView.text = "おはよう"




                }else if (
                    getTime >= 10 && getTime <= 17 && getTime2 <= 59){
                        textView.text = "こんにちわ"


                }else if(getTime >=18 && getTime <= 24 && getTime  >=0 && getTime2 <= 59) {
                    textView.text = "こんばんわ"


                } else {
                    textView.text = "こんばんわ"

                }




//                selected(hour,minute)

                Log.d("UI_PARTS", "$hour:$minute")
            },
            13, 0, true)
        timePickerDialog.show()

    }



//    private fun selected(hour:Boolean , minute:Boolean) {
//
//        val cal = Calendar.getInstance()
//
//
//        cal.set(Calendar.HOUR_OF_DAY, hour)
//        cal.set(Calendar.MINUTE, minute)
////         var hour2 = SimpleDateFormat("HH:mm").format(cal.time)
//
//        if(hour => 2 && hour <= 9) {
//
//        }
//
//
//    }





            }

//                textView.text = SimpleDateFormat("HH:mm").format(cal.time)











//        if(timePickerDialog)



//    private fun setText2() {
//        TimePickerDialog.OnTimeSetListener { view, hour, minute ->
//            Log.d("UI_PARTS", "$hour:$minute")
//
//             var str = hour
//            var str2 = minute
//
//            if (2 <= str && str <= 9 && str2 <= 59) {
//                textView.text = "おはよう"
//                Log.d("UI_PARTS", "$str: $str2")
//
//
//                }  else{
//                    textView.text = "馬鹿"
//            }
//
//        }
//
//    }




