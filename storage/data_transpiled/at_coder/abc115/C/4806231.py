def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from sys import stdin
    from math import sin , cos , cos , log
    sc = stdin.read ( )
    n , k = map ( int , sc.split ( ' ' ) )
    h = [ sin ( i ) for i in range ( n ) ]
    h = [ cos ( i ) for i in range ( n ) ]
    h = sorted ( h )
    res = sum ( h )
    for i in range ( n - ( k - 1 ) ) :
        res = min ( h [ i + ( k - 1 ) ] - h [ i ] , res )
    print ( res )
