**PREVIEW**

![randumi](https://github.com/user-attachments/assets/4949f7c1-287a-4e25-bc20-88b19bc37157)



**-------------------------------------------------------------------------------------------------------------**

Prerequisites

    Java Development Kit (JDK) installed.
    Android Studio installed.
    Android SDK set up.
    Git installed on your system.
    Android device (with USB debugging enabled) or an emulator.

Step 1: Clone the Repository

    Open your terminal (or command prompt).
    Navigate to the directory where you want to clone the repository.
    Run the following command, replacing <repo-url> with your GitHub repository URL:


bash

    `git clone https://github.com/linuxLover-byte/Randumi.git`


Navigate into the cloned repository:

bash

    `cd <repository-name>`

Step 2: Open the Project in Android Studio

    Open Android Studio.
    Click on Open an existing Android Studio project.
    Navigate to the folder where you cloned your repository and select it.

Step 3: Sync Project with Gradle Files

    Once the project opens, it may prompt you to sync the Gradle files. Click on Sync Now.
    Wait for the build process to finish. If there are any errors, check the terminal output for details.

Step 4: Set Up an Emulator (if needed)

    Click on the AVD Manager icon in Android Studio (it looks like a phone).
    Click on Create Virtual Device.
    Choose a device definition and click Next.
    Select a system image (ensure it's installed) and click Next.
    Configure the emulator settings and click Finish.

Step 5: Build and Run on Emulator

    Select the emulator from the device dropdown menu in the toolbar.
    Click the green Run button (or press Shift + F10).
    The app will compile, install, and launch on the emulator.

Step 6: Run on a Physical Device

    Connect your physical device to your computer via USB.
    Ensure USB debugging is enabled on the device (Settings > Developer options > USB debugging).
    Select your physical device from the device dropdown menu in Android Studio.
    Click the green Run button again.
    The app will install and launch on your physical device.

Step 7: Troubleshooting

    If the app doesn’t install, check that your device is recognized (you can use adb devices command in the terminal).
    Ensure that your device has enough space and that the app's permissions are granted if needed.

Additional Notes

    Make sure to check your app's build.gradle files for any dependencies or configurations specific to your project.
    Keep your Android Studio and SDK tools updated to avoid compatibility issues.
