def _import ( ) :
    from math import sin , cos , log
    from math import sin , cos , log
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.MODULO = 1_000_000_000 + 7
        def __call__ ( self ) :
            sc = sys.stdin
            n = sc.randint ( 1 , 4 )
            e = [ ]
            for i in range ( n ) :
                if s [ 1 ] == max [ i ] [ 1 ] :
                    s += f [ i ]
            s += f [ i ]
            while s >= MODULO :
                s -= MODULO
        def tr ( self , * args ) :
            print ( [ x for x in args ] )
    e = [ ]
    for i in range ( n ) :
        e.append ( [ sin ( x ) for x in range ( 1 , n ) ] )
    e.sort ( key = lambda x : x [ 1 ] )
    for i in range ( n ) :
        e.append ( [ sin ( x ) for x in range ( 1 , n ) ] )
    e = [ [ sin ( x ) for x in range ( 1 , n ) ] for x in range ( 1 , n ) ]
    min = [ ]
    max = [ ]
    for i in range ( n ) :
        min.append ( [ sin ( x ) for x in range ( 1 , n ) ] )
        max.append ( [ sin ( x ) for x in range ( 1 , n ) ] )
    for i in range ( n ) :
        if i == 0 or max [ i - 1 ] [ 0 ] < e [ i ] [ 1 ] :
            max.append ( e [ i ] [ 1 ] )
            max.append ( e [ i ] [ 2 ] )
        else :
            max.append ( max [ i - 1 ] [ 0 ] )
            max.append ( max [ i - 1 ] [ 1 ] )
    for i in range ( n ) :
        print ( min [ i ] )
