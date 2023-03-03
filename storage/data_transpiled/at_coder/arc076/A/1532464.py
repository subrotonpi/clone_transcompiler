def import import sys
import os
import sys
import math
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.buffer = sys.stdin.read ( )
    def __str__ ( self ) :
        return self.buffer.decode ( )
data = sys.stdin.read ( ).split ( )
n = int ( data [ 0 ] )
m = int ( data [ 1 ] )
base = long ( 1e9 ) + 7
ans = 1
if abs ( n - m ) == 0 :
    ans *= 2
    ans %= base
elif abs ( n - m ) > 1 :
    print ( 0 )
    sys.exit ( 0 )
for i in range ( 1 , n + 1 ) :
    ans *= i
    ans %= base
for i in range ( 1 , m + 1 ) :
    ans *= i
    ans %= base
print ( ans )
