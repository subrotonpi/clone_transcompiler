def import _main
import sys
import numpy
import numpy
import numpy
import os
import sys
class Main ( object ) :
    PLUS = 10000
    def check ( start , x , a ) :
        dp = [ True ] * 20002
        dp [ start ] = True
        for i in a :
            next_dp = [ False ] * 20002
            for j in range ( 20002 ) :
                if not dp [ j ] :
                    continue
                next_dp [ j + i ] = True
                next_dp [ j - i ] = True
            dp = [ True ] + next_dp
        return dp [ x ]
    def main ( ) :
        with open ( sys.argv [ 1 ] ) as sc :
            for s in sc.readlines ( ) :
                x = sc.index ( x ) + PLUS
                y = sc.index ( y ) + PLUS
                ax = [ ]
                ay = [ ]
                is_odd = False
                for i in range ( len ( s ) ) :
                    cnt = 0
                    while i < len ( s ) and s [ i ] == 'F' :
                        cnt += 1
                        i += 1
                    if is_odd :
                        ay.append ( cnt )
                    else :
                        ax.append ( cnt )
                    is_odd = not is_odd
                now_x = PLUS + ax [ 0 ]
                now_y = PLUS
                if check ( now_x , x , ax [ 1 : ] ) and check ( now_y , y , ay ) :
                    print ( "Yes" )
                else :
                    print ( "No" )
