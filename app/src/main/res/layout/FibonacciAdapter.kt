package layout

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfibonacci.R

class FibonacciAdapter {
}
class FibonacciViewHoldeer(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)
}