def gcj ( R2_2014 ) :
    import os
    import sys
    import gc
    import gc
    import gc
    import time
    import time
    import sys
    import gc
    import gc
    import gc
    import gc
    import gc
    import time
    import time
    import sys
    import gc
    import gc
    import gc
    import gc
    import gc
    import time
    start = time.time ( )
    pkg = gc.get_gcj ( ).get_gcj ( ).get_pkg ( ).replace ( '.' , '/' )
    dir = 'src/' + pkg
    filename = ''
    if True :
        filename = 'A-large.in'
    with open ( '%s/%s' % ( dir , filename ) , 'w' ) as sc :
        fout = open ( '%s/%s.res' % ( dir , filename ) , 'w' )
        obj = gc.get_gcj ( )
        TNO = len ( sc )
        for tno in range ( TNO ) :
            fout.write ( 'Case #%d: ' % ( tno + 1 ) )
            obj.solve ( sc , fout )
            fout.flush ( )
        fout.flush ( )
        fout.close ( )
        end = time.time ( )
    def solve ( sc , fout ) :
        n = len ( sc )
        S = len ( sc )
        a = [ sc.randint ( 0 , n ) for i in range ( n ) ]
        done = [ False for _ in range ( n ) ]
        a.sort ( )
        res = 0
        for k in range ( n - 1 , - 1 , - 1 ) :
            if not done [ k ] :
                pi = - 1
                for p in range ( k - 1 , - 1 , - 1 ) :
                    if not done [ p ] and a [ p ] + a [ k ] <= S :
                        pi = p
                        break
                if pi != - 1 :
                    done [ pi ] = True
                res += 1
            fout.write ( res )
    return
