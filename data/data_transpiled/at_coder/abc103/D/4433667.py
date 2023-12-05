def main ( ) :
    import sys
    from collections import deque
    from random import randint
    from random import randint
    from collections import deque
    from random import random
    from collections import deque
    from random import random
    from collections import deque
    from random import random
    from collections import deque
    from random import random
    N = randint ( 1 , N )
    M = randint ( 1 , N )
    pq = deque ( maxlen = N , maxlen = random.randint ( 1 , M ) )
    for i in range ( M ) :
        entry = deque ( random ( ) , maxlen = random.randint ( 1 , M ) )
        pq.append ( entry )
    entry = pq.popleft ( )
    max_b = entry.b
    ans = 1
    while not pq.empty ( ) :
        entry = pq.popleft ( )
        if entry.a >= max_b :
            ans += 1
            max_b = entry.b
        else :
            max_b = min ( entry.b , max_b )
    print ( ans )
    class EntryComparator ( Comparator ) :
        def compare ( t1 , t2 ) :
            if t1.a >= t2.a :
                return 1
            return - 1
    class Entry ( Comparator ) :
        def compare ( self , t1 ) :
            return cmp ( self.a , t1.b )
    class Entry ( Comparator ) :
        def compare ( self , t2 ) :
            return cmp ( self.a , t2.b )
    return Entry
