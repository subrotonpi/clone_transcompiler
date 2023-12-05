def import import sys
import math
from io import StringIO
import csv
from math import sin , cos
from math import cos , sin
from io import BytesIO
from io import BytesIO
from codecs import open
from codecs import getreader
n = int ( sys.stdin.readline ( ) )
t_pre , a_pre = 1 , 1
for i in range ( n ) :
    data = sys.stdin.read ( n ).split ( )
    t , a = map ( float , data [ 0 ].split ( ) )
    rate = max ( t_pre / t + ( t_pre % t == 0 ) , a_pre / a + ( a_pre % a == 0 ) )
    t_pre , a_pre = rate * t , rate * a
