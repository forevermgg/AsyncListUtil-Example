package co.jasonwyatt.asynclistutil_example

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val title: TextView? = itemView.findViewById(R.id.title)
    private val content: TextView? = itemView.findViewById(R.id.content)

    fun bindView(item: Item?, position: Int) {
        title?.text = "$position ${item?.title ?: "loading"}"
        content?.text = item?.content ?: "loading"
    }
}