def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    def main ( self ) :
        N = sys.stdin.readline ( ).strip ( )
        A = sys.stdin.readline ( ).strip ( )
        B = sys.stdin.readline ( ).strip ( )
        print ( ( B * N if N <= 5 else ( N - 5 ) * A + B * 5 ) )
