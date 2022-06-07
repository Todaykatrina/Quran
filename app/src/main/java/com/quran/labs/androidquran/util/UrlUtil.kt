package com.quran.labs.androidquran.util

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UrlUtil @Inject constructor() {

  fun fallbackUrl(url: String): String {
    return url.replace("android.quran.com", "quran.app")
        .replace(".quranicaudio.com", ".quranicaudio.org")
  }
}
