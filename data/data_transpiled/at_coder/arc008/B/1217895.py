def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.name = self.name
        self.kit = self.kit
    a = [ ]
    b = [ ]
    for c in name :
        a [ ord ( c ) ] += 1
    for c in kit :
        b [ ord ( c ) ] += 1
    ans = 1
    for i in range ( 200 ) :
        if not a :
            continue
        if not b :
            print ( - 1 )
            return
        if a [ i ] <= b [ i ] :
            continue
        count = 0
        if a [ i ] % b [ i ] == 0 :
            count = a [ i ] // b [ i ]
        else :
            count = a [ i ] // b [ i ] + 1
        ans = max ( ans , count )
    print ( ans )
