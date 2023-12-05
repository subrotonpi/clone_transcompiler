def import import os , sys , traceback
from time import sleep
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import repeat
n = len ( chain ( * repeat ( sys.argv [ 1 : ] ) ) )
tall = [ ]
d = { }
for i in chain ( chain ( * repeat ( sys.argv [ 2 : ] ) ) ) :
    tall.append ( i )
    d [ tall [ i ] ] = i + 1
tall = [ t for t in chain ( * repeat ( sys.argv [ 1 : ] ) ) ]
for t in tall [ : - 1 ] :
    print ( d [ t ] )
