def main ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            sc = random.choice ( [ 'A' , 'B' , 'C' , 'D' ] )
            A = sc.randint ( 0 , 100 )
            B = sc.randint ( 0 , 100 )
            d = [ [ ] for i in range ( A ) ]
            for i in range ( A ) :
                for j in range ( B ) :
                    print ( "%d %d" % ( i , j ) )
        def tr ( * objects ) :
            print ( "%d %d" % ( i , j ) )
        def __init__ ( self ) :
            self.d = [ ]
            for x in range ( 101 ) :
                for y in range ( 100 ) :
                    for i in range ( 0 , 100 ) :
                        for j in range ( 0 , 100 ) :
                            self.c [ i ] [ j ] = max ( self.c [ i ] [ j ] , self.d [ x ] [ y ] - ( x + 1 ) * i - ( y + 1 ) * j )
    def main ( ) :
        def tr ( * objects ) :
            print ( "%d %d" % ( i , j ) )
        def dnow ( self ) :
            for i in range ( 101 ) :
                for j in range ( 0 , 100 ) :
                    self.d [ i ] [ j ] = min ( self.d [ x ] [ y ] , self.d [ i ] [ j ] + ( x + 1 ) * i + ( y + 1 ) * j )
        for x in range ( A ) :
            for y in range ( 101 ) :
                if d [ x ] [ y ] != dnow [ x ] [ y ] :
                    print ( "Impossible" )
                    return
        print ( "Possible" )
        print ( 300 + " %d %d" % ( 100 + 100 + 101 * 2 , 101 ) )
