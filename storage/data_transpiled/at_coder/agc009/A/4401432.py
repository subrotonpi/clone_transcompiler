def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        A , B = [ _main ( ) for _ in range ( n ) ]
        ans = 0
        for i in range ( n - 1 , - 1 , - 1 ) :
            temp = ( A [ i ] + ans ) % B [ i ]
            ans += temp or 0
        print ( ans )
