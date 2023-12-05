def _import ( ) : return sys.stdin.readline ( )
import os
import sys
import os
import sys
import getopt
import termios
import getopt
def main ( ) :
    ans , k = 0 , 0
    r = [ ]
    def dfs ( q , p ) :
        h = 0
        for w in r [ q ] :
            h = max ( h , dfs ( w , q ) + 1 )
        if h == k - 1 and p != 0 :
            ans += 1
            h = - 1
        return h
    def solve ( ) :
        n , k = randint ( 1 , n ) , randint ( 1 , n )
        r = [ [ ] for i in range ( n ) ]
        ans = 0
        for i in range ( n ) :
            q = randint ( 1 , q )
            if i != 0 :
                r [ q - 1 ].append ( i )
            elif q != 1 :
                ans += 1
        dfs ( 0 , 0 )
        out.write ( ans )
    return ans
