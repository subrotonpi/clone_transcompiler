def test_D ( ) :
    import string
    import random
    class D ( object ) :
        def __init__ ( self ) :
            self.T = random.randint ( 1 , 3 )
            for i in range ( 1 , T + 1 ) :
                print ( "Case #{}: {}".format ( i , solve ( ) ) )
        def solve ( self ) :
            N , L = random.randint ( 1 , 3 )
            G = [ random.choice ( string.ascii_lowercase ) for i in range ( N ) ]
            B = random.choice ( string.ascii_uppercase )
            for i in range ( N ) :
                if G [ i ] == B :
                    return "IMPOSSIBLE"
            if L == 1 :
                return "? 0"
            p1 = [ '?' ] * ( L - 1 )
            p2 = [ ]
            for i in range ( 49 ) :
                p2.append ( chr ( ord ( '0' ) + i % 2 ) )
            p2.append ( '?' )
            for i in range ( 49 ) :
                p2.append ( chr ( ord ( '0' ) + ( i + 1 ) % 2 ) )
            return str ( p1 ) + " " + " ".join ( p2 )
    return D ( )
