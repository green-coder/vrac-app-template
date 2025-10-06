# vrac-app-template

Vrac app template

## Usage

This is a template project for use with [deps-new](https://github.com/seancorfield/deps-new).
As originally generated, it will produce a new library project when run:

    $ clojure -Sdeps '{:deps {io.github.green-coder/vrac-app-template {:git/sha "LATEST-COMMIT-SHA"}}}' -Tnew create :template org.example/my-vrac-app :name org.example/my-vrac-app

Assuming you have installed `deps-new` as your `new` "tool" via:

```bash
clojure -Ttools install-latest :lib io.github.seancorfield/deps-new :as new
```

## License

This project is distributed under the [Eclipse Public License v2.0](LICENSE).

Copyright (c) Vincent Cantin and contributors.
