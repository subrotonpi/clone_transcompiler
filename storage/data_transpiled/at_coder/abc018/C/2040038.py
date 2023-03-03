def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        r = sc.randint ( 0 , r )
        c = sc.randint ( 0 , c )
        k = sc.randint ( 0 , c )
        ss = [ sc.read ( ) for i in range ( r ) ]
    def __init__ ( self ) :
        self.ss = [ ]
        self.liy = [ ]
        self.lix = [ ]
        for i in range ( r ) :
            for j in range ( c ) :
                if self.ss [ i ] [ j ] == 'x' :
                    self.liy.append ( i )
                    self.lix.append ( j )
                    self.liy.append ( i )
                    self.lix.append ( j )
                    self.lix.append ( i )
    grd = [ ]
    for idx in range ( r ) :
        y = self.liy [ idx ]
        x = self.lix [ idx ]
        for i in range ( y - k + 1 , y + k - 1 ) :
            if i < 0 or i >= r :
                continue
            for j in range ( x - k + 1 , x + k - 1 ) :
                if j < 0 or j >= c :
                    continue
                if abs ( i - y ) + abs ( j - x ) >= k :
                    continue
                grd.append ( [ 1 , 1 ] )
    ans = 0
    for i in range ( k - 1 , r - k + 1 ) :
        for j in range ( k - 1 , c - k + 1 ) :
            if grd [ i ] [ j ] == 0 :
                ans += 1
    print ( ans )
