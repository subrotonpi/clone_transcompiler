def _import ( ) : return None
import sys
import os
import string
import string
import string
import random
import string
import random
import string
import random
import string
import random
import string
import random
import string
import random
import string
import random
import string
import random
import string
import random
import string
import random
import string
import string
import random
import string
import random
import string
import sys
import getopt
import getopt
def _import ( a , dest ) :
    fh = None
    dest = string
    f = open ( dest , 'w' )
    f = open ( dest , 'w' )
    f.write ( string )
    f.close ( )
def _import ( a , v ) :
    [ a [ i ] for i in range ( a [ - 2 : ] ) ]
    if a [ i ] < a [ i ] :
        return None
    temp = a [ p ]
    a [ p ] = a [ q ]
    a [ q ] = a [ p + 1 : ]
    return temp
def _reverse ( a , left , right ) :
    while left < right :
        temp = a [ left ]
        a [ left ] = a [ right ]
        a [ right ] = temp
        left += 1
        right -= 1
class DJoisinosTravel ( ) :
    def _solve ( self , test_number , f , g ) :
        n , m , r = f.ints
        d = f.ints
        g = AdjacencyMatrix ( n )
        for i in range ( m ) :
            g.add_edge ( f.ints [ - 1 ] , f.ints [ - 1 ] , f.ints [ - 1 ] )
        g.shorten ( )
        u = intlist ( g.ints [ 0 ] )
        ans = sys.maxint
        while True :
            t = 0
            for i in range ( 1 , r ) :
                t += g.get_weight_between ( d [ u [ i - 1 ] ] - 1 , d [ u [ i ] ] - 1 )
            ans = min ( ans , t )
