def import _readline
import readline
import sys
import os
import locale
import readline
import time
import sys
import locale
import sys
try :
    locale.setlocale ( locale.LC_ALL , '' )
except :
    pass
with open ( '%s-large' % locale.LC_ALL , 'w' ) as f :
    try :
        import readline
    except :
        pass
    else :
        C , D = iread ( )
        P , V = [ ] , [ ]
        for i in range ( C ) :
            P.append ( i )
            V.append ( i )
        left , right = - 1 , 100000000000000L
        cycle :
            while left + 1 < right :
                time = ( left + right ) / 2
                cur = long ( 0 )
                for i in range ( C ) :
                    for j in range ( V [ i ] ) :
                        cur = max ( cur + 2 * D , 2 * P [ i ] - time )
                        t = abs ( cur - 2 * P [ i ] )
                        if t > time :
                            left = time
                            continue cycle
            right = time
        df = '%.4f' % ( right / 2.0 )
        f.write ( '%s%s' % ( df , right / 2.0 ) )
    def solve_gcj ( ) :
        tests = iread ( )
        for test in range ( 1 , tests + 1 ) :
            f.write ( 'Case #%d: ' % test )
            solve ( )
            f.write ( '\n' )
    def readword ( ) :
        try :
            f = open ( '%s.in' % locale.LC_ALL , 'r' )
            out = open ( '%s.out' % locale.LC_ALL , 'w' )
            solve_gcj ( )
            out.flush ( )
        except :
            sys.exit ( 1 )
    iread = int ( readword ( ) )
    dread = float ( readword ( ) )
    lread = long ( readword ( ) )
    f.close ( )
    return ''.join ( b )
