def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        with open ( sys.argv [ 1 ] ) as f :
            N = f.read ( )
    As = [ sys.stdin.read ( ) for i in range ( N ) ]
    sum = 0
    current = 0
    for i in range ( N ) :
        if As [ i ] > current :
            sum += As [ i ] - current
        current = As [ i ]
    print ( sum )
