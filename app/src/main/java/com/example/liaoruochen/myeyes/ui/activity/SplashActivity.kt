package com.example.liaoruochen.myeyes.ui.activity

import android.Manifest
import android.app.AlertDialog
import android.os.Bundle
import androidx.annotation.StringRes
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.base.BaseActivity
import com.example.liaoruochen.myeyes.utilities.toast
import permissions.dispatcher.*


@RuntimePermissions
class SplashActivity : BaseActivity() {
    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        showPermissionsCheck()
    }


    override fun initView(savedInstanceState: Bundle?) {

    }

    override fun requestData() {

    }


    private fun showPermissionsCheck() {
        enterMainActivityWithPermissionCheck()
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        onRequestPermissionsResult(requestCode, grantResults)
    }


    @NeedsPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_PHONE_STATE)
    fun enterMainActivity() {
        MainActivity.startMainActivity(this)
        finish()
    }

    @OnShowRationale(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_PHONE_STATE)
    fun showRationaleForPermissions(request: PermissionRequest) {
        showRationaleDialog(R.string.rationale_permission, request)
    }

    @OnPermissionDenied(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_PHONE_STATE)
    fun onPermissionsDenied() {
        finish()
    }

    @OnNeverAskAgain(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_PHONE_STATE)
    fun onPermissionsNeverAskAgain() {
        "onPermissionsNeverAskAgain".toast(this)
    }


    private fun showRationaleDialog(@StringRes messageResId: Int, request: PermissionRequest) {
        AlertDialog.Builder(this)
            .setPositiveButton(
                R.string.button_allow
            ) { _, _ -> request.proceed() }
            .setNegativeButton(
                R.string.button_deny
            ) { _, _ -> request.cancel() }
            .setCancelable(false)
            .setMessage(messageResId)
            .show()
    }


}
