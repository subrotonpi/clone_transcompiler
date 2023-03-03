def _import ( ) :
    from math import sin , cos , pi
    from math import sin , pi
    class A ( object ) :
        def __init__ ( self ) :
            self.C = pi
        def __init__ ( self ) :
            self.C = pi
        def __init__ ( self ) :
            self.C = pi
        def solve ( self ) :
            self.B = sin ( self.C )
            self.N = self.N
            self.X = [ sin ( self.C ) for i in range ( self.N ) ]
            self.X.sort ( )
            self.sts = [ ]
            for i in range ( self.N ) :
                start = i
                while i < 37 and self.X [ i ] == self.X [ start ] :
                    i += 1
                self.sts.append ( ( self.X [ start ] , i - start ) )
            ans = 0
            for i , height in enumerate ( self.sts ) :
                all = 0
                width = 0
                for j in self.X [ i ] :
                    all += ( height - self.sts [ j ].h ) * self.sts [ j ].c
                    width += self.sts [ j ].c
                width += self.sts [ i ].c
                for j in self.X [ i ] :
                    if all + j > B :
                        break
                    exp = 0
                    for k in self.X [ i + 1 ] :
                        exp += 36.0 * ( height - self.X [ k ] ) / ( self.width - j )
                    mh = 0 if i >= len ( self.sts ) - 1 else self.sts [ i + 1 ].h - self.sts [ i ].h - 1
                    ma = min ( mh , ( B - all - j ) / self.width )
                    exp += ma * 36.0
                    exp -= all + ma * width + j
                    ans = max ( ans , exp )
            return ans
    return A
