# figwheel-rum-example

A Clojure/Clojurescript example of server rendered rum application

## Setup

To get an interactive development environment run:

```sh
git clone https://github.com/dibenso/figwheel-rum-example.git
cd figwheel-rum-example
lein figwheel
```

and open your browser at [localhost:3449](http://localhost:3449/).
This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

```clojure
(js/alert "Am I connected?")
```
and you should see an alert in the browser window.

To clean all compiled files:

```sh
lein clean
```

To create a production build run:
```sh
lein do clean, cljsbuild once min
lein repl
```

Once the REPL accepts input:
```clojure
(start-production-server)
```

And open your browser in `http://localhost:3000`. You will not
get live reloading.

## Contributing

1. **Fork** the repo
2. **Clone** the project to your own machine
3. **Commit** changes to your own branch
4. **Push** your work back up to your fork
5. Submit a **Pull request** so that we can review your changes

NOTE: Be sure to merge the latest from "upstream" before making a pull request!

## Authors

* [**Dillon Benson**](https://github.com/dibenso)

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/dibenso/figwheel-rum-example/blob/master/LICENSE.md) file for details
