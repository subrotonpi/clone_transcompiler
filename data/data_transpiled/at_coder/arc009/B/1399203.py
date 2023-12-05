def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.change = [ ]
        self.dec = [ ]
        for i in range ( 10 ) :
            b = sys.stdin.readline ( )
            self.change.append ( str ( i ) )
            self.dec.append ( str ( b ) )
        self.N = len ( self.change )
        self.a = [ ]
        for i in range ( self.N ) :
            d = str ( self.change [ i ] )
            num = ""
            for c in d :
                num += self.change [ int ( c ) ]
            self.a.append ( int ( num ) )
        self.a = sorted ( self.a )
        for i in range ( self.N ) :
            d = str ( self.a [ i ] )
            num = ""
            for c in d :
                num += self.dec [ int ( c ) ]
            print ( num )
