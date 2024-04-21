# Абстрактные классы и интерфейсы 

7.7. Подсчёт элементов

___

Задача
--------

>>Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>, где K — значение из массива, а Integer — количество вхождений в массив.

То есть сигнатура `метода` выглядит так:

~~~Java
    <K> Map<K, Integer> arrayToMap(K[] ks);
~~~

___
Решение:
--------

~~~Java
    public static <K> Map<K, Integer> countValues(K[] ks) {
        Map<K, Integer> map = new HashMap<>();

        for (K k : ks) {
            map.compute(k, new BiFunction<K, Integer, Integer>() {
                @Override
                public Integer apply(K k, Integer count) {
                    return count == null ? 1 : count + 1;
                }
            });
        }

        return map;
    }
~~~


Итог: 
--------

>- [X] Есть готовое решение :heavy_check_mark:
>- [X] Свой код написан :heavy_check_mark:

Сложность :white_check_mark: :white_check_mark: :white_check_mark:
