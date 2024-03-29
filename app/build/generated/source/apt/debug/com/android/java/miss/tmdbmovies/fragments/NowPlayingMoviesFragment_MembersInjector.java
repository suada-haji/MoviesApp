// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.android.java.miss.tmdbmovies.fragments;

import com.android.java.miss.tmdbmovies.network.ApiManager;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class NowPlayingMoviesFragment_MembersInjector
    implements MembersInjector<NowPlayingMoviesFragment> {
  private final Provider<ApiManager> apiManagerProvider;

  private final Provider<Picasso> picassoProvider;

  public NowPlayingMoviesFragment_MembersInjector(
      Provider<ApiManager> apiManagerProvider, Provider<Picasso> picassoProvider) {
    assert apiManagerProvider != null;
    this.apiManagerProvider = apiManagerProvider;
    assert picassoProvider != null;
    this.picassoProvider = picassoProvider;
  }

  public static MembersInjector<NowPlayingMoviesFragment> create(
      Provider<ApiManager> apiManagerProvider, Provider<Picasso> picassoProvider) {
    return new NowPlayingMoviesFragment_MembersInjector(apiManagerProvider, picassoProvider);
  }

  @Override
  public void injectMembers(NowPlayingMoviesFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.apiManager = apiManagerProvider.get();
    instance.picasso = picassoProvider.get();
  }

  public static void injectApiManager(
      NowPlayingMoviesFragment instance, Provider<ApiManager> apiManagerProvider) {
    instance.apiManager = apiManagerProvider.get();
  }

  public static void injectPicasso(
      NowPlayingMoviesFragment instance, Provider<Picasso> picassoProvider) {
    instance.picasso = picassoProvider.get();
  }
}
