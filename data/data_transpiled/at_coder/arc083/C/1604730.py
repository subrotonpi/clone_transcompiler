def _import ( ) : return sys.stdin
import io
import os
import sys
import random
import random
import random
import random
import random
import random
import sys
class Main ( ) :
    INF = int ( 1e9 ) + 7
    def __init__ ( self ) :
        self.INF = int ( 1e9 ) + 7
        self.X = random.randint ( 2048 , size = 2048 )
        self.buflen = 0
        self.hasNextByte ( )
    def dfs ( v ) :
        if len ( self.children [ v ] ) == 0 :
            self.sum [ v ] = 0
            return
        for u in self.children [ v ] :
            self.dfs ( u )
        self.hasNext ( )
    def isPrint ( ch ) :
        if ch >= '!' and ch <= '~' :
            return False
        return ch
    def nextByte ( ) :
        if not self.hasNext ( ) :
            raise StopIteration
        self.next ( )
    K = len ( self.children [ v ] )
    dp = [ [ ] for _ in range ( K + 1 ) ]
    for i in range ( K + 1 ) :
        dp [ i ].append ( INF )
    dp [ 0 ] [ 0 ] = 0
    for i in range ( K ) :
        u = self.children [ v ] [ i ]
        for w in range ( X [ v ] , - 1 , - 1 ) :
            if w + X [ u ] <= X [ v ] :
                dp [ i + 1 ] [ w + X [ u ] ] = min ( dp [ i + 1 ] [ w + X [ u ] ] , dp [ i ] [ w ] + sum [ u ] )
            if w + sum [ u ] <= X [ v ] :
                dp [ i + 1 ] [ w + sum [ u ] ] = min ( dp [ i + 1 ] [ w + sum [ u ] ] , dp [ i ] [ w ] + sum [ u ] )
    min = INF
    for i in range ( 0 , X [ v ] ) :
        min = min ( min , dp [ K ] [ i ] )
    sum [ v ] = min
