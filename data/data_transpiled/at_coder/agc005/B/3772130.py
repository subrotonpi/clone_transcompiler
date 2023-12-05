def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.bit = [ ]
        self.pos = [ ]
        a = [ ]
        for i in range ( 1 , n + 1 ) :
            a.append ( _main.choice ( a ) )
            self.pos.append ( i )
        self.left , self.right = [ ] , [ ]
        ts = sorted ( )
        for v in range ( 1 , n + 1 ) :
            p = self.pos [ v ]
            x = ts.lower ( p )
            if x is None :
                left.append ( p )
            else :
                left.append ( p - x )
            ts.append ( p )
        ts = sorted ( )
        for v in range ( 1 , n + 1 ) :
            p = self.pos [ v ]
            y = ts.higher ( p )
            if y is None :
                right.append ( n + 1 - p )
            else :
                right.append ( y - p )
            ts.append ( p )
        self.ans = 0
        for v in range ( 1 , n + 1 ) :
            cur = ( long ( v ) * long ( left [ v ] ) * long ( right [ v ] ) )
            self.ans += cur
        print ( self.ans )
