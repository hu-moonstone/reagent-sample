(ns ^:figwheel-no-load reagent-sample.dev
  (:require
    [reagent-sample.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
