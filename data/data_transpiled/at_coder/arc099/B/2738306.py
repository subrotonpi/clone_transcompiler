def _import ( ) :
    import sys
    import os
    import sys
    import os
    import set
    import sys
    import os
    import sys
    class Main ( ) :
        def solve ( ) :
            k = ni ( )
            set = set ( )
            for i in range ( 1 , 10000 ) :
                outer :
                    for j in range ( 20 ) :
                        now = i
                        for s in range ( j ) :
                            now *= 10
                            now += 9
                            if now > 10e15 :
                                continue outer
                    set.add ( now )
        def nlist ( n , m ) :
            for i in range ( m ) :
                table [ i ] = ni ( )
        def tr ( * x ) :
            if sys.stdin is not sys.__stdin__ :
                print ( _import ( ) )
            return x
        def ntable ( n , m ) :
            for i in range ( n ) :
                table [ i ] = nl ( )
            return table
        def nlist ( n , m ) :
            for i in range ( m ) :
                for j in range ( n ) :
                    table [ i ] [ j ] = nl ( )
            return table
        def nlist ( n , m ) :
            for i in range ( n ) :
                table [ i ] = nlist ( n )
            return table
        def nlist ( n , m ) :
            for i in range ( m ) :
                table [ i ] = nl ( )
            return table
        def s ( n ) :
            ret = 0
            while n > 0 :
                ret += n % 10
                n /= 10
            return ret
        def main ( ) :
            with open ( sys.__stdout__ , 'a' ) as f :
                start = time.time ( )
                debug = sys.argv [ 0 ] if sys.argv else None
                if debug :
                    with open ( sys.argv [ 0 ] , 'r' ) as f :
                        f.write ( _import ( f.read ( ) , '' ) )
            return f.read ( )
    