def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.read ( )
        s = s.decode ( 'utf-8' )
        ans = len ( s ) - 1
        for i in range ( 1 , len ( s ) - 1 ) :
            if s [ i ] == 'U' :
                ans += s [ i - 1 ]
                ans += 2 ** i
            else :
                ans += i
                ans += 2 ** ( s [ i - 1 ] )
        ans += s [ i - 1 ]
        print ( ans )
