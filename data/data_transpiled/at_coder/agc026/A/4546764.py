def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _scanner
    def main ( self ) :
        n = self.sc.n
        prev = - 1
        ans = 0
        for i in range ( n ) :
            tmp = _scanner.next ( )
            if tmp == prev :
                ans += 1
                prev = - 1
            else :
                prev = tmp
        print ( ans )
