def import solve
import sys
import os
from sys import stdin
solve ( )
def solve ( ) :
    with stdin :
        n = stdin.readline ( ).strip ( )
        l = stdin.readline ( ).strip ( )
        a = [ ]
        ans = - 1
        for i in range ( n ) :
            a.append ( stdin.readline ( ).strip ( ) )
        for i in range ( n - 1 ) :
            if a [ i ] + a [ i + 1 ] >= l :
                ans = i + 1
                break
        if ans != - 1 :
            print ( "Possible" )
            for i in range ( 1 , ans ) :
                print ( i )
            for i in range ( n - 1 , ans - 1 , - 1 ) :
                print ( i )
        else :
            print ( "Impossible" )
