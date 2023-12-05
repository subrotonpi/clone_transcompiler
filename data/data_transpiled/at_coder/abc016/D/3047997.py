def import import sys , StringIO , D
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from time import sleep
class D :
    def solve ( self , test_number , stdin , stdout ) :
        ax , ay , bx , by = [ 0 ] * 2
        n = len ( stdin )
        ans = 0
        x , y = [ fdopen ( i , 0 ) for i in range ( n ) ]
        for i in range ( n ) :
            cx , cy , dx , dy = [ x [ i ] for x in y ]
            ta = ( cx - dx ) * ( ay - cy ) + ( cy - dy ) * ( cx - ax )
            tb = ( cx - dx ) * ( by - cy ) + ( cy - dy ) * ( cx - bx )
            tc = ( ax - bx ) * ( cy - ay ) + ( ay - by ) * ( ax - cx )
            td = ( ax - bx ) * ( dy - ay ) + ( ay - by ) * ( ax - cx )
            if tc * td < 0 and ta * tb < 0 :
                ans += 1
        if ans % 2 == 1 :
            sys.exit ( 1 )
        fdopen ( ans / 2 + 1 )
