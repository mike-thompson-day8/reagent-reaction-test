# reagent-reaction-test

Used to test if using `reaction` in a `subscription-like` manner causes a memory leak. 

### Steps

Get The Repo and Compile:
1.  clone repo 
2.  cd to root directory of repo
3.  `lein cljsbuild once`
4.  load `run/index.html` into Chrome.

In Chrome:
1. press F12 to get devtools
2. click "Profiles" Tab
3. Choose "Record Heap Allocations"
4. Click "Start", wait a while (30 seconds?) press the red dot to stop

Inspect the Snapshot:
1. Double click on the "row of grey bars", whcih will create a small sliding window. 
2. Move the window around trying to see if there's any leaks
