def import import sys
class bottrust ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.ntc = len ( self.stdin )
    for cc in range ( 1 , ntc + 1 ) :
        pos , time = [ 1 , 1 ] , [ 0 , 0 ]
        cnt = len ( self.stdin )
        for s in self.stdin :
            r = 0
            if s == 'B' :
                r = 1
            p = self.stdin.read ( )
            mtime = p - pos [ r ]
            if mtime < 0 :
                mtime = - mtime
            mtime += time [ r ] + 1
            if mtime <= time [ 1 - r ] :
                mtime = time [ 1 - r ] + 1
            time [ r ] = mtime
            pos [ r ] = p
        maxtime = time [ 0 ]
        if time [ 1 ] > maxtime :
            maxtime = time [ 1 ]
        print ( "Case #%d: %d\n" % ( cc , maxtime ) )
