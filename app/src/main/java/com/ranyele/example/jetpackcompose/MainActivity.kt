package com.ranyele.example.jetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @Composable
    fun NotesScreen(viewModel: MainViewModel) {
        // Observing notes state from MainViewModel
        ...
        Scaffold(
            topBar = {
                TopAppBar(
                    title = "JetNotes",
                    icon = Icons.Filled.List, onIconClick = {}
                ) },
            content = {
                if (notes.isNotEmpty()) {
                    NotesList(
                        notes = notes,
                        onNoteCheckedChange = {
                            viewModel.onNoteCheckedChange(it) },
                        onNoteClick = { viewModel.onNoteClick(it) } )
                } }
        ) }
}