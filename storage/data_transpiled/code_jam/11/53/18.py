def _import ( ) :
    from os import popen
    from os import urandom
    from random import randint
    from random import choice
    class C ( ) :
        def __init__ ( self ) :
            self.stdin = open ( '' )
            self.stdout = open ( '' )
            self.n_tests = randint ( 1 , choice ( string.ascii_uppercase + string.digits ) )
        def next ( self ) :
            while self.stdout.readline ( ).strip ( ) or not self.stdout.readline ( ) :
                self.stdout.readline ( )
            self.stdout.readline ( )
        def next ( self ) :
            return int ( self.stdout.readline ( ) )
        def next ( self ) :
            return long ( self.stdout.readline ( ) )
        def next ( self ) :
            return float ( self.stdout.readline ( ) )
    ans = 0
    id = [ ]
    for s in range ( 1 << ( r * c ) ) :
        for t in id :
            [ t ] = 0
        for i , g in enumerate ( range ( r ) ) :
            for j , g in enumerate ( range ( c ) ) :
                if s & ( 1 << g ) == 0 :
                    if m [ i ] [ j ] == '|' :
                        id [ ( i + r - 1 ) % r ] [ j ] += 1
                    elif m [ i ] [ j ] == '-' :
                        id [ i ] [ ( j + c - 1 ) % c ] += 1
                    elif m [ i ] [ j ] == ' \ \' :
                        id [ ( i + r - 1 ) % r ] [ ( j + c - 1 ) % c ] += 1
                    elif m [ i ] [ j ] == '/' :
                        id [ ( i + r - 1 ) % r ] [ ( j + c - 1 ) % c ] += 1
    ok = 1
    for i in range ( r ) :
        for j in range ( c ) :
            ok &= id [ i ] [ j ] == 1
    return ans
