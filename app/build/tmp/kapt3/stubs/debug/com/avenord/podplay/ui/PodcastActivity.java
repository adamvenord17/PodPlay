package com.avenord.podplay.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u000eH\u0016J\b\u0010&\u001a\u00020\u000eH\u0016J\u0010\u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u000eH\u0002J\b\u0010+\u001a\u00020\u000eH\u0002J\b\u0010,\u001a\u00020\u000eH\u0002J\b\u0010-\u001a\u00020\u000eH\u0002J\b\u0010.\u001a\u00020\u000eH\u0002J\u0010\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020)H\u0002J\b\u00101\u001a\u00020\u000eH\u0002J\b\u00102\u001a\u00020\u000eH\u0002J\b\u00103\u001a\u00020\u000eH\u0002J\b\u00104\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/avenord/podplay/ui/PodcastActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/avenord/podplay/adapter/PodcastListAdapter$PodcastListAdapterListener;", "Lcom/avenord/podplay/ui/PodcastDetailsFragment$OnPodcastDetailsListener;", "()V", "podcastListAdapter", "Lcom/avenord/podplay/adapter/PodcastListAdapter;", "podcastViewModel", "Lcom/avenord/podplay/viewmodel/PodcastViewModel;", "searchMenuItem", "Landroid/view/MenuItem;", "searchViewModel", "Lcom/avenord/podplay/viewmodel/SearchViewModel;", "addBackStackListener", "", "createEpisodePlayerFragment", "Lcom/avenord/podplay/ui/EpisodePlayerFragment;", "createPodcastDetailsFragment", "Lcom/avenord/podplay/ui/PodcastDetailsFragment;", "handleIntent", "intent", "Landroid/content/Intent;", "hideProgressBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onNewIntent", "onShowDetails", "podcastSummaryViewData", "Lcom/avenord/podplay/viewmodel/SearchViewModel$PodcastSummaryViewData;", "onShowEpisodePlayer", "episodeViewData", "Lcom/avenord/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "onSubscribe", "onUnsubscribe", "performSearch", "term", "", "scheduleJobs", "setupPodcastListView", "setupToolbar", "setupViewModels", "showDetailsFragment", "showError", "message", "showPlayerFragment", "showProgressBar", "showSubscribedPodcasts", "updateControls", "Companion", "app_debug"})
public final class PodcastActivity extends android.support.v7.app.AppCompatActivity implements com.avenord.podplay.adapter.PodcastListAdapter.PodcastListAdapterListener, com.avenord.podplay.ui.PodcastDetailsFragment.OnPodcastDetailsListener {
    private com.avenord.podplay.viewmodel.SearchViewModel searchViewModel;
    private com.avenord.podplay.adapter.PodcastListAdapter podcastListAdapter;
    private com.avenord.podplay.viewmodel.PodcastViewModel podcastViewModel;
    private android.view.MenuItem searchMenuItem;
    private static final java.lang.String TAG_DETAILS_FRAGMENT = "DetailsFragment";
    private static final java.lang.String TAG_EPISODE_UPDATE_JOB = "com.avenord.podplay.episodes";
    private static final java.lang.String TAG_PLAYER_FRAGMENT = "PlayerFragment";
    public static final com.avenord.podplay.ui.PodcastActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSubscribe() {
    }
    
    @java.lang.Override()
    public void onUnsubscribe() {
    }
    
    @java.lang.Override()
    public void onShowEpisodePlayer(@org.jetbrains.annotations.NotNull()
    com.avenord.podplay.viewmodel.PodcastViewModel.EpisodeViewData episodeViewData) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onShowDetails(@org.jetbrains.annotations.NotNull()
    com.avenord.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData podcastSummaryViewData) {
    }
    
    private final void scheduleJobs() {
    }
    
    private final void showSubscribedPodcasts() {
    }
    
    private final void performSearch(java.lang.String term) {
    }
    
    private final void handleIntent(android.content.Intent intent) {
    }
    
    private final void setupToolbar() {
    }
    
    private final void setupViewModels() {
    }
    
    private final void setupPodcastListView() {
    }
    
    private final void addBackStackListener() {
    }
    
    private final void updateControls() {
    }
    
    private final void showDetailsFragment() {
    }
    
    private final void showPlayerFragment() {
    }
    
    private final com.avenord.podplay.ui.EpisodePlayerFragment createEpisodePlayerFragment() {
        return null;
    }
    
    private final com.avenord.podplay.ui.PodcastDetailsFragment createPodcastDetailsFragment() {
        return null;
    }
    
    private final void showProgressBar() {
    }
    
    private final void hideProgressBar() {
    }
    
    private final void showError(java.lang.String message) {
    }
    
    public PodcastActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/avenord/podplay/ui/PodcastActivity$Companion;", "", "()V", "TAG_DETAILS_FRAGMENT", "", "TAG_EPISODE_UPDATE_JOB", "TAG_PLAYER_FRAGMENT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}