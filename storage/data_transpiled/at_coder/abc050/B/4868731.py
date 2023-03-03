def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.t = [ ]
        for i in range ( n ) :
            self.t.append ( sys.stdin.read ( ) )
        self.m = int ( sys.stdin.read ( ) )
        self.sum = [ ]
        p = x = 0
        for j in range ( m ) :
            p = int ( sys.stdin.read ( ) )
            x = int ( sys.stdin.read ( ) )
            temp = self.t [ p - 1 ]
            self.t [ p - 1 ] = x
            for k in range ( n ) :
                self.sum.append ( self.t [ k ] )
            self.t [ p - 1 ] = temp
        for l in range ( m ) :
            print ( self.sum [ l ] )
