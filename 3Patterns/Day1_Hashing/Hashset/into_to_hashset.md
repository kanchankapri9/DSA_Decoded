A HashSet is a bag of UNIQUE values.

It only cares:
Does it exist?

It does NOT care:
Position
Frequency
Order


HashSet<Integer> set = new HashSet<>();
set.add(10);
set.add(20);// add
set.add(30);
set.contains(5);   // search
set.remove(5);     // remove
set.size();        // size




When I only need existence checking
or duplicate detection.

HashSet provides O(1) average lookup.