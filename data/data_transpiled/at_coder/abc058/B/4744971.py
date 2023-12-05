def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.ans = ''
    def scanner ( self ) :
        sc = _scanner ( )
        a = sc.next ( )
        b = sc.next ( )
        for i , c in enumerate ( a ) :
            self.ans += c
            if i + 1 > len ( b ) :
                break
            self.ans += c
        print ( self.ans )
