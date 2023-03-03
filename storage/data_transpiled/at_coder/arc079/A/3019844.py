def import import sys , string , traceback
from itertools import repeat
from itertools import chain
from itertools import chain
from py2k import iterable , repeat
sc = sys.stdin
N , M = map ( int , repeat ( N ) )
ar = [ False ] * N
br = [ False ] * N
for i in chain ( chain ( repeat ( i ) for i in range ( M ) ) , repeat ( i ) ) :
    s = sum ( i for i in range ( N ) if i % i == 0 )
    g = sum ( i for i in range ( N ) if i % i == 0 )
    if s == 0 :
        ar [ g ] = True
    elif g == N - 1 :
        br [ s ] = True
for i in range ( N ) :
    if ar [ i ] and br [ i ] :
        print ( "POSSIBLE" )
        return
print ( "IMPOSSIBLE" )
