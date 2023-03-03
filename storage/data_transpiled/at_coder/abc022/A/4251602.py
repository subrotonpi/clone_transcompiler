def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        n , s , t = sc.scanner ( )
        w = sc.scanner ( )
        ans = 0
        for i in range ( n ) :
            if i != 0 :
                w += sc.scanner ( )
            if w >= s and w <= t :
                ans += 1
        print ( ans )
