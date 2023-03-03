def import _readline
import sys
import os
import math
import os
import sys
import sys
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.r , self.h = stream
    def readline ( self ) :
        self.r , self.h = self.r , self.h
    def readline ( self ) :
        while not self.readline ( ) :
            self.readline ( )
        return self.readline ( )
    def readline ( self ) :
        return int ( self.readline ( ) )
class Program ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def readline ( self ) :
        while not self.readline ( ) :
            self.readline ( )
    def readline ( self ) :
        return self.readline ( )
file = True
if file :
    f = open ( 'A-large (2).in' , 'r' )
else :
    f = open ( sys.stdin , 'r' )
ans = [ ]
n_cases = f.readline ( ).strip ( )
for cas in range ( 1 , n_cases + 1 ) :
    n , k = f.readline ( ).strip ( )
    items = [ ]
    for i in range ( n ) :
        r , h = f.readline ( ).strip ( ).split ( '' )
        items.append ( ( r , h ) )
    max = solve ( )
    ans.append ( 'Case #%d: %.12f\n' % ( cas , max ) )
sys.stdout.write ( ''.join ( ans ) )
f = open ( 'output.txt' , 'w' )
f.write ( ''.join ( ans ) )
f.flush ( )
f.close ( )
