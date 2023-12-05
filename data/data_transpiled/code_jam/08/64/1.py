def _import ( * args ) : return
import __builtin__
import __builtin__
import __builtin__
import __builtin__
import __builtin__
import __builtin__
import sys
import gc
import os
import sys
import traceback
class D ( object ) :
    def __init__ ( self , * os ) :
        super ( D , self ).__init__ ( * os )
    def run ( self ) :
        with open ( os.devnull , 'w' ) as devnull :
            on = sys.stdin.read ( )
            for o in range ( 1 , on + 1 ) :
                print ( "Case #%d: " % o , end = ' ' )
                n = len ( os.listdir ( ) )
                g = [ [ False ] * n for i in range ( n - 1 ) ]
                for v , u in zip ( [ - 1 ] , [ 1 ] ) :
                    g [ v ] [ u ] = g [ u ] [ v ] = True
            m = len ( os.listdir ( ) )
            f = [ [ False ] * m for i in range ( m - 1 ) ]
            for v , u in zip ( [ - 1 ] , [ 1 ] ) :
                f [ v ] [ u ] = f [ u ] [ v ] = True
            id = [ i for i in range ( n ) ]
            ok = False
            while True :
                tmp = True
                for i in range ( m ) :
                    for j in range ( m ) :
                        tmp &= g [ id [ i ] ] [ id [ j ] ] == f [ i ] [ j ]
                ok |= tmp
                if ok :
                    print ( "YES" )
                else :
                    print ( "NO" )
    def next_permutation ( self ) :
        n = len ( self )
        for i in range ( n - 1 , 0 , - 1 ) :
            if self [ i - 1 ] < self [ i ] :
                j = n
                while self [ i - 1 ] >= self [ j ] :
                    del self [ i ]
        rev ( self , 0 , n )
        return
