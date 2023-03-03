def import _main
import sys
import os
import sys
import sys
class Main ( object ) :
    def run ( self ) :
        with open ( sys.argv [ 1 ] , 'r' ) as sc :
            n = sc.read ( )
            a = [ sc.read ( ) ]
            r , l = [ ] , [ ]
            for i in range ( n ) :
                a.append ( sc.read ( ) )
            stack = [ ]
            cnts = [ 0 ]
            cnt = 1
            for i in range ( n ) :
                l.append ( 1 )
                while stack [ cnt ] > a [ i ] :
                    stack.pop ( )
                    l [ i ] += cnts.pop ( )
                stack.append ( a [ i ] )
                cnts.append ( l [ i ] )
            stack = [ ]
            stack.append ( 0 )
            for i in range ( n - 1 , - 1 , - 1 ) :
                r.append ( 1 )
                while stack [ cnt ] > a [ i ] :
                    stack.pop ( )
                    r [ i ] += cnts.pop ( )
                stack.append ( a [ i ] )
                cnts.append ( r [ i ] )
            ans = 0
            for i in range ( n ) :
                ans += 1 * a [ i ] * l [ i ] * r [ i ]
            print ( ans )
    def debug ( * os ) :
        print ( " ".join ( os ) , file = sys.stderr )
    def main ( ) :
        return Main ( )
