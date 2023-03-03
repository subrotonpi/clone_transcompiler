def _ ( ) :
    import sys
    import random
    import time
    from itertools import chain
    from itertools import chain
    from itertools import chain
    from itertools import sort , repeat
    from itertools import chain
    from itertools import chain
    N = len ( sys.stdin.readline ( ) )
    H = len ( sys.stdin.readline ( ) )
    sords = chain ( [ chain ( [ ] , repeat = False ) , chain ( [ ] , repeat = True ) ] , repeat = False )
    cnt = 0
    a_attach = - 1l
    while H > 0 :
        entry = sords.pop ( )
        if not entry.is_b :
            a_attach = entry.attack
            break
        H -= entry.attack
        cnt += 1
    if a_attach != - 1 :
        cnt += int ( math.ceil ( float ( H ) / a_attach ) )
    out ( cnt )
    class EntryComparator ( Comparator ) :
        def compare ( t1 , t2 ) :
            if t1.attack < t2.attack :
                return 1
            return - 1
    class Entry ( object ) :
        attack = 1
        is_b = 1
        def __init__ ( self , attack = 0 , is_b = 0 ) :
            self.attack = attack
            self.is_b = is_b
    return Entry
