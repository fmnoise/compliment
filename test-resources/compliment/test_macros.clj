(ns ^{:doc "A test macro namespace"} compliment.test-macros)

(defmacro my-add
  [a b]
  `(+ ~a ~b))

(defmacro my-sub
  [a b]
  `(- ~a ~b))
