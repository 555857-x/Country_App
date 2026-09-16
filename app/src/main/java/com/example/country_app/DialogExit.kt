package com.example.country_app

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class DialogExit : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialogView = requireActivity()
            .layoutInflater
            .inflate(R.layout.dialog_exit, null)

        val btnYes = dialogView.findViewById<Button>(R.id.btn_yes)
        val btnNo = dialogView.findViewById<Button>(R.id.btn_no)

        btnYes.setOnClickListener {
            requireActivity().finish()
        }

        btnNo.setOnClickListener {
            dismiss()
        }

        val builder = AlertDialog.Builder(requireActivity())
        builder.setView(dialogView)

        return builder.create()
    }
}