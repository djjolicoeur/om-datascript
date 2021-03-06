(defproject om-datascript "0.0.3"
  :description "Make om and datascript play nice"
  :url "http://github.com/bahulneel/om-datascript"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [datascript "0.6.0"]
                 [om "0.7.3"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild { 
    :builds [{:id "om-datascript"
              :source-paths ["src"]
              :compiler {
                :output-to "om_datascript.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
