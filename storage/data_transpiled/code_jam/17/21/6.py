def _import ( ) :
    import sys
    import os
    import re
    import math
    import sys
    class Round1BA ( object ) :
        def go ( self ) :
            try :
                io = Kattio ( sys.stdin , open ( os.devnull , 'w' ) )
                zzz = io.__next__ ( )
                for zz in range ( zzz ) :
                    dest = io.__next__ ( )
                    num_horses = io.__next__ ( )
                    horses = [ [ io.__next__ ( ) , io.__next__ ( ) ] for _ in range ( num_horses ) ]
                    horses.sort ( lambda one , two : two [ 0 ] - one [ 0 ] )
                    max_time = 0
                    for i in range ( num_horses ) :
                        max_time = max ( max_time , float ( dest - horses [ i ] [ 0 ] ) / horses [ i ] [ 1 ] )
                    io.write ( "Case #%d: %.6f\n" % ( zz + 1 , dest / max_time ) )
                io.flush ( )
                io.close ( )
            except KeyboardInterrupt :
                pass
    def main ( ) :
        Round1BA ( ).go ( )
    class Round1BA ( object ) :
        def go ( self ) :
            r = [ ]
            for line in self.r :
                if not line :
                    return
            for i in range ( zzz ) :
                r.append ( line )
        def peek ( self ) :
            token = None
            st = None
            try :
                return r.readline ( )
            except EOFError :
                return
        def readline ( self ) :
            token = None
            try :
                return r.readline ( )
            except EOFError :
                return
        def peek ( self ) :
            return token
    return Round1BA
