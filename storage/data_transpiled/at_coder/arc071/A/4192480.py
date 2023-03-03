def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.list = [ ]
        self.list.append ( int ( sys.stdin.readline ( ).strip ( ) ) )
        for i in range ( self.n ) :
            data = self.list [ i ]
            ta = [ 0 ] * 26
            for ch in data :
                ta [ ord ( ch ) - ord ( 'a' ) ] += 1
            for i in range ( 26 ) :
                self.list [ i ] = min ( self.list [ i ] , ta [ i ] )
    res = ""
    for i in range ( 26 ) :
        for j in range ( self.list [ i ] ) :
            res += chr ( ord ( 'a' ) + i )
    print ( res )
