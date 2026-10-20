# Better Selection (NeoForge)

Unofficial NeoForge port of [Better Selection](https://modrinth.com/mod/better-selection) by MDLC01.
Please don't report issues to MDLC01, use this repo's issue tracker.

Makes text more pleasant to select. Ctrl+Left and Ctrl+Right jump between words the way they do in a normal
text editor, instead of skipping over punctuation, numbers and spaces in odd ways. Works in every text box:
chat, commands, signs, anvils, search bars and so on.

- Words, numbers (like `3.14` or `$5`), punctuation and spaces are treated as separate steps
- Clicking in a text box puts the cursor on the nearest side of the letter you clicked
- On 1.21.1 you can also drag to select text, which vanilla only added later
- Works with right-to-left text and the usual macOS shortcuts

Client-side only, no dependencies, fine to put in modpacks.

| Minecraft | NeoForge | Java |
|---|---|---|
| 1.21.1 | 21.1.252 or newer | 21 |
| 1.21.10 | 21.10.64 or newer | 21 |
| 1.21.11 | 21.11.48 or newer | 21 |
| 26.1.2 | 26.1.2.122 or newer | 25 |
| 26.2 | 26.2.0.93 or newer | 25 |
| 26.3 | 26.3.0.94 or newer | 25 |

## Install
Put the jar for your Minecraft version in the `mods` folder of a NeoForge instance. Servers do not need it.

## Build
Each Minecraft version is its own Gradle project under `versions/`.

```
cd versions/26.3
./gradlew build
```

The jar lands in `versions/<version>/build/libs/`.

## Licence
Public domain (Unlicense), same as the original. See [LICENSE](LICENSE).
