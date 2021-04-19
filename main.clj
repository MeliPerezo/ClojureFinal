(def alphabet (seq "abcdefghijklmnopqrstuvwxyz"))
(print "Ingrese la palabra:")
(defn codificar [text valor]
  (let [cipher (->> (cycle alphabet)
                    (drop valor)
                    (take 26)
                    (zipmap alphabet))]
  (apply str (replace cipher text))))

(codificar (read-line) 2)
