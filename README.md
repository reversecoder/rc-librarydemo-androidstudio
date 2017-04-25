# Libraries for android dev

## ProgressDialog
#### 1. ProgressFragmentDialog
##### Demo:
![ProgressFragmentDialogLogo](https://github.com/rc-librarydemo-androidstudio/rc-library/res/drawable-nodpi/rc_progress_fragment_dialog_loading.png)
##### Usage:
```
//showing progess dialog
new ProgressDialog().show(getActivity(), "Loading...", "loadingUser");

//hiding progress dialog
new ProgressDialog().hide("loadingUser");

```