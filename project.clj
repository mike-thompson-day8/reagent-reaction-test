(defproject reagent-figwheel "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src"]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript   "0.0-2665"]
                 [reagent  "0.5.0-alpha"]]


  :plugins [[lein-cljsbuild "1.0.4"]]


  :cljsbuild {:builds {:app {:source-paths ["src"]
                             :compiler {:output-to "run/compiled/app.js"
                                        :output-dir "run/compiled/out"
                                        :source-map    "run/compiled/app.js.map"
                                        :optimizations :none}}}}
  )
