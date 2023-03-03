def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
    def main ( ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        ans = abs ( a - b )
        cnt = a + 1 + 9 - b
        ans = min ( ans , cnt )
        cnt2 = 9 - a + 1 + b
        ans = min ( ans , cnt2 )
        print ( ans )
