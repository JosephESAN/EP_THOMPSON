package Fragment.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ep_thompson.R

class ContactoAdapter(private val contactos: List<ContactoModel>) : RecyclerView.Adapter<ContactoAdapter.ContactoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemcontacto, parent, false)
        return ContactoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactoViewHolder, position: Int) {
        val contacto = contactos[position]
        holder.bind(contacto)
    }

    override fun getItemCount(): Int {
        return contactos.size
    }

    class ContactoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imgFoto)
        private val nameView: TextView = itemView.findViewById(R.id.txtNombre)
        private val phoneView: TextView = itemView.findViewById(R.id.txtCiudad)
        private val dateView: TextView = itemView.findViewById(R.id.txtEspectadores)

        fun bind(contacto: ContactoModel) {
            imageView.setImageResource(contacto.image)
            nameView.text = contacto.nombre
            phoneView.text = contacto.ciudad
            dateView.text = contacto.espectadores
        }
    }
}