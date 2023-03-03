def import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        self.n = sc.__next__ ( )
        s = ''
        for i in range ( ( n - 1 ) // 9 + 1 ) :
            s += ( n - 1 ) % 9 + 1
        print ( s )
