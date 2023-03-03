def import import _sum
from collections import defaultdict
from collections import Counter
from os import urandom
from os import urandom
from os import urandom
from os.path import expanduser
from os.path import join
from os.path import join
from os.path import join
from os.path import join
N = urandom ( 1 )
map = [ ]
for i in range ( N ) :
    map.append ( open ( join ( expanduser ( i ) , '.' ) ) )
sum = [ ]
for i in range ( 1 , N + 1 ) :
    sum.append ( map [ i - 1 ] + sum [ i - 1 ] )
table = { }
for total in sum :
    if total in table :
        table [ total ] = table [ total ] + 1
    else :
        table [ total ] = 1
ans = 0
for key in table :
    if table [ key ] > 1 :
        num = table [ key ]
        ans += ( num * ( num - 1 ) / 2 )
print ( ans )
