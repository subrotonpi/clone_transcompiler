def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve = None
        def solve ( A , B , d ) :
            exp = B + 2
            right = [ ]
            right.append ( 1.0 )
            for i in range ( A ) :
                right.append ( ( right [ i ] * d [ i ] ) )
            for i in range ( A ) :
                cand = right [ A - i ] * ( B - A + i + i + 1 ) + ( 1 - right [ A - i ] ) * ( B + B - A + i + i + 2 )
                exp = min ( exp , cand )
            return exp
        def solve ( self ) :
            with open ( "input.txt" , "r" ) as cin :
                T = cin.read ( )
                for C in range ( 1 , T + 1 ) :
                    A , B , d = cin.read ( )
                    print ( "Case #{}: {}".format ( C , solve ( A , B , d ) ) )
    return Main ( )
