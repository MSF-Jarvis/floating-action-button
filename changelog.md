Change Log
==========

Unreleased
---------------------------------
* Disable `BuildConfig` generation.

Version 3.2.0 *(2019-11-24)*
---------------------------------
* Added `fab_drawable` attribute to `FloatingActionsMenu` to override drawable used for expandable menu
* Added `fab_disableRotationOnExpand` attribute to `FloatingActionsMenu` to enable/disable the rotation on expand/collapse.
* Update to Kotlin 1.3.60
* Update library dependencies

Version 3.1.0 *(2019-09-07)*
---------------------------------
* Compile against Kotlin 1.3.50
* Compile against SDK 29
* Update library dependencies

Version 3.0.0 *(2019-01-08)*
---------------------------------
* Rewrite entire library in Kotlin. Java interop is a granted, but not
  supported. YMMV.
* Fix LabeledFloatingActionButton#setText call not actually working, thanks
  to KreAch3r for the report.

Version 2.1.2 *(2018-12-24)*
---------------------------

* Add attribute fab_forceWhiteAddIcon to ignore DayNight

Version 2.1 *(2018-12-24)*
-------------------------

* Migrate to AndroidX and Material Components
* Render using support libraries rather than drawing things ourselves

Version 1.10.1 *(2015-10-23)*
----------------------------

 * Use hardware layers to get smoother animations

Version 1.10.0 *(2015-07-17)*
----------------------------

 * Added `FloatingActionsMenu.collapseImmediately()`
 * Fixed `setEnabled` behavior on FloatingActionsMenu
 * Fixed minor bug in FloatingActionsMenu height calculation
 * Fixed issue with manual menu creation

Version 1.9.1 *(2015-06-09)*
----------------------------

 * Fixed issue with missing label on FloatingActionButton added, remove and added again
 * Fixed libpng warings on processing shadow resources. Bonus: new assets are a bit lighter

Version 1.9.0 *(2015-03-14)*
----------------------------

 * Labels are now clickable

Version 1.8.0 *(2015-02-18)*
----------------------------

 * Added `fab_labelsPosition` attribute
 * Fixed issue with labels style being overridden by theme style

Version 1.7.0 *(2015-02-01)*
----------------------------

 * Added removeButton API to FloatingActionsMenu
 * Fixed NPEs related to incorrect animators initialization
 * Fixed labels positions for FloatingActionsMenu with mini add button

Version 1.6.0 *(2015-01-16)*
----------------------------

 * Added disabled state for FloatingActionButton background
 * Added button size attribute for FloatingActionsMenu add button

Version 1.5.1 *(2014-12-30)*
----------------------------

 * Fixed setting FloatingActionButton icon with `fab_icon` XML attribute
 * Fixed issues with changing visibility of FloatingActionButtons inside FloatingActionsMenu


Version 1.5.0 *(2014-12-30)*
----------------------------

 * Added icon drawable setter for FloatingActionButton
 * Better looking strokes of FloatingActionButtons
 * Option to disable strokes of FloatingActionButton

Version 1.4.0 *(2014-12-21)*
----------------------------

 * Added labels setter for FloatingActionButton
 * Reduce memory footprint of FloatingActionButton and fix OOM issues.

Version 1.3.0 *(2014-12-08)*
----------------------------

 * Added support for labels in FloatingActionsMenu expanding in vertical direction.

Version 1.2.1 *(2014-12-04)*
----------------------------

 * Fixed IDE error when using `setSize(FloatingActionButton.SIZE_FOO)` setter.

Version 1.2.0 *(2014-12-02)*
----------------------------

 * Fixed horizontal alignment of mini FloatingActionButtons in FloatingActionsMenu
 * Added support for different FloatingActionsMenu expand directions
 * Support transparent buttons 
 * Added xxxhdpi drawables
 * Added consumer proguard configuration to library
 * Added getters and setters for FloatingActionButton properties
 * Exposed FloatingActionsMenu isExpanded property

Version 1.1.0 *(2014-10-23)*
----------------------------

 * Fixed issue with broken animation state after screen rotation
 * Fixed name clash with appcompat v21. All FloatingActionButton attributes are now prefixed with 'fab_' prefix

Version 1.0.0 *(2014-09-19)*
----------------------------

 * Initial release.
