package com.avenord.podplay.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0002*+B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\tH\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\rH\u0016J\b\u0010%\u001a\u00020\rH\u0016J\b\u0010&\u001a\u00020\rH\u0002J\b\u0010\'\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020\rH\u0002J\b\u0010)\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/avenord/podplay/ui/PodcastDetailsFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/avenord/podplay/adapter/EpisodeListAdapter$EpisodeListAdapterListener;", "()V", "episodeListAdapter", "Lcom/avenord/podplay/adapter/EpisodeListAdapter;", "listener", "Lcom/avenord/podplay/ui/PodcastDetailsFragment$OnPodcastDetailsListener;", "menuItem", "Landroid/view/MenuItem;", "podcastViewModel", "Lcom/avenord/podplay/viewmodel/PodcastViewModel;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "onSelectedEpisode", "episodeViewData", "Lcom/avenord/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "onStart", "onStop", "setupControls", "setupViewModel", "updateControls", "updateMenuItem", "Companion", "OnPodcastDetailsListener", "app_debug"})
public final class PodcastDetailsFragment extends android.support.v4.app.Fragment implements com.avenord.podplay.adapter.EpisodeListAdapter.EpisodeListAdapterListener {
    private com.avenord.podplay.viewmodel.PodcastViewModel podcastViewModel;
    private com.avenord.podplay.adapter.EpisodeListAdapter episodeListAdapter;
    private com.avenord.podplay.ui.PodcastDetailsFragment.OnPodcastDetailsListener listener;
    private android.view.MenuItem menuItem;
    public static final com.avenord.podplay.ui.PodcastDetailsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onSelectedEpisode(@org.jetbrains.annotations.NotNull()
    com.avenord.podplay.viewmodel.PodcastViewModel.EpisodeViewData episodeViewData) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu, @org.jetbrains.annotations.Nullable()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    private final void setupControls() {
    }
    
    private final void updateControls() {
    }
    
    private final void updateMenuItem() {
    }
    
    private final void setupViewModel() {
    }
    
    public PodcastDetailsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/avenord/podplay/ui/PodcastDetailsFragment$OnPodcastDetailsListener;", "", "onShowEpisodePlayer", "", "episodeViewData", "Lcom/avenord/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "onSubscribe", "onUnsubscribe", "app_debug"})
    public static abstract interface OnPodcastDetailsListener {
        
        public abstract void onSubscribe();
        
        public abstract void onUnsubscribe();
        
        public abstract void onShowEpisodePlayer(@org.jetbrains.annotations.NotNull()
        com.avenord.podplay.viewmodel.PodcastViewModel.EpisodeViewData episodeViewData);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/avenord/podplay/ui/PodcastDetailsFragment$Companion;", "", "()V", "newInstance", "Lcom/avenord/podplay/ui/PodcastDetailsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.avenord.podplay.ui.PodcastDetailsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}