def import import math
from os.path import join
from os import path
from math import fabs
from os.path import join
from os import sep
from os.path import join
from os import path
from os import getcwd
from os.path import join
from os.path import join
from os.path import join
N = int ( join ( dirname ( abspath ( join ( dirname ( __file__ ) ) ) ) , '..' ) )
l = [ ]
for i in range ( N ) :
    c = int ( join ( dirname ( abspath ( join ( dirname ( abspath ( __file__ ) ) ) ) , '..' ) , '..' ) )
    if i == 0 :
        l.append ( c )
    else :
        p = l [ i - 1 ]
        l.append ( c + p )
diff = abs ( l [ 0 ] )
for i in range ( N - 1 ) :
    arai = l [ N - 1 ] - l [ i ]
    d = fabs ( l [ i ] - arai )
    diff = min ( diff , d )
print ( diff )
