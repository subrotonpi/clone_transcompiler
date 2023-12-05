def import os
import time
import gc
import time
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self._exit = None
        self._exit = None
    def check ( a , b , middle , k ) :
        n = len ( a )
        sum = 0
        h = n - 1
        for i in range ( n ) :
            while h > 0 and a [ i ] * b [ h ] > middle :
                h -= 1
            if a [ i ] * b [ h ] <= middle :
                sum += h + 1
        return sum >= k
    def run ( self ) :
        sc = os.popen ( "cat " + str ( sys.argv [ 1 ] ) + " 2>/dev/null" )
        n , k = sc.read ( ).split ( "\n" )
        a = [ sc.read ( ).split ( "\0" ) [ 0 ] for i in range ( n ) ]
        b = [ sc.read ( ).split ( "\0" ) [ 0 ] for i in range ( n ) ]
        a.sort ( )
        b.sort ( )
        ng = 0
        ok = a [ n - 1 ] * b [ n - 1 ]
        while ok - ng > 1 :
            middle = ( ok + ng ) / 2
            if check ( a , b , middle , k ) :
                ok = middle
            else :
                ng = middle
        print ( ok )
    def tr ( self , * args ) :
        print ( " ".join ( map ( str , args ) ) )
