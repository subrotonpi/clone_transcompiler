def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        Scanner ( ).__init__ ( self )
        N = self.N
        M = self.M
        s = ( M - 2 * N ) // 2
        for k in range ( 0 , s ) :
            j = M - 2 * ( N + k )
            i = N - j - k
            if i >= 0 and j >= 0 and i + j + k == N :
                self.out.write ( "%d %d %d" % ( i , j , k ) )
                exit ( 0 )
        self.out.write ( "-1 -1 -1" )
