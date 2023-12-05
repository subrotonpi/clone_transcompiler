def import _solve , run_input , file_prefix
import os
import sys
import os
import sys
import math
import os
import sys
class A :
    def solve ( r , p ) :
        n = len ( r )
        ret = 0
        i1 = 1
        i2 = 1
        last1 = 0
        last2 = 0
        for i in range ( n ) :
            if r [ i ] :
                d = abs ( p [ i ] - i1 ) - ( ret - last1 )
                if d < 0 :
                    d = 0
                ret += d + 1
                last1 = ret
                i1 = p [ i ]
            else :
                d = abs ( p [ i ] - i2 ) - ( ret - last2 )
                if d < 0 :
                    d = 0
                ret += d + 1
                last2 = ret
                i2 = p [ i ]
        return ret + "\n"
    def run_input ( f ) :
        items = f.strip ( ).split ( "s+" )
        n = int ( items [ 0 ] )
        r = [ False ] * n
        p = [ ]
        for i in range ( n ) :
            i1 = i * 2 + 1
            i2 = i * 2 + 2
            if items [ i1 ] == "B" :
                r [ i ] = True
            p.append ( int ( items [ i2 ] ) )
        return solve ( r , p )
    def main ( ) :
        a = A ( )
        with open ( file_prefix + ".in" , "r" ) as file_in :
            with open ( file_prefix + ".out" , "w" ) as file_out :
                n = int ( file_in.read ( ) )
                for i in range ( 1 , n + 1 ) :
                    ret = "Case #" + str ( i ) + ": "
                    ret += run_input ( file_in )
                    print ( ret , end = ' ' )
        return solve ( a , r )
