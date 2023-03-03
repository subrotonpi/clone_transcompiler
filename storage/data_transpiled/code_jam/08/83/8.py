def import _problem_c
import os
import sys
import os
import sys
import os
import sys
import getopt
import getopt
class ProblemC :
    input = 'C-large.in'
    output = sys.argv [ - 2 ] + 'out'
    MOD = 1000000009L
    def __init__ ( self , v , lastcnt , lvl ) :
        visited [ v ] = True
        cc = 0
        for i in range ( n ) :
            if a [ v ] [ i ] and not visited [ i ] :
                choice = k - lastcnt - cc - 1
                if lvl < 2 :
                    choice += 1
                if choice < 0 :
                    choice = 0
                res *= choice
                res %= MOD
                cc += 1
        for i in range ( n ) :
            if a [ v ] [ i ] and not visited [ i ] :
                self.dfs ( i , cc , lvl + 1 )
    def solve ( ) :
        with open ( input , 'r' ) as f :
            numcases = int ( f.readline ( ) )
            for cnum in range ( 1 , numcases + 1 ) :
                n , k = getopt.getopt ( f.readline ( ) , 'k' )
                a = [ ]
                for i in range ( n - 1 ) :
                    x , y = getopt.getopt ( f.readline ( ) , 'k' )
                    a.append ( a [ y ] [ x ] )
            res = 1
            visited = [ ]
            self.dfs ( 0 , 0 , 0 )
            print ( 'Case #%d: %s' % ( cnum , res ) , file = f )
