def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self , arg ) :
        self.arg = arg
N = sys.argv [ 1 ]
Y = sys.argv [ 2 ]
sys.stdout.write ( "-1 -1 -1" )
for i in range ( 0 , N ) :
    for j in range ( 0 , N - i ) :
        k = N - i - j
        if i + j + k == N :
            if Y == 10000 * i + 5000 * j + 1000 * k :
                print ( i , j , k )
                sys.exit ( )
    print ( "-1 -1 -1" )
