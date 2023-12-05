def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        ans = 0
        for i in range ( 3 ) :
            ans += sc.randint ( 0 , 10 ) * sc.randint ( 0 , 10 )
        print ( ans )
