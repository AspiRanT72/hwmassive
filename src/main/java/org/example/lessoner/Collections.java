package org.example.lessoner;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Collections {
    @Contract(value = "_ -> new", pure = true)
    public static <T> @NotNull Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection); // HashSet - это коллекция, которая не содержит дубликатов
    }
    public static void compare2Lists() {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
    }
}
