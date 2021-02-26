package com.example.todo

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import androidx.annotation.IdRes
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.todo.databinding.DialogAddTodoBinding
import com.example.todo.models.Priority
import com.example.todo.models.ToDo

class AddToDoDialog(
        val onAdd : (ToDo) -> Unit
): DialogFragment() {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val inflater = LayoutInflater.from(requireContext())
        val binding = DialogAddTodoBinding.inflate(inflater)
        val builder = AlertDialog.Builder(requireContext())
                .setView(binding.root)
                .setPositiveButton(R.string.add){_,_ ->
                val name = binding.newTodoName.editText?.text?.toString()?:" "
                val prioritySelected = binding.priorityOptions.checkedRadioButtonId
                val priority = Priority.from(prioritySelected)
                val toDo = ToDo(name,priority)
                onAdd(toDo)
                }
                .setNegativeButton(R.string.cancel){_,_ ->
                    //do nothing here
                }

                .setNegativeButton(R.string.cancel){_,_ ->}

        return builder.create()
    }


}