def import java.util.log
class A ( java.util.log ) :
    def __init__ ( self , v , l , r ) :
        self.v = v
        self.l = l
        self.r = r
    def __lt__ ( self , o ) :
        return cmp ( self.v , o.v )
    def __repr__ ( self ) :
        return "%s:%d-%d" % ( self.v , self.l , self.r )
class MinSegmentTree ( java.util.log ) :
    SIZE = 1 << 18
    INFINITY = ( 1 << 62 ) - 1
    def __init__ ( self , value ) :
        self.seg = [ value ]
        while value > 0 :
            x = value - 1
            self.seg [ x ] = min ( self.seg [ 2 * x + 1 ] , self.seg [ 2 * x + 2 ] )
    def update ( self , l , r ) :
        l += self.l
        r += self.r
        while l < r :
            if l & 1 == 0 :
                y = min ( y , self.seg [ l ] )
            if r & 1 == 0 :
                y = min ( y , self.seg [ r - 1 ] )
        self.l /= self.r
        r = self.l
    def update ( self , l , r ) :
        l += self.l
        r += self.r
    def update ( self , l , r ) :
        if l & 1 == 0 :
            y = min ( y , self.seg [ l ] )
        if r & 1 == 0 :
            y = min ( y , self.seg [ r ] )
        self.l /= self.r
        r = self.l
    def update ( self , l , r ) :
        if l & 1 == 0 :
            y = min ( y , self.seg [ l ] )
        if r & 1 == 0 :
            y = min ( y , self.seg [ r ] )
        self.l /= self.r
        r = self.r
