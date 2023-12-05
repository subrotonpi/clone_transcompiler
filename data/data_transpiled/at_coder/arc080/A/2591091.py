def import solve
import sys
import os
from sys import stdin
solve ( )
def solve ( ) :
    with stdin :
        n = sys.stdin.readline ( ).rstrip ( '\n' )
        a = [ i for i in range ( n ) ]
        num = [ 0 ] * 3
        for i in range ( n ) :
            if a [ i ] % 4 == 0 :
                num [ 0 ] += 1
            elif a [ i ] % 2 == 0 :
                num [ 1 ] += 1
            else :
                num [ 2 ] += 1
        if num [ 2 ] > num [ 0 ] + 1 :
            print ( 'No' )
        elif num [ 2 ] > num [ 0 ] and num [ 1 ] != 0 :
            print ( 'No' )
        elif num [ 2 ] != 0 and num [ 0 ] == 0 :
            print ( 'No' )
        else :
            print ( 'Yes' )
