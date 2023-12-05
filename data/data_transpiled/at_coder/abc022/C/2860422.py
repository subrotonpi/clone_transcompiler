def import _main
import sys
import random
import sys
import math
import random
import sys
import sys
import math
import sys
INF = 100000000
def main ( ) :
    with open ( sys.argv [ 1 ] , 'r' ) as infile :
        n , m = [ int ( i ) for i in infile.read ( ).split ( ' ' ) ]
        lst = [ ]
        route = [ [ 0 for arr in arr ] for i in range ( n ) ]
        for i in range ( n ) :
            route [ i ] [ i ] = 0
        for k in range ( m ) :
            u , v , l = [ i - 1 for i in range ( n ) ]
            if u == 0 or v == 0 :
                lst.append ( ( u , v , l ) )
            else :
                route [ u , v ] = route [ v ] [ u ] = l
        for k in range ( n ) :
            for x in range ( n ) :
                for y in range ( n ) :
                    route [ x ] [ y ] = min ( route [ x ] [ y ] , route [ x ] [ k ] + route [ k ] [ y ] )
        ans = INF
        for a in lst :
            for b in lst :
                if a.to != b.to and route [ a.to ] [ b.to ] != INF :
                    ans = min ( ans , route [ a.to ] [ b.to ] + a.cost + b.cost )
        print ( ans == INF )
class Edge ( ) :
    def __init__ ( self , to , cost ) :
        self.to = to
        self.cost = cost
