<!-- Badges -->

![][android-badge]
![][kotlin-badge]
[![Contributors][contributors-shield]][contributors-url]
[![][last-commit-badge]][commits-url]

<h1>
    Potential-Octo-Pancake
</h1>
<details>
    <summary><h3>Table of contents</h3></summary>

- [About the project](#about-the-project)
  - [Build with](#build-with)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Roadmap](#roadmap)
- [Contributing](#contributing)

</details>

## About the project
Usb Tethering is connectivity app which provides internet to the laptop or any other deive which connected  to this device via Usb. 

In case of lose connection this app automatically start previous session without user have to setup usb tethering from android settings again and again.

### Build with
-   Android
-   Kotlin

## Getting Started
You require Android Studio to generate build of this application or must have familiarity with gradle build system to generate builds of this app.

### Prerequisites
- Android Studio
- Android Sdk
- Gradle
- Java
### Installation
To generate build, run:
```
gradlew assembleDebug
```
or from android studio
```
Ctrl+Shift+a
build apk
```
Then choose build apk over the options.

Find the generated output from,
```
/app/build/outputs/apk/debug/*.apk
```

## Usage
1. Connect your phone to the computer or any other device via usb.
2. Run the app into your phone & press start button
3. Then your device must get connect to the internet via usb cable.

## Roadmap
- [ ] Check device is connected to internet
- [ ] Provide internet to connected system.

## Contributing
Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement". Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (git checkout -b feature/AmazingFeature)
3. Commit your Changes (git commit -m 'Add some AmazingFeature')
4. Push to the Branch (git push origin feature/AmazingFeature)
5. Open a Pull Request

<!-- ---------------------------------------------------------- -->
<!-- References -->
<!-- Shields -->

[contributors-shield]: https://img.shields.io/github/contributors/PawanRoy1997/potential-octo-pancake?style=flat&logoColor=white
[android-badge]: https://img.shields.io/badge/Platform-Android-informational?style=flat&logo=android&logoColor=white
[kotlin-badge]: https://img.shields.io/badge/Code-Kotlin-informational?style=flat&logo=kotlin&logoColor=white
[last-commit-badge]: https://img.shields.io/github/commit-activity/m/pawanroy1997/potential-octo-pancake

<!-- Urls -->

[contributors-url]: https://github.com/PawanRoy1997/potential-octo-pancake/graphs/contributors
[commits-url]: https://github.com/PawanRoy1997/potential-octo-pancake/commits/main
