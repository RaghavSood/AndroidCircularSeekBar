Usage
=====

To use the CircularSeekBar in your project, you must copy the `CircularSeekBar.java` file into your package, and add the images from the `res` folder to the corresponding folders in your project. You can use your own images as well, but you will need to update the name in the Java code accordingly.

Basic usage in pure Java Code:

```java
CircularSeekBar circularSeekbar;
circularSeekbar = new CircularSeekBar(this);
circularSeekbar.setMaxProgress(100);
circularSeekbar.setProgress(100);
setContentView(circularSeekbar);
circularSeekbar.invalidate();

circularSeekbar.setSeekBarChangeListener(new OnSeekChangeListener() {

      @Override
      public void onProgressChange(CircularSeekBar view, int newProgress) {
          Log.d("Welcome", "Progress:" + view.getProgress() + "/" + view.getMaxProgress());
      }
});
```

Usage from XML is like any other View. The only thing you must keep in mind is to use the tags `<com.your.package.CircularSeekBar></com.your.package.CircularSeekBar>` when referencing the SeekBar.

Usage options
=============

The SeekBar provides ways to customize several aspects in it.

Changing the width of the progress indication
---------------------------------------------

Call `circularSeekbar.setBarWidth(int)` to change the width of the ring to the specified value.

Setting current and maximum progress
------------------------------------

Call `circularSeekbar.setProgress(int)` to set the current progress, and `circularSeekbar.setMaxProgress(int)` to set the maximum possible value for progres. Percentage will automatically be updated when you call `setProgress()`

Set the colors of the parts of the View
---------------------------------------

You can alter the appearance of the view to any colors your like.

`circularSeekbar.setBackGroundColor(int)` changes the color of the background Circle to what you pass. It is black by default.
`circularSeekbar.setProgressColor(int)` changes the color of the progress indicator. It is Holo compliant blue by default.
`circularSeekbar.setRingBackGroundColor(int)` sets the color of the part not covered by the progress indicator. It is gray by default.

The Adjustment Factor
---------------------

In some cases you may make the width of the progress ring kinda narrow to make the UI look better. In such a case, you can specify a larger area for touch and progress change detection by calling `circularSeekbar.setAdjustmentFactor(int)`. This will create a ring with the specified width on both sides of the SeekBar on which touch events will be processed as those that move the SeekBar. The rings will be invisible.
