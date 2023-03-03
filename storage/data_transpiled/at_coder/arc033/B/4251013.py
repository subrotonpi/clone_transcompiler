def import import sys , os , sys
from numpy.core import __version__
from numpy.core import __version__
from numpy.core import __version__
import sys
arr = sys.stdin.readlines ( )
na = int ( arr [ 0 ] )
nb = int ( arr [ 1 ] )
seen = set ( )
arr = sys.stdin.readlines ( )
for x in arr :
    seen.add ( int ( x ) )
in_0 = 0
out_0 = 0
arr = sys.stdin.readlines ( )
for x in arr :
    if x in seen :
        in_0 += 1
    else :
        out_0 += 1
print ( float ( in_0 ) / float ( na + out_0 ) )
