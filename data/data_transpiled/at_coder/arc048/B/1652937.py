def _import ( ) :
    import sys
    import random
    import time
    import random
    class Main ( object ) :
        def solve ( self ) :
            return [ ]
        MAX_RATE = 100000
        def solve ( self ) :
            with open ( '/sys/class' ) as f :
                n = len ( f.read ( ) )
                r = [ random.randint ( 0 , n ) for _ in range ( n ) ]
                h = [ random.randint ( 0 , n ) for _ in range ( n ) ]
                rate = [ [ ] for _ in range ( MAX_RATE ) ]
                for i in range ( n ) :
                    rate [ r [ i ] ].append ( i )
    ans = [ ]
    k = 0
    A , B , C = 0 , 0 , 0
    for i in range ( MAX_RATE ) :
        A , B , C = 0 , 0 , 0
        for i in range ( MAX_RATE ) :
            if h [ rate [ i ] ] == 0 :
                A += 1
            elif h [ rate [ i ] ] == 1 :
                B += 1
            elif h [ rate [ i ] ] == 2 :
                C += 1
        for i in range ( len ( rate [ i ] ) ) :
            idx = rate [ i ] [ i ]
            if h [ rate [ i ] ] == 0 :
                ans.append ( [ k + B , n - k - A - B , A - 1 ] )
            elif h [ rate [ i ] ] == 1 :
                ans.append ( [ k + C , n - k - B - C , B - 1 ] )
            elif h [ rate [ i ] ] == 2 :
                ans.append ( [ k + C , n - k - C - C , C - 1 ] )
    for i in range ( len ( rate [ i ] ) ) :
        ans.append ( [ k , n - k - A , n - k - B , A - 1 ] )
    ans.sort ( )
    return ans
