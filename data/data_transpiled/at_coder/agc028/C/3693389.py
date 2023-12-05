def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            n = sc.getmaxyx ( )
            a , b = [ sc.randint ( 0 , n ) for i in range ( n ) ]
            c = [ a [ i ] for i in range ( n , n * 2 ) ]
            ind = [ i for i in range ( 2 * n ) ]
            ind.sort ( lambda x , y : c [ x ] - c [ y ] )
            res = 0
            d = [ ind [ i ] for i in range ( n ) ]
            res = check ( c , d )
            if res >= 0 :
                pl ( res )
                return res
            d.append ( ind [ n ] )
            res = check ( c , d )
            if res >= 0 :
                pl ( res )
                return res
            res = 0
            for i in range ( n + 2 ) :
                res += c [ ind [ i ] ]
                if c [ ind [ n - 1 ] ] + c [ ind [ n ] ] < c [ ind [ n - 2 ] ] + c [ ind [ n + 1 ] ] :
                    res -= c [ ind [ n - 2 ] ] + c [ ind [ n + 1 ] ]
                else :
                    res -= ( c [ ind [ n - 1 ] ] + c [ ind [ n ] ] )
                pl ( res )
        def pl ( x ) :
            print ( x )
        def check ( c , d ) :
            n = len ( d )
            h = [ ]
            for i in range ( n ) :
                h.append ( i )
            if not h :
                print ( "No h found" )
            else :
                print ( "No h found" )
    return Main
