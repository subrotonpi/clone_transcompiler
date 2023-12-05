def import _readline
import readline
import readline
import readline
import readline
import time
import sys
import time
import sys
import itertools
import itertools
MOD = 1000000007
def main ( args ) :
    with readline ( ) as sc :
        while not args [ 0 ].startswith ( 'readline' ) or not args [ 0 ].startswith ( 'readline' ) :
            yield int ( sc.readline ( ) )
    def readline ( ) :
        return readline ( )
    def readline ( ) :
        return readline ( )
    def readline ( ) :
        return readline ( )
    def readline ( ) :
        try :
            data = readline ( )
        except EOFError :
            pass
        return data
    def readline ( ) :
        data = ''
        try :
            data = readline ( )
        except EOFError :
            pass
        return data
    def solve ( ) :
        dp = [ 0 ] * ( h * w )
        series = [ ]
        for y , x , value in series :
            dp [ y ] [ x ] = 1
            if x > 0 and board [ y ] [ x - 1 ] < board [ y ] [ x ] :
                dp [ y ] [ x ] += dp [ y ] [ x - 1 ]
                dp [ y ] [ x ] %= MOD
            if x < w - 1 and board [ y ] [ x + 1 ] < board [ y ] [ x ] :
                dp [ y ] [ x ] += dp [ y ] [ x + 1 ]
                dp [ y ] [ x ] %= MOD
        sum = 0
        for i in range ( h ) :
            for j in range ( w ) :
                sum += dp [ i ] [ j ]
                dp [ y ] [ x ] %= MOD
        print ( sum )
    class Triplet ( object ) :
        y = 0
        x = 0
        def __init__ ( self , y = 0 , x = 0 ) :
            self.y = y
            self.x = x
            self.value = value
        def __lt__ ( self , self ) :
            return self.value - self.value
