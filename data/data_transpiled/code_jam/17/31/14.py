def gcj2017.r1c ( ) :
    import os
    import math
    import os
    import os
    import os
    import sys
    import math
    import os
    import os
    import sys
    import subprocess
    import tempfile
    import tempfile
    import os
    import tempfile
    import os
    import subprocess
    import tempfile
    import subprocess
    import tempfile
    import os
    import tempfile
    import os
    import os
    import sys
    name = 'gcj2017/r1c/A-large'
    s = tempfile.TemporaryFile ( )
    count = os.stat ( name + '.in' ).st_size
    outfile = tempfile.TemporaryFile ( )
    for ii in range ( 1 , count + 1 ) :
        outfile.write ( 'Case #%d: ' % ii )
        n = os.stat ( name ).st_size
        k = os.stat ( name ).st_size
        lst = [ ( os.path.join ( name , i ) , i ) for i in range ( n ) ]
        res = solve ( n , k , lst )
        outfile.write ( '%f' % res )
        outfile.write ( '\n' )
    os.close ( outfile )
    def solve ( n , k , lst ) :
        lst.sort ( key = lambda x : x.r )
        max = 0
        while len ( lst ) >= k :
            last = lst.pop ( )
            a = math.pi * last.r ** 2 + last.side
            rem = sorted ( lst , key = lambda x : x.side )
            diff = max ( rem [ - 1 ] , rem [ - 1 ] )
            if diff < 0 : return - 1
            if diff > 0 : return 1
        for i in range ( k - 1 ) :
            a += rem [ i ].side
        max = max ( max , a )
    class P ( object ) :
        r = os.stat ( name ).st_size
        side = os.stat ( name ).st_size
        def __init__ ( self , r = 0 , h = 0 ) :
            self.r = r
            self.side = math.pi * r ** 2 * h
    return P
