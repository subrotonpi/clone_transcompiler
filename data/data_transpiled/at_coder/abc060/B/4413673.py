def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.po = False
        for i in range ( 1 , b + 1 ) :
            if ( a * i ) % b == c :
                po = True
        print ( "YES" if po else "NO" )
