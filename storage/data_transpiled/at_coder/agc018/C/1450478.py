def _main ( ) :
    import sys
    import random
    import math
    import random
    import time
    class Main ( object ) :
        def __init__ ( self ) :
            self._main = 1
        def __call__ ( self , * args ) :
            with open ( self._main , 'r' ) as sc :
                X = sc.read ( )
                Y = sc.read ( )
                Z = sc.read ( )
        def tr ( self , * args ) :
            print ( [ x for x in args ] )
    class F ( object ) :
        def __init__ ( self , v_ , id_ ) :
            self.v = v_
        def __call__ ( self , * args ) :
            return self.v
        def tr ( self , * args ) :
            print ( [ x for x in args ] )
    A = [ ]
    B = [ ]
    lis = [ ]
    ADD = 0
    for i in range ( S ) :
        A.append ( sc.read ( ) )
        B.append ( sc.read ( ) )
        C = sc.read ( )
        ADD += C
        A [ i ] -= C
        B [ i ] -= C
        lis.append ( [ A [ i ] - B [ i ] , i , A [ i ] , B [ i ] ] )
    lis.sort ( key = lambda x : - int ( x [ 0 ] ) )
    for i in range ( S ) :
        A.append ( lis [ i ] [ 2 ] )
        B.append ( lis [ i ] [ 3 ] )
    cum1 = [ ]
    cum2 = [ ]
    cum1.append ( - random.randrange ( 10 ) )
    cum2.append ( random.randrange ( 10 ) )
    pq = [ ]
    cur = 0
    for i in range ( S ) :
        pq.append ( A [ i ] )
        cur += A [ i ]
        while pq.pop ( ) > X :
            cur -= pq [ - 1 ]
            pq.pop ( )
        if pq.pop ( ) == X :
            cum1.append ( max ( cum1 ) )
    pq = [ ]
    for i in range ( S ) :
        pq.append ( i )
    return ans
