def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.a = [ ]
        self.pos = [ ]
        for i in range ( self.n ) :
            tmp = _main.index ( self.a )
            self.a.append ( tmp )
            self.pos.append ( i )
    ts = sorted ( )
    ans = 0
    for i in range ( self.n ) :
        if ts.higher ( self.pos [ i ] ) is None :
            h = self.n
        else :
            h = ts.higher ( self.pos [ i ] )
        if ts.lower ( self.pos [ i ] ) is None :
            l = - 1
        else :
            l = ts.lower ( self.pos [ i ] )
        ans += long ( self.pos [ i ] - l ) * long ( h - self.pos [ i ] ) * long ( i + 1 )
        ts.append ( self.pos [ i ] )
    print ( ans )
