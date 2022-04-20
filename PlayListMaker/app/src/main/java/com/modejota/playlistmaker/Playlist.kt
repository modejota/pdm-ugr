package com.modejota.playlistmaker

/**
 * Data class for a playlist.
 *
 * @property path The path to the playlist.
 * @property name The name of the playlist.
 * @property size The size of the playlist (number of songs).
 */
data class Playlist(val path: String,
                    val name: String,
                    val size: Int)