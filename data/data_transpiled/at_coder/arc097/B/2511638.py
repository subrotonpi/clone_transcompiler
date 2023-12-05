def _import ( ) : return _import ( )
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self.stream = BetterScanner ( sys.stdin )
        self.n = self.stream.read ( 1 )
        self.m = self.stream.read ( 1 )
        pp = [ ]
        for i in range ( n ) :
            pp.append ( self.stream.read ( 1 ) )
        self.stream.read ( 1 )
    def read ( self ) :
        number = False
        self.stream.read ( 1 )
        if self.stream.read ( 1 ) == '-' :
            minus = True
            self.stream.read ( 1 )
        elif self.stream.read ( 1 ) == '0' and self.stream.read ( 1 ) == '9' :
            number *= 10
            self.stream.read ( 1 )
        elif self.stream.read ( 1 ) == '-' :
            return ( - number ) if minus else number
        else :
            raise ValueError ( )
    def read ( self ) :
        return self.stream.read ( 1 )
    def read ( self ) :
        return self.stream.read ( 1 )
    def read ( self ) :
        return self.stream.read ( 1 )
    def write ( self , buffer ) :
        if self.stream.read ( 1 ) == '-' :
            return - 1
        elif self.stream.read ( 1 ) == '-' :
            number *= 10
            self.stream.read ( 1 )
        elif self.stream.read ( 1 ) == '-' :
            number += self.stream.read ( 1 )
        else :
            raise ValueError ( )
    def read ( self ) :
        return self.stream.read ( 1 )
    def write ( self , buffer ) :
        if self.stream.read ( 1 ) == '-' :
            return - 1
        else :
            return self.stream.read ( 1 )
