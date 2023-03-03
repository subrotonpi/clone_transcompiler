def _ import _ , os , sys , stdin , stdout , stderr , c , p ) : return int ( stdin.read ( ) )
import random
import sys
import os , sys
import os , sys
import os , sys
import subprocess , time , time , sys
class Main ( object ) :
    filename = 'C-large'
    fc = 2.0 / ( math.sqrt ( 5 ) + 1 )
    def iread ( ) : return int ( readword ( ) )
    def test2 ( A , B ) :
        C = int ( fc * A )
        if B < C : return B
        return C
    def readword ( ) :
        b = [ ]
        while c >= '' : c = stdin.read ( )
        if c < 0 : return ''
        while c > '' :
            b.append ( ord ( c ) )
            c = stdin.read ( )
        return b
    def test ( A , B1 , B2 , p ) :
        ans = 0
        if B2 >= 2 * A + 1 :
            ans += B2 - 2 * A
            B2 = 2 * A
        if B1 < A :
            C1 , C2 = B1 , min ( A - 1 , B2 )
            ans += test2 ( A , C2 ) - test2 ( A , C1 - 1 )
        if B2 > A :
            C1 , C2 = max ( A + 1 , B1 ) , B2
            ans += ( C2 - C1 + 1 ) - test ( A , C1 - A , C2 - A , p ^ 1 )
        return ans
    def gcd ( x , y ) :
        if x < y :
            t , x , y = x , y
        if x > 2 * y : return 1
        if x == y : return 0
        return 1 - gcd ( x - y , y )
    def check ( ) :
        for A in range ( 1 , 20 ) :
            for B1 in range ( 1 , 50 ) :
                c = 0
                for B2 in range ( B1 , 50 ) :
                    c += gcd ( A , B2 )
                    c2 = test ( A , B1 , B2 , 0 )
                    if c2 != c :
                        print ( "FAIL: A=%d B=%d res=%d expected=%d" % ( A ,