def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import readline
import readline
import sys
import time
import math
import shlex
import sys
class Main ( object ) :
    sc = readline
    N = sc.__next__ ( )
    Q = [ ]
    sum = 0
    ary = [ ]
    awase = [ [ ] for i in range ( N * 3 ) ]
    for i in range ( N * 3 ) :
        tmp = sc.__next__ ( )
        ary.append ( tmp )
        if i < N :
            Q.append ( tmp )
            sum += tmp
            awase [ 0 ].append ( sum )
        elif i >= N and i < 2 * N :
            a = Q.peek ( )
            if a < tmp :
                Q.pop ( )
                Q.append ( tmp )
                sum += ( tmp - a )
            else :
                pass
            awase [ i - ( N - 1 ) ].append ( sum )
    Q = [ ]
    sum = 0
    for i in range ( 3 * N - 1 , - 1 , - 1 ) :
        tmp = - ary [ i ]
        if i >= 2 * N :
            Q.append ( - ary [ i ] )
            sum += ary [ i ]
            awase [ min ( i - N , N ) ].append ( sum )
        else :
            a = Q.peek ( )
            if a < tmp :
                Q.pop ( )
                Q.append ( tmp )
                sum -= ( tmp - a )
            else :
                pass
            awase [ min ( i - N , N ) ].append ( sum )
    max = sys.maxint
    for i in range ( 0 , N ) :
        max = max ( awase [ i ] [ 0 ] - awase [ i ] [ 1 ] , max )
    pl ( max )
