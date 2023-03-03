def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def main ( self ) :
        self.n = sys.maxint
    a , b = [ ] , [ ]
    res = 0
    same = True
    for i in range ( n ) :
        a.append ( sys.stdin.read ( ) )
        b.append ( sys.stdin.read ( ) )
        if a [ i ] != b [ i ] :
            same = False
    if same :
        print ( 0 )
        return
    min = sys.maxint
    for i in range ( n ) :
        if a [ i ] <= b [ i ] :
            res += a [ i ]
            b [ i ] -= a [ i ]
            a [ i ] = 0
            res += b [ i ]
        else :
            min = min ( min , b [ i ] )
            res += b [ i ]
    print ( res - min )
