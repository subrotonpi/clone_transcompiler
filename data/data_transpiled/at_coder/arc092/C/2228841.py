def _import ( ) :
    import sys
    import os
    import sys
    class Main ( object ) :
        def solve ( self ) :
            n = ni ( )
            a = na ( n )
            p = [ 1 ] + ( n % 2 == 1 )
            q = [ ]
            for i in range ( n // 2 ) :
                a.append ( ni ( ) )
        def main ( self ) :
            start = time.time ( )
            debug = sys.argv [ 1 ] if debug else None
            if debug :
                try :
                    fp = _open ( sys.argv [ 1 ] , 'r' )
                except :
                    raise
            else :
                fp = _open ( sys.argv [ 1 ] , 'w' )
            fp.flush ( )
            tr ( ( time.time ( ) - start ) + 'ms' )
        def ntable ( n , m ) :
            table = [ ]
            for v in p :
                if v :
                    max1 += v
            for v in q :
                if v :
                    max2 += v
            l = [ ]
            for v in a :
                l.append ( int ( v ) )
            if max1 == int ( max2 ) :
                max = int ( max1 )
                max_idx = 0
                for i in range ( n ) :
                    if max < a [ i ] :
                        max = a [ i ]
                        max_idx = i
            for i in range ( max_idx ) :
                if fp != sys.stdin :
                    print ( _import ( sys.stdin , sys.stdout ) )
            while l :
                l.append ( 1 )
                l.pop ( )
                l.pop ( )
    else :
        if max1 < max2 :
            l.append ( 1 )
            l.pop ( )
    ptr = 0
    while l and ptr < len ( l ) :
        if l [ ptr ] < 0 :
            if ptr == 0 :
                l.append ( 1 )
                l.pop ( )
                l.pop ( )
            elif ptr == len ( l ) :
                l.pop ( )
    return l
