def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.masu = [ ]
    def check ( self ) :
        sc = _main ( )
        N = sc.count ( )
        R = sc.count ( )
        S = sc.next ( )
        lastindex = - 1
        self.masu = [ ]
        last = 0
        for i in range ( N ) :
            self.masu.append ( S [ i ] == 'o' )
            if not self.masu :
                last = i + 1
        ans = 0
        idx = 1
        while True :
            if self.check ( ) :
                break
            if last - idx < R :
                ans += 1
                break
            elif self.masu [ idx - 1 ] :
                ans += 1
                idx += 1
            else :
                ans += 1
                for i in range ( idx , idx + R ) :
                    self.masu.append ( True )
        print ( ans )
    def check ( self ) :
        for i in self.masu :
            if not i :
                return False
        return True
