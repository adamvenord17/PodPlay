/*
 * Copyright (c) 2019 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.avenord.podplay.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.avenord.podplay.R
import com.avenord.podplay.util.DateUtils
import com.avenord.podplay.util.HtmlUtils
import com.avenord.podplay.viewmodel.PodcastViewModel.EpisodeViewData

class EpisodeListAdapter(private var episodeViewList: List<EpisodeViewData>?,
                         private val episodeListAdapterListener: EpisodeListAdapterListener) :
    RecyclerView.Adapter<EpisodeListAdapter.ViewHolder>() {

  interface EpisodeListAdapterListener {
    fun onSelectedEpisode(episodeViewData: EpisodeViewData)
  }

  class ViewHolder(v: View, private val episodeListAdapterListener: EpisodeListAdapterListener) :
      RecyclerView.ViewHolder(v) {

    init {
      v.setOnClickListener {
        episodeViewData?.let {
          episodeListAdapterListener.onSelectedEpisode(it)
        }
      }
    }

    var episodeViewData: EpisodeViewData? = null
    val titleTextView: TextView = v.findViewById(R.id.titleView)
    val descTextView: TextView = v.findViewById(R.id.descView)
    val durationTextView: TextView = v.findViewById(R.id.durationView)
    val releaseDateTextView: TextView = v.findViewById(R.id.releaseDateView)
  }

  override fun onCreateViewHolder(parent: ViewGroup,
                                  viewType: Int): EpisodeListAdapter.ViewHolder {
    return ViewHolder(LayoutInflater.from(parent.context)
        .inflate(R.layout.episode_item, parent, false), episodeListAdapterListener)
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val episodeViewList = episodeViewList ?: return
    val episodeView = episodeViewList[position]

    holder.episodeViewData = episodeView
    holder.titleTextView.text = episodeView.title
    holder.descTextView.text =  HtmlUtils.htmlToSpannable(episodeView.description ?: "")
    holder.durationTextView.text = episodeView.duration
    holder.releaseDateTextView.text = episodeView.releaseDate?.let { DateUtils.dateToShortDate(it) }
  }

  override fun getItemCount(): Int {
    return episodeViewList?.size ?: 0
  }
}
