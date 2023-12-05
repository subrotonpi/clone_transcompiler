def main ( ) :
    import sys
    class Main ( object ) :
        def run ( self ) :
            with open ( "input.txt" , "r" ) as f :
                n = f.read ( )
            b = [ [ ] for i in range ( 1 , n + 1 ) ]
            for c in range ( 1 , n + 1 ) :
                for r in range ( 1 , n + 1 ) :
                    b [ c ] [ r ] += b [ c - 1 ] [ r ] + b [ c ] [ r - 1 ] - b [ c - 1 ] [ r - 1 ]
            mem = [ 0 ] * ( n ** 2 + 1 )
            for c1 in range ( 1 , n + 1 ) :
                for r1 in range ( 1 , n + 1 ) :
                    for c2 in range ( c1 , n + 1 ) :
                        for r2 in range ( r1 , n + 1 ) :
                            mem [ ( c2 - c1 + 1 ) * ( r2 - r1 + 1 ) ] = max ( mem [ ( c2 - c1 + 1 ) * ( r2 - r1 + 1 ) ] , b [ c2 ] [ r2 ] + b [ c1 - 1 ] [ r1 - 1 ] - b [ c2 ] [ r1 - 1 ] - b [ c1 - 1 ] [ r2 ] )
            q = range ( 1 , n + 1 )
            for i in range ( q ) :
                max = 0
                for j in range ( len ( b ) ) :
                    max = max ( max , mem [ j ] )
                print ( max )
