def import import _rectify
import sys
import time
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        self._rectify = _rectify
    def run ( self ) :
        sc = _rectify
        n = sc.npartitions
        a = [ [ sc.randint ( 0 , n ) for i in range ( 2 ) ] for _ in range ( n ) ]
        a.sort ( key = lambda x : x [ 0 ] )
        cnt = [ 0 ] * n
        s , t = 0 , 0
        while True :
            if s == n : break
            while t != n and a [ s ] [ 1 ] <= a [ t ] [ 1 ] :
                t += 1
            cnt [ int ( a [ s ] [ 1 ] ) ] += ( a [ s ] [ 0 ] - ( t == n ) ) * s
            for i in range ( t - 1 , s , - 1 ) :
                cnt [ int ( a [ s ] [ 1 ] ) ] += ( a [ i ] [ 0 ] - ( t == n ) ) * s
            s = t
        for i in cnt :
            print ( i )
    def tr ( self , * args ) :
        print ( " ".join ( map ( str , args ) ) )
