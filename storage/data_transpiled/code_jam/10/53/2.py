def round3 ( ) :
    import os
    import sys
    import os
    import sys
    import traceback
    import traceback
    import traceback
    class C :
        def __init__ ( self ) :
            self.stdin = open ( C.__name__ + '.in' , 'w' )
            self.stdout = open ( C.__name__ + '.out' , 'w' )
            self.stdout = open ( C.__name__ + '.out' , 'w' )
            self.l = self.r
            self.r = self.r
            self.min = self.b [ 0 ]
            self.max = self.b [ - 1 ]
            for i in range ( self.min , self.max + 1 ) :
                c1 = self.r1 [ i ]
                self.r = self.r
                self.l = self.l
                self.r = self.r
        def __lt__ ( self , segment ) :
            return self.l - segment.l
        def sum ( self ) :
            c = self.r - self.l + 1
            return c * self.l + 1
        def __repr__ ( self ) :
            return "Case #%d: %s" % ( self.l + 1 , self.r )
    b = [ Segment ( l , r ) for l , r in enumerate ( a ) ]
    a = [ ]
    for i in range ( self.n ) :
        if self.v [ i ] % 2 == 0 :
            a.append ( Segment ( p [ i ] - v [ i ] // 2 , p [ i ] - 1 ) )
            a.append ( Segment ( p [ i ] + 1 , p [ i ] + v [ i ] // 2 ) )
        else :
            a.append ( Segment ( p [ i ] - v [ i ] // 2 , p [ i ] + v [ i ] // 2 ) )
    while True :
        a.sort ( )
        r = sys.stdin.read ( )
        s1 = None
        s2 = None
        for s in a :
            if s.l <= r :
                s2 = s
                break
            else :
                if s.r > r :
                    s1 = s
                    r = s.r
        if s2 is not None :
            a