def import _open
import os
import sys
import os
import sys
import subprocess
import subprocess
import subprocess
import sys
class a :
    def __init__ ( self ) :
        self.stdin = open ( 'A-large.in' )
        self.stdout = open ( 'a.out' , 'w' )
        self.cc = 0
        self.t = subprocess.call ( [ 'a' ] )
    def go ( self ) :
        s = self.stdin.readline ( )
        k = len ( s )
        n = len ( s )
        li = [ ( s [ i ] , 1 ) for i in range ( n ) ]
        ans = 0
        for i in range ( 0 , k - 1 , n ) :
            if li [ i ] == 0 :
                for j in range ( k ) :
                    li [ j + i ] = 1 - li [ j + i ]
                ans += 1
        good = True
        for i in range ( n ) :
            if li [ i ] == 0 : good = False
        if good :
            self.stdout.write ( 'Case #%d: %d\n' % ( self.cc , ans ) )
        else :
            self.stdout.write ( 'Case #%d: IMPOSSIBLE\n' % ( self.cc , ans ) )
