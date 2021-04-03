# CocoaPods
### I. `pod install` vs. `pod update` and Podfile.lock
- `pod install`:
   - Used the first time you want to obtain pods and whenever you edit the Podfile to add/remove/update a pod.
   - When executed, the not-yet-installed pods' version are written `Podfile.lock`
     - For pods not in `Podlock.lock`, it looks for a version marching the Podfile.
     - For pods in `Podlock.lock`, it downloads them w/o obtaining new ones.
- `pod update`:
   - Looks for for new versions without consulting `Podfile.lock`.
   - It updates pods to the latest version possible as long as it still adhered to Podfile.
   - Thus, `update` overrides `Podfile.lock`.
- `pod outdated`:
   - lists all pods w/ newever version than currently installed.
### II. Getting Setup with Trunk
- Required for making pods public.
- `pod trunk register <email> '<alias>' --description='<description>'` to signup (and create a session).
- `pod trunk me` to list sessions.
- `pod trunk push <podspec_name>.podspec` deploys podspec to trunk (public).
- `pod repo push <repo_name> <podspec_name>.podspec` deploys podspec to private specs repo.
- `pod spec lint <podspec_name>.podspec` to lint podspec for compliance.

### III. Creating and Publishing a CocoaPod
- Create a Github repo that will house the pod.
- `pod lib create <name_of_github_repo>` to create standard Cocoapods project:
   - Choose **Swift**, **yes** for demo application, **yes** for sample application, **no** for testing frameworks, **no** for view-based testing.
   - In Xcode, choose to update settings when warning occurs.
- Make podspec file adhere to standards:
   - ...
   - With each change, run `pod lib lint` to test compliance.
- Replace `ReplaceMe.swift` with your own Swift file:
   - uncheck `swift_file_name_Example` and `swift_file_name_Tests` and check `swift_file_name`.
- Push the project to Github repo.
- Ensure you completed Trunk related steps.
- Push pod to Trunk.