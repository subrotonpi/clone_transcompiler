def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve ( )
        def solve ( self ) :
            cin = sys.stdin
            T = cin.read ( )
            for C in range ( 1 , T + 1 ) :
                N = cin.read ( )
                P = cin.read ( )
                count = [ cin.read ( ) % P for _ in range ( N ) ]
                ret = count [ 0 ]
                count [ 0 ] = 0
                if P == 2 :
                    ret += ( count [ 1 ] + 1 ) / 2
                elif P == 3 :
                    min = min ( count [ 1 ] , count [ 2 ] )
                    ret += min
                    count [ 1 ] -= min
                    count [ 2 ] -= min
                    ret += ( count [ 1 ] + 2 ) / 3
                    ret += ( count [ 2 ] + 2 ) / 3
                elif P == 4 :
                    def two ( ) :
                        return min ( count [ 1 ] , count [ 3 ] )
                    ret += two
                    count [ 1 ] -= two
                    count [ 3 ] -= two
                else :
                    two = count [ 2 ] / 2
                    ret += two
                    count [ 2 ] -= two * 2
            else :
                if count [ 1 ] or count [ 2 ] or count [ 3 ] :
                    ret += 1
            print ( "Case #%d: %d" % ( C , ret ) )
    return Main
