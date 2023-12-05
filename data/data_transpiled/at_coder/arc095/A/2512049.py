def import solve
import sys
import os
def solve ( ) :
    with open ( 'test.txt' , 'r' ) as sc :
        n = sc.read ( )
    x = [ ]
    y = [ ]
    for i in range ( n ) :
        x.append ( sc.read ( ) )
        y.append ( x [ i ] )
    y.sort ( )
    min , max = y [ n // 2 - 1 ]
    for i in range ( n ) :
        if x [ i ] <= min :
            print ( max )
        else :
            print ( min )
