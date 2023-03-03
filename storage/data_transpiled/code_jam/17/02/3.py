def import import sys
from os.path import join
from os import rename
from os import getcwd
from os.path import join
from os.path import join
from os import sep
from os.path import join
from os.path import join
from os import sep
from os import rename
from os import getcwd
from os.path import join
from os import sep
from os import chdir
f = open ( join ( dirname ( __file__ ) , 'B-large.in' ) , 'r' )
f = open ( join ( dirname ( __file__ ) , 'solve.txt' ) , 'w' )
T = int ( f.readline ( ).strip ( ) )
for i in range ( 1 , T + 1 ) :
    print ( 'Case #%d: ' % i , file = sys.stderr )
    s = join ( f.readlines ( ) )
    S = s.strip ( )
    S = S.split ( )
    digit = [ ]
    for i in range ( len ( S ) ) :
        digit.append ( S [ i ] - '0' )
    for i in range ( len ( S ) - 1 , 0 , - 1 ) :
        if digit [ i ] < digit [ i - 1 ] :
            digit [ i - 1 ] -= 1
            for k in range ( j , len ( digit ) ) :
                digit [ k ] = 9
    for i in range ( len ( s ) ) :
        if not ( i == 0 and digit [ i ] == 0 ) :
            print ( '%s' % digit , file = sys.stderr )
    f.write ( '\n' )
