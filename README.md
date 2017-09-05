# Kashi

[![](https://jitpack.io/v/LvWind/Kashi.svg)](https://jitpack.io/#LvWind/Kashi)

kashi = かし = 菓子

A Kotlin syntactic sugar and Extensions library.

##	How to

Add it in your root build.gradle at the end of repositories:

```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add the dependency

```groovy
dependencies {
	        implementation 'com.github.LvWind:Kashi:<latest-version>'
	}
```

Init

```kotlin
KashiExt.with(application)
```