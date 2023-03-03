def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve = 0
        def solve ( self ) :
            cin = sys.stdin
            T = cin.read ( )
            for C in range ( 1 , T + 1 ) :
                N = cin.read ( )
                K = cin.read ( )
                M = cin.read ( )
                pos = [ [ ] for _ in range ( M ) ]
                count = [ ]
                for i in range ( M ) :
                    pos.append ( [ cin.read ( ) , cin.read ( ) ] )
                    count.append ( pos [ i ] [ - 1 ] )
                pos.sort ( key = lambda a : a [ 0 ] )
                min = 1
                for i in range ( K ) :
                    min = max ( min , count [ i ] )
                result = 0
                score = - 1
                for i in range ( min , M + 1 ) :
                    score = solve ( i , N , K , M , pos , count )
                    if score >= 0 :
                        result = i
                        break
                print ( "Case #%d: %d %d" % ( C , result , score ) )
            cin.close ( )
        def solve ( self , use , N , K , M , pos , count ) :
            Pable = 0
            Pused = 0
            p = 0
            for i in range ( 1 , N + 1 ) :
                rest = use
                while p < M :
                    if pos [ p ] [ 0 ] > i :
                        Pable += rest
                        break
                    if pos [ p ] [ 0 ] < i :
                        raise RuntimeError ( "implementation ereror: invalid pos order: %s < %s" % ( pos [ p ] [ 0 ] , i ) )
                p += 1
            return Pable
    return Main
