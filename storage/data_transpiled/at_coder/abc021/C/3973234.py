def import _main
import sys
import random
import time
import sys
import sys
import random
import time
import sys
import sys
import itertools
from itertools import repeat
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
N , a , b , M = map ( int , repeat ( 'N' ) )
mod = 1000000007
node = [ 1 ] * ( N + 1 )
count = [ 1 ] * ( N + 1 )
edge = [ [ ] for i in range ( 1 , N + 1 ) ]
for i in chain ( range ( M ) , repeat ( 'N' ) ) :
    x , y = map ( int , repeat ( 'N' ) )
    edge [ x ] += y
    edge [ y ] += x
q = queue.Queue ( )
dist = queue.Queue ( )
while not q.empty ( ) :
    vertex , d = q.get ( )
    for child in edge [ vertex ] :
        if node [ child ] == 0 :
            q.put ( child )
            dist.put ( d + 1 )
            node [ child ] = d + 1
        if node [ child ] == d + 1 :
            count [ child ] = ( count [ child ] + count [ vertex ] ) % mod
    out ( count [ b ] )
