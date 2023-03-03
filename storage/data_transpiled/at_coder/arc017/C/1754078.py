def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.x = int ( sys.stdin.read ( ) )
    def run ( self ) :
        self.w = [ ]
        for i in range ( self.n ) :
            self.w.append ( i )
    m = n // 2
    f = [ 0 ] * ( 1 << m )
    s = [ 0 ] * ( 1 << n - m )
    for i in range ( 1 << m ) :
        for j in range ( m ) :
            if i & 1 << j :
                f [ i ] += self.w [ j ]
    for i in range ( 1 << n - m ) :
        for j in range ( n - m ) :
            if i & 1 << j :
                s [ i ] += self.w [ m + j ]
    hs = { }
    for ss in s :
        if not hs.has_key ( ss ) :
            hs [ ss ] = 1
        else :
            hs [ ss ] = hs [ ss ] + 1
    total = 0
    for ff in f :
        if x - ff in hs :
            total += hs [ x - ff ]
    print ( total )
