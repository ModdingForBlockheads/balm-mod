# Balm Mod Template

This is a template project that can be used to setup a multi-loader Minecraft Mod development environment with Balm.

The gradle setup is heavily based on [Jared's MultiLoader Template](https://github.com/jaredlll08/MultiLoader-Template).

## Getting Started

- Click "Use this template" on GitHub to create a new repository based on this template.
- Clone the repository to your local machine.
- Open the project in IntelliJ IDEA.
- Open `gradle.properties` and configure your mod's metadata.
- Now that you've set a mod id, you should rename all instances of `yourmod` and `YourMod` to your mod id / name, both
  in code and in file names.
- The majority of code lies in the `common` folder, while the mod-loader specific folders are only needed for
  implementing third party mod compatibility.
- The template includes a basic example for most of Balm's features. Delete parts that you don't need before releasing
  your mod.
- Don't forget to replace your mod's logo in `common/src/main/resources/yourmod-icon.png`.

If you need to add dependencies, do so in `dependencies.gradle`. I recommend leaving the `build.gradle` files untouched
to make updating to newer versions of the template easier.

## Structure

### gradle.properties

Configure the mod's metadata as well as any mod loader or dependency versions in this file.

Ideally, you should never make changes to `build.gradle` directly.

### CHANGELOG.md

This file is used as a changelog for uploads to Modrinth and CurseForge.

### LICENSE

You should replace this file with a license of your choice.

Unless you fully understand the implications of the license you choose, you should keep this as All Rights Reserved.

### modpage.md

This is used for Modrinth's `modrinthSyncBody` gradle task, updating the Modrinth project page to match the Markdown
file.

### repositories.gradle

This is where Maven repositories for fetching dependencies are configured.
It is good practice to filter each repository to only the groups you expect to download from them.

## Contributing

If you're interested in contributing to the mod, you can check
out [issues labelled as "help wanted"](https://github.com/TwelveIterationMods/balm-mod/issues?q=is%3Aopen+is%3Aissue+label%3A%22help+wanted%22).

When it comes to new features, it's best to confer with me first to ensure we share the same vision. You can join us
on [Discord](https://discord.gg/VAfZ2Nau6j) if you'd like to talk.

Contributions must be done through pull requests. I will not be able to accept translations, code or other assets
through any other channels.
