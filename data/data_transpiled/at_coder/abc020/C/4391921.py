def import _warshall_floyd
class Main ( object ) :
    def __init__ ( self ) :
        self.H = 0
        self.W = 0
        self.start = [ ]
        self.end = [ ]
        self.dx = [ 1 , - 1 , 0 , 0 ]
        self.dy = [ 0 , 0 , 1 , - 1 ]
        self.map = [ ]
    def main ( self ) :
        sc = _warshall_floyd
        self.H = sc.H
        self.W = sc.W
        self.T = sc.T
        self.map = [ ]
        for i in range ( self.H ) :
            for j in range ( self.W ) :
                if self.map [ i ] [ j ] == 'S' :
                    self.start = [ i , j ]
                if self.map [ i ] [ j ] == 'G' :
                    self.end = [ i , j ]
    self.l = 1
    self.r = self.T
    while self.l < self.r :
        mid = ( self.l + self.r ) // 2
        max = self.warshall_floyd ( self.mid )
        if max == self.T :
            self.l = mid
            break
        elif max < self.T :
            self.l = mid + 1
        else :
            self.r = mid - 1
    print ( self.warshall_floyd ( self.l ) <= self.T )
def warshall_floyd ( self ) :
    wf = init ( self )
    for k in range ( self.H * self.W ) :
        for i in range ( self.W ) :
            for j in range ( self.H * self.W ) :
                wf [ i , j ] = min ( wf [ i , j ] , wf [ i , k ] + wf [ k , j ] )
    self.s = self.start [ 0 ] * self.W + self.start [ 1 ]
    self.e = self.end [ 0 ] * self.W + self.end [ 1 ]
    return wf [ int ( s ) ] [ int ( e ) ]
return Main
