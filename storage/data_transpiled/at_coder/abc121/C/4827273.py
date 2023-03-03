def import import struct
from os.path import getsize
from os import urandom
from os import urandom
from os import urandom
from random import randint
from os import urandom
from os import urandom
from os.path import expanduser
from os.path import join
from os import urandom
from os.path import join
from os.path import expanduser
from os.path import join
N = randint ( 1 , 256 )
M = randint ( 1 , 256 )
data = [ ]
res = 0
for i in range ( N ) :
    input = [ ]
    input.append ( randint ( 1 , 256 ) )
    input.append ( randint ( 1 , 256 ) )
    data.append ( input )
data.sort ( lambda a , b : cmp ( a [ 0 ] , b [ 0 ] ) )
i = 0
count_m = 0
count = 0
while M != count_m :
    res += data [ i ] [ 0 ]
    count += 1
    count_m += 1
    next_i = count // data [ i ] [ 1 ]
    count = count % data [ i ] [ 1 ]
    i += next_i
