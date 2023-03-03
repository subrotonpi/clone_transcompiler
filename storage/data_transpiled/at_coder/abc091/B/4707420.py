def import _dicts_1
from os.path import join
from os import sep
from os import chdir
from os import environ
from os.path import join
from os import chdir
from itertools import count
reader = _dicts_1
d = { }
N = len ( reader )
for i in range ( N ) :
    s = reader.next ( )
    if s in d :
        d [ s ] [ 0 ] += 1
    else :
        arr = [ 1 , 0 ]
        d [ s ] = arr
M = len ( reader )
for i in range ( M ) :
    s = reader.next ( )
    if s in d :
        d [ s ] [ 1 ] += 1
    else :
        arr = [ 0 , 1 ]
        d [ s ] = arr
ans = 0
for s , arr in d.items ( ) :
    gap = arr [ 0 ] - arr [ 1 ]
    ans = max ( gap , ans )
print ( ans )
del d
