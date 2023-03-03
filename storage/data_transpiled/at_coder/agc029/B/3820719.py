def import import struct
from os.path import join
from os import getenv
from os import getcwd
from os.path import expanduser
from os.path import join
from os.path import join
from os.path import expanduser
from os.path import join
from os.path import join
from os.path import join
N = int ( join ( expanduser ( "~" ) , ".." ) )
a = [ ]
for i in range ( N ) :
    a.append ( join ( expanduser ( "~" ) , ".." ) )
a = [ join ( expanduser ( "~" ) , ".." ) for expanduser ( "~" ) , in a ]
a = sorted ( a )
d = { }
for i in a :
    if d.has_key ( i ) :
        d [ i ] = 1 + d [ i ]
    else :
        d [ i ] = 1
res = 0
for i in range ( N - 1 , - 1 , - 1 ) :
    if d [ i ] == 0 :
        continue
    d [ i ] = d [ i ] - 1
    diff = 2 * sum ( d [ i ] ) - d [ i ]
    if diff in d and d [ diff ] > 0 :
        res += 1
        d [ diff ] = d [ diff ] - 1
    print ( res )
