def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def main ( self ) :
        self.N = sys.stdin.read ( )
        n = 1l
        for i in range ( 1 , N + 1 ) :
            n = ( n * i ) % 1000000007
        print ( n )
