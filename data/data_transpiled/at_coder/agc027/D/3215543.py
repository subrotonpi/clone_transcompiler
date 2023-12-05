def _import ( ) : return _import ( )
import sys
import math
import numpy as np
import collections
import sys
class Main ( object ) :
    mod = 1000000007
    def __init__ ( self , * os ) :
        sc = Reader ( sys.stdin )
        f = sys.stdout
        m = sc.randint ( 0 , 100000 )
        a = [ ]
        p = [ ]
        for i in range ( 4 , n + 1 , 2 ) :
            p.append ( True )
        for i in range ( 3 , n ** 2 + 1 , 2 ) :
            if not p [ i ] :
                for t in range ( i ** 2 , n + 1 , i ) :
                    p.append ( True )
        prime = [ 0 ] * 1010
        c , v = 0 , 0
        for i in range ( 2 , len ( prime ) ) :
            if not p [ i ] :
                prime [ c ] = i
        for i in range ( m ) :
            fill ( a [ i ] , 1 )
        n = m
        for i in range ( n ) :
            for j in range ( n ) :
                if ( i + j ) % 2 == 0 :
                    a [ i ] [ j ] = prime [ ( i + j ) / 2 ] * prime [ ( i - j ) / 2 + n + n / 2 + 2 ]
        dx = [ 1 , - 1 , 0 , 0 ]
        dy = [ 0 , 0 , 1 , - 1 ]
        for i in range ( m ) :
            for t in range ( m ) :
                if i % 2 != t % 2 :
                    z , g = 1 , g
                    for w , xx , yy in zip ( dy , dx , dy ) :
                        if 0 <= xx < m and 0 <= yy < m :
                            g = gcd ( z , a [ yy ] )
                            a [ yy ] [ xx ] = g
                a [ i ] [ t ] += z
