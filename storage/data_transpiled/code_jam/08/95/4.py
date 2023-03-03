def _import ( ) :
    from math import pow , fill , copy
    from collections import deque
    from math import floor , fill
    from math import ceil , fill
    class E ( object ) :
        def __init__ ( self ) :
            super ( E , self ).__init__ ( )
            self.__count = 0
        def __init__ ( self ) :
            super ( E , self ).__init__ ( )
            self.__count = 0
    INF = 1 << 29
    def __init__ ( self ) :
        sc = sys.stdin
        on = sc.count
        for o in range ( 1 , on + 1 ) :
            print ( "Case #%d: " % o , end = "" )
            n , m = sc.count
            as , bs = [ 0 ] * max ( n , m ) + [ 1 ] , [ 0 ] * max ( n , m )
            for i in range ( 1 , n + 1 ) :
                cs = sc.next ( )
                for j in range ( m ) :
                    if cs [ j ] == '#' :
                        if n < m :
                            as [ 1 + j ] |= 1 << ( i - 1 )
                        else :
                            as [ i ] |= 1 << j
                    if cs [ j ] == '?' :
                        if n < m :
                            bs [ 1 + j ] |= 1 << ( i - 1 )
                        else :
                            bs [ i ] |= 1 << j
            if n < m :
                t = n
                n = m
                m = t
    count = [ 0 ] * len ( dp )
    ok = [ True for i in range ( 1 << m ) ]
    for i in range ( 1 << m ) :
        count2 [ i ] = sum ( [ i for i in range ( m ) if i & 1 << j ] )
        ok.append ( True )
        for j in range ( 1 << m ) :
            if i > 0 and ( i & 1 << ( j - 1 ) ) :
                count [ i ] -= 1
            if j + 1 < m and ( i & 1 << ( j + 1 ) ) :
                count [ i ] -= 1
            if i > 0 and ( i & 1 << ( j - 1 ) ) :
            INDENT