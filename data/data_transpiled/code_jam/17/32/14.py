def gcj2017.r1c ( ) :
    import os
    import sys
    import os
    import os
    import sys
    import os
    import os
    import sys
    import os
    import os
    import getopt
    class Parents :
        def __init__ ( self ) :
            self.l = 0
        def __init__ ( self ) :
            self.l = 0
        def __init__ ( self , * args ) :
            self.l = 0
        def start ( self , end ) :
            self.l = end
            self.l = ( end - start + 1440 ) % 1440
    class D ( object ) :
        def __init__ ( self , c , start , end ) :
            self.c = c
            self.start = start
            self.l = end
            self.l = ( end - start + 1440 ) % 1440
    def solve ( an , bn , aj , bj ) :
        jobs = [ ]
        n = an + bn
        jobs.extend ( aj )
        jobs.extend ( bj )
        jobs.sort ( key = lambda x : x [ 0 ] )
        at = 0
        bt = 0
        c = 0
        flex = 0
        same = [ ]
        for i in range ( n ) :
            d = jobs [ i ]
            if d [ 0 ] == 1 :
                at += d [ 1 ]
            else :
                bt += d [ 1 ]
            pre = jobs [ ( i - 1 + n ) % n ]
            if pre [ 0 ] == d [ 1 ] :
                if pre [ 1 ] == d [ 2 ] :
                    if bt == d [ 3 ] :
                        return 0
                else :
                    return 1
        return 0
    for i in range ( m ) :
        d = same [ i ]
        if d [ 0 ] == 1 :
            if at + d [ 1 ] <= 720 :
                at += 2
        if d [ 0 ] == 2 :
            if bt + d [ 1 ] <= 720 :
                bt += 2
