package com.example.gitdeam;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @ProjectName GitDeam
 * @CreateDate: 2020/11/9
 * @Author: wmz
 * @Description:
 */
public class MyActivityResultContract extends ActivityResultContract<String, String> {

    @NonNull
    @Override
    public Intent createIntent(@NonNull Context context, String input) {
        return new Intent().putExtra("name", input);
    }

    @Override
    public String parseResult(int resultCode, @Nullable Intent intent) {

        if (resultCode == Activity.RESULT_OK) {
            return intent.getStringExtra("result");
        }
        return null;
    }
}
