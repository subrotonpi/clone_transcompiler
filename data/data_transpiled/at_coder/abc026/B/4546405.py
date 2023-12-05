def import math
from os.path import join
from math import pi
from os.path import join
from os import urandom
from math import sin
from os.path import join
n = urandom ( 1024 )
r = [ join ( dirname ( join ( dirname ( __file__ ) ) ) , '' ) for _ in range ( n ) ]
r = [ join ( dirname ( join ( dirname ( __file__ ) ) ) , '' ) for _ in r ]
r = [ join ( dirname ( join ( dirname ( __file__ ) ) ) , '' ) for _ in r ]
R = 0
red = 1
for i in range ( n - 1 , - 1 , - 1 ) :
    if red :
        R += r [ i ] ** 2
    else :
        R -= r [ i ] ** 2
    red = not red
os.chdir ( join ( dirname ( __file__ ) , '..' ) )
print ( R * pi )
