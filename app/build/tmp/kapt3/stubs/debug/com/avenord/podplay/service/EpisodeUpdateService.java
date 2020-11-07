package com.avenord.podplay.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0003J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/avenord/podplay/service/EpisodeUpdateService;", "Lcom/firebase/jobdispatcher/JobService;", "()V", "createNotificationChannel", "", "displayNotification", "podcastInfo", "Lcom/avenord/podplay/repository/PodcastRepo$PodcastUpdateInfo;", "onStartJob", "", "jobParameters", "Lcom/firebase/jobdispatcher/JobParameters;", "onStopJob", "Companion", "app_debug"})
public final class EpisodeUpdateService extends com.firebase.jobdispatcher.JobService {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EPISODE_CHANNEL_ID = "podplay_episodes_channel";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_FEED_URL = "PodcastFeedUrl";
    public static final com.avenord.podplay.service.EpisodeUpdateService.Companion Companion = null;
    
    @java.lang.Override()
    public boolean onStartJob(@org.jetbrains.annotations.NotNull()
    com.firebase.jobdispatcher.JobParameters jobParameters) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onStopJob(@org.jetbrains.annotations.NotNull()
    com.firebase.jobdispatcher.JobParameters jobParameters) {
        return false;
    }
    
    @android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void createNotificationChannel() {
    }
    
    private final void displayNotification(com.avenord.podplay.repository.PodcastRepo.PodcastUpdateInfo podcastInfo) {
    }
    
    public EpisodeUpdateService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/avenord/podplay/service/EpisodeUpdateService$Companion;", "", "()V", "EPISODE_CHANNEL_ID", "", "getEPISODE_CHANNEL_ID", "()Ljava/lang/String;", "EXTRA_FEED_URL", "getEXTRA_FEED_URL", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEPISODE_CHANNEL_ID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_FEED_URL() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}