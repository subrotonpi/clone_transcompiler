def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.cnt = 0
        for i in range ( self.a , self.b + 1 ) :
            s = str ( i )
            if ( s [ 0 ] == s [ 4 ] ) :
                self.cnt += 1
        print ( self.cnt )
