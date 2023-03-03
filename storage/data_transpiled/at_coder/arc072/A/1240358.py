def import import struct
from os.path import join
from os import urandom
from struct import Struct
from os.path import expanduser
from os.environ import dict
from os.environ import dict
from os.environ import dict
from os.environ import dict
from os.path import expanduser
from os.environ import dict
from os.environ import dict
from os.path import expanduser
from os.environ import dict
from os.path import join
from os import urandom
from os import urandom
from os import urandom
from struct import Struct
from os import urandom
from os import urandom
n = urandom ( 16 )
a = urandom ( n )
sum = struct.unpack ( ">i" , urandom ( n ) )
ans = sum ( a ) // 16
first = [ - 1 , 1 , a [ 0 ] ]
out :
    for f in first :
        cnt = 0
        d = f - a [ 0 ]
        cnt = abs ( d )
        for i in range ( 1 , n ) :
            if sign ( sum [ i ] + d ) * sign ( sum [ i - 1 ] + d ) < 0 :
                continue
            if sum [ i - 1 ] + d > 0 and sum [ i ] + d >= 0 :
                cnt += sum [ i ] + d + 1
                d -= sum [ i ] + d + 1
            elif sum [ i - 1 ] + d < 0 and sum [ i ] + d <= 0 :
                cnt += - ( sum [ i ] + d ) + 1
                d += - ( sum [ i ] + d ) + 1
            else :
                continue
        ans = min ( ans , cnt )
    print ( ans )
def sign ( x ) :
    return cmp ( x , 0 )
def tr ( * args ) :
    print ( " ".join ( map ( str , args ) ) )
