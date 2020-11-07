package com.avenord.podplay.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001a\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/avenord/podplay/repository/ItunesRepo;", "", "itunesService", "Lcom/avenord/podplay/service/ItunesService;", "(Lcom/avenord/podplay/service/ItunesService;)V", "searchByTerm", "", "term", "", "callBack", "Lkotlin/Function1;", "", "Lcom/avenord/podplay/service/PodcastResponse$ItunesPodcast;", "app_debug"})
public final class ItunesRepo {
    private final com.avenord.podplay.service.ItunesService itunesService = null;
    
    public final void searchByTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.avenord.podplay.service.PodcastResponse.ItunesPodcast>, kotlin.Unit> callBack) {
    }
    
    public ItunesRepo(@org.jetbrains.annotations.NotNull()
    com.avenord.podplay.service.ItunesService itunesService) {
        super();
    }
}