def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.line = sys.stdin.readline ( ).split ( )
        self.a = int ( self.line [ 0 ] )
        self.b = int ( self.line [ 1 ] )
        self.passed = [ True ] * n
        self.k = int ( self.line [ 2 ] )
        self.line = sys.stdin.readline ( ).split ( )
        self.yes = True
        for p in range ( self.k ) :
            if self.passed [ p - 1 ] :
                self.yes = False
                break
            self.passed [ p - 1 ] = True
        if self.yes :
            print ( "YES" )
        else :
            print ( "NO" )
