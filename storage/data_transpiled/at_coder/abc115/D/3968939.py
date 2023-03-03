def import _main
class Main ( object ) :
    def __init__ ( self , * args ) :
        self.l = [ ]
        self.b = [ ]
    def f ( self , a ) :
        s = _main.stream
        self.l.append ( 1 )
        self.b.append ( 1 )
        for i in range ( 1 , len ( self.l ) ) :
            self.l [ i ] = self.l [ i - 1 ] * 2 + 3
            self.b [ i ] = self.b [ i - 1 ] * 2 + 1
        print ( self.f ( self.l [ i ] , self.b [ i ] ) )
    def f ( self , a ) :
        if a == self.l [ i ] :
            return self.b [ i ]
        if a > self.l [ i - 1 ] + 2 :
            return self.b [ i - 1 ] + 1 + self.f ( self.l [ i - 1 ] , a - self.l [ i - 1 ] - 2 )
        if a == self.l [ i - 1 ] + 2 :
            return self.b [ i - 1 ] + 1
        if a > 1 :
            return self.f ( self.l [ i - 1 ] , a - 1 )
        return 0
