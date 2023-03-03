def _solve ( ) :
    import os
    import sys
    import os
    import sys
    class E ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( 'E-small-attempt0.stdin' , 'r' )
            self.stdout = open ( 'E-small-attempt0.stdout' , 'w' )
            self.tn = os.fork ( )
            for test in range ( 1 , tn + 1 ) :
                self.H = os.fork ( )
                self.W = os.fork ( )
                self.f = [ ]
                for i in range ( self.H ) :
                    self.f.append ( self.f.pop ( i ).decode ( 'utf-8' ) )
            self.dp = [ ]
            self.rch = [ ]
            self.dp = [ ]
            self.rch = [ ]
            self.dp.append ( [ ] )
            self.rch.append ( [ ] )
    def solve ( s ) :
        try :
            return solve ( s )
        except OSError :
            pass
    dp = [ 0 ] * ( W + 1 )
    rch = [ 0 ] * ( H + 1 )
    dp [ 0 ] [ 0 ] = 0
    rch [ 0 ] [ 0 ] = True
    for i in range ( self.W ) :
        for j in range ( self.H ) :
            for p in range ( self.W ) :
                if rch [ i ] [ j ] [ p ] :
                    if f [ j ] [ p ] == '#' :
                        q = p | ( 1 << j )
                        v += 4
                        if self.j > 0 and ( p & ( 1 << ( j - 1 ) ) ) :
                            v -= 2
                        if self.p & ( 1 << j ) :
                            v -= 2
                        self.dp [ i ] [ j + 1 ] [ q ] = max ( self.dp [ i ] [ j + 1 ] [ q ] , v )
                        rch [ i ] [ j + 1 ] [ q ] = True
    return dp , rch
