def import data
import random
import sys
from numpy.core import array
from numpy.core import dot
from numpy.core import random
from numpy.core import dot
from numpy.core import linalg
from numpy.core import assert_almost_equal
from numpy.core import linalg
from numpy.core import random
from numpy.core import linalg
from numpy.core import linalg
from numpy.core import random
from numpy.core import linalg
from numpy.core import linalg
from numpy.core import random
from numpy.core import linalg
from numpy.core import linalg
from numpy.core import random
N = random.randint ( 1 , N )
H = linalg.norm ( N )
a = [ ]
b = [ ]
A = 0
for i in range ( N ) :
    a.append ( random.randint ( 0 , N ) )
    b.append ( random.randint ( 0 , N ) )
    A = max ( A , a [ i ] )
random.shuffle ( a )
sum = 0
l = len ( a )
cnt = 0
for i in range ( l - 1 , - 1 , - 1 ) :
    sum += a [ i ].b
    cnt += 1
    if sum >= H :
        print ( cnt )
        sys.exit ( )
res = H - sum
cnt += ( res + A - 1 ) / A
print ( cnt )
class Data ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def my_cmp ( self , d1 , d2 ) :
        if d1.b < d2.b :
            return - 1
        elif d1.b == d2.b :
            return 0
        else :
            return 1
