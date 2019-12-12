# IOTA common library  

This is a collection of libraries containing models, utils, and cryptography primitives used in IOTA. It's able to use in a Bazel or CMake project. 

# Using in a Bazel project  

First you need to add `org_iota_common` to your Bazel project in the `WORKSPACE` file like this:

```
load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")

git_repository(
    name = "org_iota_common",
    commit = "6ef2af84950f56c8489623e9672c4ac882bb3961",
    remote = "https://github.com/iotaledger/iota_common.git",
)

git_repository(
    name = "rules_iota",
    commit = "e08b0038f376d6c82b80f5283bb0a86648bb58dc",
    remote = "https://github.com/iotaledger/rules_iota.git",
)

load("@rules_iota//:defs.bzl", "iota_deps")
iota_deps()
```

Then add it to dependencies in the `BUILD` file:  

```
cc_binary(
    name = "my_app",
    srcs = ["my_app.c"],
    deps = [
        "@org_iota_common//common:errors",
        "@org_iota_common//common/model:transaction"],
)
```

# Build and test via Bazel  

```shell
bazel build -- //... -//mobile/...
bazel test -- //... -//mobile/...
```

# Build and test via CMake  

```shell
mkdir build && cd build
cmake -DCMAKE_INSTALL_PREFIX=. -DTRINARY_TEST=ON ..
make -j8 && make test
```

## Contributing

Please read [CONTRIBUTING.md](https://github.com/iotaledger/iota_common/blob/master/CONTRIBUTING.md) for details.

# Contributors

| [<img src="https://avatars1.githubusercontent.com/u/3305068?v=4" width="60px;" alt="thibault-martinez"/><br /><sub><b>thibault-martinez</b></sub>](https://github.com/thibault-martinez)  | [<img src="https://avatars1.githubusercontent.com/u/37177579?v=4" width="60px;" alt="tsvisabo"/><br /><sub><b>tsvisabo</b></sub>](https://github.com/tsvisabo) | [<img src="https://avatars1.githubusercontent.com/u/30996?v=4" width="60px;" alt="th0br0"/><br /><sub><b>th0br0</b></sub>](https://github.com/th0br0)  | [<img src="https://avatars1.githubusercontent.com/u/462383?v=4" width="60px;" alt="oopsmonk"/><br /><sub><b>oopsmonk</b></sub>](https://github.com/oopsmonk)  | [<img src="https://avatars3.githubusercontent.com/u/3903636?v=4" width="60px;" alt="ifullgaz"/><br /><sub><b>ifullgaz</b></sub>](https://github.com/ifullgaz)  |
|:---:|:---:|:---:|:---:|:---:|
| [<img src="https://avatars3.githubusercontent.com/u/13924801?v=4" width="60px;" alt="HowJMay"/><br /><sub><b>HowJMay</b></sub>](https://github.com/HowJMay)  | [<img src="https://avatars3.githubusercontent.com/u/11289354?v=4" width="60px;" alt="jkrvivian"/><br /><sub><b>jkrvivian</b></sub>](https://github.com/jkrvivian)  | [<img src="https://avatars3.githubusercontent.com/u/19519564?v=4" width="60px;" alt="rajivshah3"/><br /><sub><b>rajivshah3</b></sub>](https://github.com/rajivshah3)  |   |   |