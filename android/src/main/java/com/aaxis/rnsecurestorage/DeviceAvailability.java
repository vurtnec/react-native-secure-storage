package com.aaxis.rnsecurestorage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;

/**
 * Created by zacharyhou on 2019/11/22.
 */

class DeviceAvailability {

    public static boolean isFingerprintAuthAvailable(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            FingerprintManager fingerprintManager =
                    (FingerprintManager) context.getSystemService(Context.FINGERPRINT_SERVICE);
            return fingerprintManager.isHardwareDetected() &&
                    fingerprintManager.hasEnrolledFingerprints();
        }
        return false;
    }
}
