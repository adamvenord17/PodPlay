package com.avenord.podplay.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/avenord/podplay/adapter/EpisodeListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/avenord/podplay/adapter/EpisodeListAdapter$ViewHolder;", "episodeViewList", "", "Lcom/avenord/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "episodeListAdapterListener", "Lcom/avenord/podplay/adapter/EpisodeListAdapter$EpisodeListAdapterListener;", "(Ljava/util/List;Lcom/avenord/podplay/adapter/EpisodeListAdapter$EpisodeListAdapterListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "EpisodeListAdapterListener", "ViewHolder", "app_debug"})
public final class EpisodeListAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.avenord.podplay.adapter.EpisodeListAdapter.ViewHolder> {
    private java.util.List<com.avenord.podplay.viewmodel.PodcastViewModel.EpisodeViewData> episodeViewList;
    private final com.avenord.podplay.adapter.EpisodeListAdapter.EpisodeListAdapterListener episodeListAdapterListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.avenord.podplay.adapter.EpisodeListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.avenord.podplay.adapter.EpisodeListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public EpisodeListAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.avenord.podplay.viewmodel.PodcastViewModel.EpisodeViewData> episodeViewList, @org.jetbrains.annotations.NotNull()
    com.avenord.podplay.adapter.EpisodeListAdapter.EpisodeListAdapterListener episodeListAdapterListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/avenord/podplay/adapter/EpisodeListAdapter$EpisodeListAdapterListener;", "", "onSelectedEpisode", "", "episodeViewData", "Lcom/avenord/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "app_debug"})
    public static abstract interface EpisodeListAdapterListener {
        
        public abstract void onSelectedEpisode(@org.jetbrains.annotations.NotNull()
        com.avenord.podplay.viewmodel.PodcastViewModel.EpisodeViewData episodeViewData);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/avenord/podplay/adapter/EpisodeListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "episodeListAdapterListener", "Lcom/avenord/podplay/adapter/EpisodeListAdapter$EpisodeListAdapterListener;", "(Landroid/view/View;Lcom/avenord/podplay/adapter/EpisodeListAdapter$EpisodeListAdapterListener;)V", "descTextView", "Landroid/widget/TextView;", "getDescTextView", "()Landroid/widget/TextView;", "durationTextView", "getDurationTextView", "episodeViewData", "Lcom/avenord/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "getEpisodeViewData", "()Lcom/avenord/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "setEpisodeViewData", "(Lcom/avenord/podplay/viewmodel/PodcastViewModel$EpisodeViewData;)V", "releaseDateTextView", "getReleaseDateTextView", "titleTextView", "getTitleTextView", "app_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private com.avenord.podplay.viewmodel.PodcastViewModel.EpisodeViewData episodeViewData;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView descTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView durationTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView releaseDateTextView = null;
        private final com.avenord.podplay.adapter.EpisodeListAdapter.EpisodeListAdapterListener episodeListAdapterListener = null;
        
        @org.jetbrains.annotations.Nullable()
        public final com.avenord.podplay.viewmodel.PodcastViewModel.EpisodeViewData getEpisodeViewData() {
            return null;
        }
        
        public final void setEpisodeViewData(@org.jetbrains.annotations.Nullable()
        com.avenord.podplay.viewmodel.PodcastViewModel.EpisodeViewData p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitleTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDescTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDurationTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getReleaseDateTextView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        com.avenord.podplay.adapter.EpisodeListAdapter.EpisodeListAdapterListener episodeListAdapterListener) {
            super(null);
        }
    }
}