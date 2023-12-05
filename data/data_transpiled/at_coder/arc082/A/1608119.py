def import _solve
import sys
import string
import sys
import os
import sys
import sys
sys.stdin = sys.__stdin__
sys.stdout = sys.__stdout__
sj = string.split ( '\n' )
for i in range ( 2 ) :
    sj += string.split ( ' ' )
print ( solve ( sj ) )
def solve ( stdin_string ) :
    splits = stdin_string.split ( '\n' )
    N = int ( splits [ 0 ] )
    nums = [ int ( i ) for i in splits [ 1 : ] ]
    max = sys.maxint
    x_counts = { }
    for i in range ( N ) :
        x_counts [ nums [ i ] - 1 ] = x_counts.get ( nums [ i ] - 1 , 0 ) + 1
        max = max ( max , x_counts [ nums [ i ] - 1 ] )
        x_counts [ nums [ i ] ] = x_counts.get ( nums [ i ] , 0 ) + 1
        max = max ( max , x_counts [ nums [ i ] ] )
        x_counts [ nums [ i ] + 1 ] = x_counts.get ( nums [ i ] + 1 , 0 ) + 1
        max = max ( max , x_counts [ nums [ i ] + 1 ] )
    return max
ex1 = '7\n3 1 4 1 5 9 2'
ex2 = '10\n0 1 2 3 4 5 6 7 8 9'
ex3 = '1\n99999'
def tests ( ) :
    print ( solve ( ex1 ) )
    print ( solve ( ex2 ) )
    print ( solve ( ex3 ) )
