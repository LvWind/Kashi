# Kashi

[![](https://jitpack.io/v/LvWind/Kashi.svg)](https://jitpack.io/#LvWind/Kashi)

kashi = かし = 菓子

A Kotlin syntactic sugar library.

##	How to

Add it in your root build.gradle at the end of repositories:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add the dependency

```
dependencies {
	        compile 'com.github.LvWind:Kashi:-SNAPSHOT'
	}
```

Init

```kotlin
KashiExt.with(application)
```