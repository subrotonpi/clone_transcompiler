def import import sys , StringIO , D
from os import fdopen
from os import fdopen
from os import fdopen
from os import fdopen
from os import urandom
from random import randint
from numpy.random import random
from numpy.testing import SystemError
from os import urandom
from os import urandom
from os import fdopen
from os import urandom
from os import urandom
from random import random
class D ( object ) :
    def solve ( self , test_number , stdin = None , stdout = None ) :
        n = int ( stdin.read ( ) )
        l = [ - 1 ]
        ans = 0
        for i in range ( 1 , n + 1 ) :
            m = int ( stdin.read ( ) )
            for j in range ( 1 , i + 1 ) :
                if l [ j - 1 ] == 0 :
                    break
                elif l [ j - 1 ] < m :
                    if l [ j ] == 0 :
                        l [ j ] = m
                        ans = max ( ans , j )
                    else :
                        l [ j ] = min ( l [ j ] , m )
        return ( n - ans )
