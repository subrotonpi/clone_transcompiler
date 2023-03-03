def import _readline
import readline
import sys
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import os
import locale
try :
    locale.setlocale ( locale.LC_ALL , '' )
except :
    pass
with open ( '%s-large' % problem ) as f :
    B , N = iread ( f )
    M = [ i for i in range ( B ) ]
    L , R = - 1 , 100000000000001L
    while L + 1 < R :
        place = B
        med = ( L + R ) / 2
        for i in range ( B ) :
            place += med // M [ i ]
        if place >= N :
            R = med
        else :
            L = med
    for i in range ( B ) :
        N -= 1 + ( R - 1 ) // M [ i ]
    for i in range ( B ) :
        if R % M [ i ] == 0 :
            if N > 1 :
                N -= 1
            else :
                f.write ( "%d" % ( i + 1 ) )
                return
    def solve_gcj ( ) :
        tests = iread ( f )
        for test in range ( 1 , tests + 1 ) :
            f.write ( "Case #%d: " % test )
            solve ( )
            f.write ( "\n" )
    def read ( ) :
        try :
            f = open ( '%s.in' % filename , 'r' )
            out = open ( '%s.out' % filename , 'w' )
            solve_gcj ( )
            out.flush ( )
        except :
            sys.exit ( 1 )
    def iread ( ) :
        return int ( readword ( ) )
    def dread ( ) :
        return float ( readword ( ) )
    def lread ( ) :
        return long ( readword ( ) )
    f.close ( )
