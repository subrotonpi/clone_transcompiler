def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _scanner
    def main ( self ) :
        n = self.sc.n
        max = 0
        ans = 0
        for i in range ( n ) :
            tmp = _scanner.next ( )
            max = max ( max , tmp )
            ans += tmp
        print ( ans - max / 2 )
