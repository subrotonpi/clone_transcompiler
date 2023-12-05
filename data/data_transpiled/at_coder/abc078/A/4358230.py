def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        X = sc.readline ( ).rstrip ( '\n' )
        Y = sc.readline ( ).rstrip ( '\n' )
        num = X - Y
        print ( '<' if num < 0 else ( '>' if num > 0 else '=' ) )
