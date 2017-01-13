// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.android.java.miss.tmdbmovies.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

public final class NetworkModule_ProvideOkhttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  public NetworkModule_ProvideOkhttpClientFactory(NetworkModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkhttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(NetworkModule module) {
    return new NetworkModule_ProvideOkhttpClientFactory(module);
  }

  /** Proxies {@link NetworkModule#provideOkhttpClient()}. */
  public static OkHttpClient proxyProvideOkhttpClient(NetworkModule instance) {
    return instance.provideOkhttpClient();
  }
}