def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def main ( self ) :
        self.ans = 10000
        for i in range ( self.N ) :
            t = sys.stdin.read ( )
            ans = min ( ans , t )
        print ( ans )
