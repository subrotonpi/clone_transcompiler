def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 1000000
    def __init__ ( self ) :
        self.h = [ ]
        self.s = [ ]
    def check ( H ) :
        t = [ ]
        for i in range ( self.n ) :
            if H < h [ i ] :
                return False
            t.append ( ( H - h [ i ] ) / s [ i ] )
        t.sort ( )
        for i in range ( self.n ) :
            if t [ i ] < H [ i ] :
                return False
        return True
    def main ( self ) :
        with _main ( self ) :
            self.n = _main.n
            for i in range ( self.n ) :
                self.h [ i ] = _main.n
                self.s [ i ] = _main.n
    def check ( self ) :
        self.n = _main.n
    def main ( self ) :
        with _main ( self ) :
            self.n = _main.n
            for i in range ( self.n ) :
                self.h [ i ] = _main.n
                self.s [ i ] = _main.n
    ok = 10000000000000000L
    ng = - 1
    while ok - ng > 1 :
        mid = ( ok + ng ) // 2
        if check ( mid ) :
            ok = mid
        else :
            ng = mid
    print ( ok )
