package com.example.orhan_ucar_odev3

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.orhan_ucar_odev3.databinding.FragmentIletisimBinding

class Iletisim : Fragment() {

    private var _binding: FragmentIletisimBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentIletisimBinding.inflate(inflater, container, false)

        val view = binding.root
        val mailButton = binding.mailBtn
        val linkedinButton = binding.linkedinBtn
        val gitHubButton = binding.githubBtn
        val mediumButton = binding.mediumBtn

        mailButton.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())
            builder.setMessage("Mail göndermek istediğinize emin misiniz?")
            builder.setPositiveButton("Evet") { dialog, which ->
                val recipient = "ucr.orh@gmail.com"
                val subject = "Mail konusu"
                val message = "Mail içeriği"

                val intent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:")
                    putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient))
                    putExtra(Intent.EXTRA_SUBJECT, subject)
                    putExtra(Intent.EXTRA_TEXT, message)
                }

                if (intent.resolveActivity(requireActivity().packageManager) != null) {
                    startActivity(intent)
                } else {
                    Toast.makeText(requireContext(), "Mail göndermek için uygun bir uygulama bulunamadı.", Toast.LENGTH_SHORT).show()
                }
            }
            builder.setNegativeButton("Hayır") { dialog, which ->
                dialog.dismiss()
            }
            val dialog = builder.create()
            dialog.show()

        }

        linkedinButton.setOnClickListener {
            showAlert("LinkedIn'e gitmek istediğinize emin misiniz?", "https://linkedin.com/in/orhan-uçar-1060a9208")
        }

        gitHubButton.setOnClickListener {
            showAlert("GitHub'a gitmek istediğinize emin misiniz?", "https://github.com/orhanucr")
        }

        mediumButton.setOnClickListener {
            showAlert("Medium'a gitmek istediğinize emin misiniz?", "https://medium.com/@ucar.orh")
        }

        return view
    }

    private fun showAlert(message: String, url: String) {
        val builder = AlertDialog.Builder(requireContext())
        builder.setMessage(message)
            .setCancelable(false)
            .setPositiveButton("Evet") { _, _ ->
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
            .setNegativeButton("Hayır") { dialog, _ ->
                dialog.cancel()
            }
        val alert = builder.create()
        alert.show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}