def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.k = int ( sys.stdin.readline ( ).strip ( ) )
        self.rui = [ ]
        sum = 0
        for i in range ( self.n ) :
            tmp = sys.stdin.readline ( ).strip ( )
            sum += tmp
            self.rui.append ( sum )
        self.sui = [ ]
        for i in range ( self.n - 3 ) :
            self.sui.append ( rui [ i + 3 ] - rui [ i ] )
        ans = - 1
        for i in range ( self.sui ) :
            if self.sui [ i ] < k :
                ans = i + 3
                break
        print ( ans )
