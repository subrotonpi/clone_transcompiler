def import import struct
from os.path import basename
from os import urandom
from os.path import expanduser
from os.path import join
from os.path import expanduser
from os.path import join
from os.path import join
from os.path import dirname
from os.path import join
from os import sep
from os.path import join
n = int ( argv [ 1 ] )
a = [ join ( expanduser ( join ( dirname ( abspath ( __file__ ) ) , '..' ) ) , '..' ) for dirname ( abspath ( join ( dirname ( abspath ( __file__ ) ) , '..' ) ) ) in [ '-' , '-' ] ]
b = [ join ( expanduser ( join ( dirname ( abspath ( __file__ ) , '..' ) ) , '..' ) , '..' ) for dirname in [ '-' , '-' ] ]
c = [ join ( expanduser ( join ( dirname ( abspath ( __file__ ) , '..' ) ) , '..' ) , '..' ) for dirname in [ '-' , '-' ] ]
a = sorted ( a )
b = sorted ( b )
c = sorted ( c )
ret = 0
s , t = 0 , - 1
for i in range ( n ) :
    while s < n and c [ s ] <= b [ i ] :
        s += 1
    while t < n - 1 and a [ t + 1 ] < b [ i ] :
        t += 1
    ret += long ( n - s ) * ( t + 1 )
