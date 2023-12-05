def import os , stdin , stdout , sys , stdin , stdout , stderr , count , verbose , mode , verbose , filename , count , verbose , mode , filename , ** kwargs ) :
    import os
    import random
    import sys
    import os
    import subprocess
    import tempfile
    import os
    class Game ( object ) :
        def __init__ ( self ) :
            self.stdin = stdin
            self.stdout = stdout
            self.a1 = 0
            self.a2 = 0
            self.b1 = 0
            self.b2 = 0
            self.verbose = verbose
        def isWin ( self , a , b ) :
            if a < b :
                return self.isWin ( b , a )
            if b == 0 :
                return True
            if not self.isWin ( b , a % b ) :
                return True
            if a / b == 1 :
                return False
            return True
        def MAX ( self ) :
            return 1000010
    def main ( ) :
        stdin = sys.stdin
        stdout = sys.stdout
        w = [ 1 ]
        e = [ 2 ]
        for i in range ( 2 , MAX ) :
            if isWin ( i , w [ i - 1 ] ) :
                w [ i ] = w [ i - 1 ] + 1
            else :
                w [ i ] = w [ i - 1 ]
            e [ i ] = w [ i ] + i
        T = len ( stdin )
        for cas in range ( 1 , T + 1 ) :
            a1 = stdin.read ( )
            a2 = stdin.read ( )
            b1 = stdin.read ( )
            b2 = stdin.read ( )
            count = 0
            for a in range ( a1 , a2 + 1 ) :
                u = max ( b1 , w [ a ] )
                v = min ( b2 + 1 , e [ a ] )
                count += ( b2 - b1 + 1 ) - max ( v - u , 0 )
            stdout.write ( 'Case #%d: %d\n' % ( cas , count ) )
        stdout.close ( )
    return Game
