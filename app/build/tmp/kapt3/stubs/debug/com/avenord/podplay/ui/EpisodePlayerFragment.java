package com.avenord.podplay.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 B2\u00020\u0001:\u0003BCDB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J \u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\u0012\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010\'\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010.\u001a\u00020\u0018H\u0016J\b\u0010/\u001a\u00020\u0018H\u0016J\u0010\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u001aH\u0002J\b\u00105\u001a\u00020\u0018H\u0002J\b\u00106\u001a\u00020\u0018H\u0002J\b\u00107\u001a\u00020\u0018H\u0002J\b\u00108\u001a\u00020\u0018H\u0002J\u0010\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020\u0018H\u0002J\b\u0010=\u001a\u00020\u0018H\u0002J\b\u0010>\u001a\u00020\u0018H\u0002J\u0010\u0010?\u001a\u00020\u00182\u0006\u0010@\u001a\u00020AH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/avenord/podplay/ui/EpisodePlayerFragment;", "Landroid/support/v4/app/Fragment;", "()V", "draggingScrubber", "", "episodeDuration", "", "isVideo", "mediaBrowser", "Landroid/support/v4/media/MediaBrowserCompat;", "mediaControllerCallback", "Lcom/avenord/podplay/ui/EpisodePlayerFragment$MediaControllerCallback;", "mediaPlayer", "Landroid/media/MediaPlayer;", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "playOnPrepare", "playerSpeed", "", "podcastViewModel", "Lcom/avenord/podplay/viewmodel/PodcastViewModel;", "progressAnimator", "Landroid/animation/ValueAnimator;", "animateScrubber", "", "progress", "", "speed", "changeSpeed", "handleStateChange", "state", "position", "initMediaBrowser", "initMediaPlayer", "initMediaSession", "initVideoPlayer", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onStop", "registerMediaController", "token", "Landroid/support/v4/media/session/MediaSessionCompat$Token;", "seekBy", "seconds", "setSurfaceSize", "setupControls", "setupVideoUI", "setupViewModel", "startPlaying", "episodeViewData", "Lcom/avenord/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "togglePlayPause", "updateControls", "updateControlsFromController", "updateControlsFromMetadata", "metadata", "Landroid/support/v4/media/MediaMetadataCompat;", "Companion", "MediaBrowserCallBacks", "MediaControllerCallback", "app_debug"})
public final class EpisodePlayerFragment extends android.support.v4.app.Fragment {
    private com.avenord.podplay.viewmodel.PodcastViewModel podcastViewModel;
    private android.support.v4.media.MediaBrowserCompat mediaBrowser;
    private com.avenord.podplay.ui.EpisodePlayerFragment.MediaControllerCallback mediaControllerCallback;
    private float playerSpeed;
    private long episodeDuration;
    private boolean draggingScrubber;
    private android.animation.ValueAnimator progressAnimator;
    private android.support.v4.media.session.MediaSessionCompat mediaSession;
    private android.media.MediaPlayer mediaPlayer;
    private boolean isVideo;
    private boolean playOnPrepare;
    public static final com.avenord.podplay.ui.EpisodePlayerFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
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
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupControls() {
    }
    
    private final void setupVideoUI() {
    }
    
    private final void updateControlsFromController() {
    }
    
    private final void initVideoPlayer() {
    }
    
    private final void initMediaPlayer() {
    }
    
    private final void initMediaSession() {
    }
    
    private final void setSurfaceSize() {
    }
    
    private final void animateScrubber(int progress, float speed) {
    }
    
    private final void updateControlsFromMetadata(android.support.v4.media.MediaMetadataCompat metadata) {
    }
    
    private final void changeSpeed() {
    }
    
    private final void seekBy(int seconds) {
    }
    
    private final void handleStateChange(int state, long position, float speed) {
    }
    
    private final void updateControls() {
    }
    
    private final void startPlaying(com.avenord.podplay.viewmodel.PodcastViewModel.EpisodeViewData episodeViewData) {
    }
    
    private final void togglePlayPause() {
    }
    
    private final void registerMediaController(android.support.v4.media.session.MediaSessionCompat.Token token) {
    }
    
    private final void initMediaBrowser() {
    }
    
    public EpisodePlayerFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/avenord/podplay/ui/EpisodePlayerFragment$MediaBrowserCallBacks;", "Landroid/support/v4/media/MediaBrowserCompat$ConnectionCallback;", "(Lcom/avenord/podplay/ui/EpisodePlayerFragment;)V", "onConnected", "", "onConnectionFailed", "onConnectionSuspended", "app_debug"})
    public final class MediaBrowserCallBacks extends android.support.v4.media.MediaBrowserCompat.ConnectionCallback {
        
        @java.lang.Override()
        public void onConnected() {
        }
        
        @java.lang.Override()
        public void onConnectionSuspended() {
        }
        
        @java.lang.Override()
        public void onConnectionFailed() {
        }
        
        public MediaBrowserCallBacks() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/avenord/podplay/ui/EpisodePlayerFragment$MediaControllerCallback;", "Landroid/support/v4/media/session/MediaControllerCompat$Callback;", "(Lcom/avenord/podplay/ui/EpisodePlayerFragment;)V", "onMetadataChanged", "", "metadata", "Landroid/support/v4/media/MediaMetadataCompat;", "onPlaybackStateChanged", "state", "Landroid/support/v4/media/session/PlaybackStateCompat;", "app_debug"})
    public final class MediaControllerCallback extends android.support.v4.media.session.MediaControllerCompat.Callback {
        
        @java.lang.Override()
        public void onMetadataChanged(@org.jetbrains.annotations.Nullable()
        android.support.v4.media.MediaMetadataCompat metadata) {
        }
        
        @java.lang.Override()
        public void onPlaybackStateChanged(@org.jetbrains.annotations.Nullable()
        android.support.v4.media.session.PlaybackStateCompat state) {
        }
        
        public MediaControllerCallback() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/avenord/podplay/ui/EpisodePlayerFragment$Companion;", "", "()V", "newInstance", "Lcom/avenord/podplay/ui/EpisodePlayerFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.avenord.podplay.ui.EpisodePlayerFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}