def gcj2011 ( r3 ) :
    import os
    import time
    import sys
    import time
    import time
    import os.path
    import time
    import sys
    import os.path
    import time
    import time
    import os.path
    import os.environ
    import os.name
    import os.path
    import sys
    class D ( object ) :
        BASEPATH = r' x : \ gcj \ 2011r3\ \'
        LARGE = False
        INPATH = BASEPATH + D ( ).__name__ [ 0 ] + ( '-large.in' if LARGE else '-small-attempt0.in' )
        OUTPATH = INPATH [ : - 3 ] + datetime.datetime.now ( ).strftime ( '%Y%m%d' ) + '.out'
        INPUT = ''
        def call ( self ) :
            S = self.next ( ).split ( '' )
            self.rec ( S , 0 , 0 )
        def rec ( self , pos , cur ) :
            if len ( S ) == pos :
                sq = long ( math.sqrt ( cur ) )
                for i in range ( sq - 1 , sq + 10 ) :
                    if i * i == cur :
                        S = [ ]
                        for j in range ( len ( S ) ) :
                            if cur << 63 - j < 0 :
                                S.append ( '1' )
                            else :
                                S.append ( '0' )
                    self.out.write ( ''.join ( reversed ( S ) ) )
            return
        if S [ pos ] == '?' :
            self.rec ( S , pos + 1 , cur * 2 )
            self.rec ( S , pos + 1 , cur * 2 + 1 )
        else :
            self.rec ( S , pos + 1 , cur * 2 + ( S [ pos ] - '0' ) )
    class D ( object ) :
        def call ( self , stdin = None , stdout = None ) :
            self.stdin = stdin
            self.stdout = stdout
        def ni ( self ) :
            return int ( self.next ( ) )
        def nd ( self ) :
            return float ( self.next ( ) )
        def tr ( self , * args ) :
            if INPUT != None