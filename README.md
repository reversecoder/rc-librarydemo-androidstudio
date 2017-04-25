# Libraries for android dev

## ProgressDialog
#### 1. ProgressFragmentDialog
##### Demo:
![ProgressFragmentDialogLogo](https://github.com/reversecoder/rc-librarydemo-androidstudio/blob/master/rc-library/res/drawable-nodpi/ic_progress_fragment_dialog_loading.png)
##### Usage:
```
//showing progess dialog
new ProgressDialog().show(getActivity(), "Loading...", "loadingUser");

//hiding progress dialog
new ProgressDialog().hide("loadingUser");

```

#### 2. AsyncTask

##### a) AsyncJob

###### Usage:
i) Sequential dependent tasks
```
AsyncJob.AsyncAction<TaskResult> loadScreenLayoutData = new AsyncJob.AsyncAction<TaskResult>() {
        @Override
        public TaskResult doOnBackground() {
            AsyncJob.publishProgress(1L, 78L);
            return new TaskResult(true);
        }

        @Override
        public void doOnProgress(Long... progress) {
            if (progress.length == 1) {
                if (progress[0] == 1L) {
                    progressText = "Loading screen layout information, please standby...";
                }
                progressPercentage = progress[0].intValue();
                progressTextView.setText(progressText + " / " + progressPercentage + "%");
            }
        }

        @Override
        public void doWhenFinished(TaskResult taskResult) {
            if (taskResult.isSuccess() && (Boolean) taskResult.getResult()) {
                //do some thing
            }
        }
    };

    ExecutorService executorService = Executors.newSingleThreadExecutor();
    FutureTask ftLoadScreenLayoutData = AsyncJob.doInBackground(loadScreenLayoutData, executorService);
    FutureTask ftProcessPreLoading = AsyncJob.doInBackground(processPreLoading, executorService);
    executorService.shutdown();
```
ii) Standalone background job

iii) Standalone ui thread job

iv) Builder job

##### b) AdvancedAsyncTask