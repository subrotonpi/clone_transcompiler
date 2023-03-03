def import math
import math
import numpy
import math
import os
class Main ( object ) :
    def __init__ ( self ) :
        self.name = 'Main'
    def __repr__ ( self ) :
        return '<%s>' % self.name
n = int ( sys.stdin.readline ( ) )
arr = [ int ( i ) for i in sys.stdin.readline ( ).split ( ' ' ) ]
arr.sort ( key = lambda x : x [ 0 ] )
result = 0.0
for i in range ( n ) :
    area = arr [ i ] ** 2 * math.pi
    if i % 2 == 0 :
        result += area
    else :
        result -= area
    print ( result )
