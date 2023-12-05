def _ _ main _ _ ( ) : return next ( iter ( sys.stdin.readline ( ) ) )
import sys
import os
import tokenize as tokenize
class Main ( ) :
    INF = 987654321
    def solve ( ) :
        s = tokenize.next ( )
        n = len ( s )
        g = [ ]
        for i in range ( n - 1 , - 1 , - 1 ) :
            g.append ( g [ i ] )
            if s [ i ] == '+' : g [ i ] += 1
            if s [ i ] == '-' : g [ i ] -= 1
            if s [ i ] == 'M' :
                ms.append ( g [ i ] )
        ms.sort ( )
        ans = 0
        for i in range ( len ( ms ) // 2 ) :
            ans -= ms [ i ]
        for i in range ( len ( ms ) // 2 , len ( ms ) ) :
            ans += ms [ i ]
        out.write ( ans )
    def tr ( * os ) :
        sys.stderr.write ( deepjoin ( os ) )
    def tr ( as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as as