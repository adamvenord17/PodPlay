package com.avenord.podplay.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0004\u0012\u00020\u00100\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/avenord/podplay/viewmodel/SearchViewModel;", "Landroid/arch/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "iTunesRepo", "Lcom/avenord/podplay/repository/ItunesRepo;", "getITunesRepo", "()Lcom/avenord/podplay/repository/ItunesRepo;", "setITunesRepo", "(Lcom/avenord/podplay/repository/ItunesRepo;)V", "itunesPodcastToPodcastSummaryView", "Lcom/avenord/podplay/viewmodel/SearchViewModel$PodcastSummaryViewData;", "itunesPodcast", "Lcom/avenord/podplay/service/PodcastResponse$ItunesPodcast;", "searchPodcasts", "", "term", "", "callback", "Lkotlin/Function1;", "", "PodcastSummaryViewData", "app_debug"})
public final class SearchViewModel extends android.arch.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.avenord.podplay.repository.ItunesRepo iTunesRepo;
    
    @org.jetbrains.annotations.Nullable()
    public final com.avenord.podplay.repository.ItunesRepo getITunesRepo() {
        return null;
    }
    
    public final void setITunesRepo(@org.jetbrains.annotations.Nullable()
    com.avenord.podplay.repository.ItunesRepo p0) {
    }
    
    private final com.avenord.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData itunesPodcastToPodcastSummaryView(com.avenord.podplay.service.PodcastResponse.ItunesPodcast itunesPodcast) {
        return null;
    }
    
    public final void searchPodcasts(@org.jetbrains.annotations.NotNull()
    java.lang.String term, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.avenord.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData>, kotlin.Unit> callback) {
    }
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/avenord/podplay/viewmodel/SearchViewModel$PodcastSummaryViewData;", "", "name", "", "lastUpdated", "imageUrl", "feedUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeedUrl", "()Ljava/lang/String;", "setFeedUrl", "(Ljava/lang/String;)V", "getImageUrl", "setImageUrl", "getLastUpdated", "setLastUpdated", "getName", "setName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class PodcastSummaryViewData {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String lastUpdated;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String imageUrl;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String feedUrl;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLastUpdated() {
            return null;
        }
        
        public final void setLastUpdated(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImageUrl() {
            return null;
        }
        
        public final void setImageUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFeedUrl() {
            return null;
        }
        
        public final void setFeedUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public PodcastSummaryViewData(@org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String lastUpdated, @org.jetbrains.annotations.Nullable()
        java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String feedUrl) {
            super();
        }
        
        public PodcastSummaryViewData() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.avenord.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData copy(@org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String lastUpdated, @org.jetbrains.annotations.Nullable()
        java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String feedUrl) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}