def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
    def main ( self ) :
        self.min = 1000
        self.max = 1
        for i in range ( self.n ) :
            a = sys.stdin.read ( )
            min = min ( a )
            max = max ( a )
        print ( max - min )
