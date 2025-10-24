package com.example.responsi1mobileh1d023011

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.responsi1mobileh1d023011.adapter.PlayerAdapter // Pastikan import ini benar
import com.example.responsi1mobileh1d023011.data.model.Player
import com.example.responsi1mobileh1d023011.databinding.ActivitySquadBinding // Import binding class
import com.example.responsi1mobileh1d023011.ui.dialog.PlayerDetailsBottomSheet
import com.example.responsi1mobileh1d023011.viewmodel.MainViewModel

class SquadActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySquadBinding
    private val viewModel: MainViewModel by viewModels()
    private lateinit var playerAdapter: PlayerAdapter
    private val TEAM_ID = 67

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySquadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        observeViewModel()
        viewModel.fetchTeamDetails(TEAM_ID)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun setupRecyclerView() {
        playerAdapter = PlayerAdapter(emptyList()) { player ->
            showPlayerDetailsDialog(player)
        }

        binding.recyclerViewSquad.apply {
            layoutManager = LinearLayoutManager(this@SquadActivity)
            adapter = playerAdapter
        }
    }

    private fun observeViewModel() {
        viewModel.teamDetails.observe(this) { searchResponse ->
            searchResponse?.squad?.let { squad ->
                playerAdapter.updateData(squad)
            }
        }
    }

    private fun showPlayerDetailsDialog(player: Player) {
        // Memanggil BottomSheetDialogFragment
        PlayerDetailsBottomSheet.newInstance(player)
            .show(supportFragmentManager, PlayerDetailsBottomSheet.TAG)
    }
}