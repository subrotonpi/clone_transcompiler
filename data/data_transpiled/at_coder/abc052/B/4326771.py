def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        self.n = sc.scanner.next ( )
        s = sc.scanner.next ( )
        x = 0
        ans = 0
        for i in range ( n ) :
            if s [ i ] == 'I' :
                x += 1
            elif s [ i ] == 'D' :
                x -= 1
            ans = max ( ans , x )
        print ( ans )
