def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    def main ( ) :
        N = sys.stdin.readline ( ).strip ( )
        A = 0
        A = N * ( N + 1 ) / 2
        print ( A * 10000 / N )
