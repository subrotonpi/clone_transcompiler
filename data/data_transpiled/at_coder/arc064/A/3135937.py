def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.x = sys.stdin.read ( )
    a = [ ]
    for i in range ( N ) :
        a.append ( sys.stdin.read ( ) )
    ret = 0
    for i in range ( 1 , N ) :
        sum = a [ i ] + a [ i - 1 ]
        if sum <= x :
            continue
        pickpickNum = min ( a [ i ] , sum - x )
        prevPickNum = max ( ( sum - pickNum ) - x , 0 )
        ret += pickNum + prevPickNum
        a [ i ] -= pickNum
        a [ i - 1 ] -= prevPickNum
    print ( ret )
