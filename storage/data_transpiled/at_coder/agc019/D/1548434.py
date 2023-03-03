def _import ( ) :
    import sys
    import random
    import time
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
        def __call__ ( self , * args ) :
            with open ( "/dev/null" , "r" ) as sc :
                print ( self._eval ( sc.read ( ) ) )
        def __call__ ( self , * objects ) :
            with open ( "/dev/null" , "r" ) as sc :
                self._eval ( sc.read ( ) )
        def _tr ( self , * objects ) :
            with open ( "/dev/null" , "r" ) as sc :
                self._eval ( sc.read ( ) )
        def _tr ( self , * objects ) :
            with open ( "/dev/null" , "r" ) as sc :
                self._eval ( sc.read ( ) )
    n = len ( A )
    BBB = B + B + B
    prev1 = [ ]
    next1 = [ ]
    for i in range ( len ( BBB ) ) :
        if BBB [ i ] == '1' :
            prev1.append ( i )
        else :
            if i > 0 :
                prev1.append ( prev1 [ i - 1 ] )
            else :
                prev1.append ( - 1 )
    for i in range ( len ( BBB ) - 1 , - 1 , - 1 ) :
        if BBB [ i ] == '1' :
            next1.append ( i )
        else :
            if i + 1 < len ( BBB ) :
                next1.append ( next1 [ i + 1 ] )
            else :
                next1.append ( BBB [ i ] )
    ans = long ( )
    out :
        for rot in range ( - n , n + 1 ) :
            distinct = [ ]
            n10 , n01 = 0 , 0
            for i in range ( n ) :
                if A [ i ] == BBB [ ( i + n ) + rot ] :
                    continue
                distinct.append ( True )
                if A [