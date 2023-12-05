def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.d = sys.stdin.read ( )
    def main ( ) :
        a = sys.stdin.read ( )
        b = sys.stdin.read ( )
        c = sys.stdin.read ( )
        d = sys.stdin.read ( )
        ans = min ( b , d ) - max ( a , c )
        print ( ans , 0 )
