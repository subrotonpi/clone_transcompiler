def _import ( ) : return _open ( )
import os
import sys
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
class LightScanner :
    def __init__ ( self ) :
        self.stdin = None
        self.stdout = None
        self.stdout = None
        self.stdin = None
        self.stdout = None
        self.stdout = None
        self.stdin = shlex.shlex ( shlex.split ( self.stdin ) )
        self.stdout = shlex.shlex ( shlex.split ( self.stdout ) )
        self.stdin.write ( self.stdout )
        self.stdout.write ( self.stdout )
        self.stdin.close ( )
        self.stdout.close ( )
    def solve ( self , test_number , self , * args ) :
        s = self.string
        n = len ( s )
        pow = [ 1 ] * n + [ 0 ]
        for i in range ( 1 , n + 1 ) :
            pow [ i ] = ( pow [ i - 1 ] * 3 ) % MOD
        a = [ ]
        c = [ ]
        q = [ ]
        for i in range ( n + 2 ) :
            a.append ( a [ i ] + ( s [ i ] == 'A' ) )
            c.append ( c [ i ] + ( s [ i ] == 'C' ) )
            q.append ( q [ i ] + ( s [ i ] == '?' ) )
        a.append ( a [ i ] )
        c.append ( c [ i ] )
        q.append ( q [ i ] )
        ans = 0
        for i in range ( n ) :
            d = q [ i ]
            if s [ i ] == 'A' or s [ i ] == 'C' :
                continue
            elif s [ i ] == '?' :
                d -= 1
            ans += pow [ d ] * a [ i ] * ( c [ i ] - q [ i ] )
            ans %= MOD
        return ans
