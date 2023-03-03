def import solve
import sys
import os
from sys import stdin
solve ( )
def solve ( ) :
    with stdin :
        n , q , s = stdin.readline ( ).split ( ' ' )
        l = [ ]
        r = [ ]
        for i in range ( q ) :
            l.append ( stdin.readline ( ).strip ( ) )
            r.append ( stdin.readline ( ).strip ( ) )
    l = [ ]
    for i in range ( 1 , n ) :
        if s [ i ] == 'C' and s [ i - 1 ] == 'A' :
            l.append ( l [ i - 1 ] + 1 )
        else :
            l.append ( l [ i - 1 ] )
    for i in range ( q ) :
        print ( l [ r [ i ] - 1 ] - l [ i ] - 1 )
