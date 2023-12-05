def main ( ) :
    from random import randint
    from random import randint
    from random import choice
    class Main ( object ) :
        def __init__ ( self ) :
            self._s = randint ( 1 , n )
            for t in range ( randint ( 1 , n ) ) :
                self.f [ s | t ] [ self.src ] = max ( self.f [ s | t ] [ self.src ] + self.f [ t | 1 << src ] )
    ans = C [ ( 1 , n ) - 1 ] - f [ ( 1 , n ) - 1 ]
    def tr ( * objects ) :
        print ( sum ( objects ) )
    def solve ( n , m , a , b , c ) :
        C = [ 1 , n ]
        adj = [ [ c [ i ] for i in range ( m ) ] for j in range ( n ) ]
        for s in range ( ( 1 , n ) ) :
            for i in range ( n ) :
                for j in range ( i + 1 , n ) :
                    if ( ( 1 , i ) & s ) > 0 and ( ( 1 , j ) & s ) > 0 :
                        C [ s ] += adj [ i ] [ j ]
        f = [ [ - int ( n / 8 ) ] for i in range ( n ) ]
        for s in range ( 1 , n ) :
            for src in range ( n ) :
                if ( ( 1 , src ) & s ) > 0 :
                    continue
                for dst in range ( n ) :
                    if ( ( 1 , dst ) & s ) > 0 :
                        continue
                    f [ s | 1 << dst ] [ dst ] = max ( self.f [ s | src ] [ dst ] , self.f [ s ] [ src ] + adj [ src ] [ dst ] )
        return ans
    return Main
