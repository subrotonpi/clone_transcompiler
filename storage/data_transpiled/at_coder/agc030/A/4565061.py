def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        a , b , c = sc.scanner ( )
        ans = 0
        if a + b < c :
            ans += a + b + 1
        else :
            ans += c
        ans += b
        print ( ans )
