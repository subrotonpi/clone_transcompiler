def import import math
from os.path import join
from os import getenv
from os.path import join
from os.path import expanduser
from os.path import join
from os.path import join
from os.path import expanduser
from os.path import join
from os.path import join
HWhw = [ int ( x ) for x in join ( expanduser ( "~" ) , ".." ).split ( ) ]
H , W , h , w = HWhw
rect = [ [ ] for i in range ( H , W ) ]
large = long ( pow ( 10L , 9 ) ) - 1
if H % h == 0 and W % w == 0 :
    print ( "No" )
else :
    print ( "Yes" )
    for i in range ( 0 , H , h ) :
        for j in range ( 0 , W , w ) :
            rect [ i ] [ j ] = large
    for i in range ( h - 1 , h , h ) :
        for j in range ( w - 1 , W , w ) :
            rect [ i ] [ j ] -= ( large + 1 )
    for i in range ( H ) :
        for j in range ( W ) :
            print ( rect [ i ] [ j ] , end = ' ' )
        print ( )
