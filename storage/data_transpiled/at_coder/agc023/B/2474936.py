def import _main
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self , val ) :
        self.maxSize = val
    def ok ( self ) :
        return 0 <= val < self.maxSize
    def main ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        if N == 1 :
            print ( 1 )
            return
        self.maxSize = 2 ** N - 1
        table = [ ]
        for chars in sc.read ( 2 * N - 1 ).split ( ) :
            for i in range ( N ) :
                table.append ( [ chars [ i ] for i in range ( 2 * N - 1 ) ] )
        for i in range ( len ( table ) ) :
            for j in range ( len ( table ) ) :
                table [ i ] [ j ] = table [ i % N ] [ j % N ]
        complete = ( N ** 2 - N ) / 2
        ans = 0
        cant = [ ]
        for delta in range ( - N + 1 , N - 1 ) :
            for i in range ( len ( cant ) ) :
                cant.append ( [ 0 ] * 2 ** delta )
            for dist in range ( 1 , N ) :
                for i in range ( 2 ** delta ) :
                    val = i + delta + dist
                    if not ok ( val ) or not ok ( i + dist ) or not ok ( i + delta ) :
                        continue
                    if table [ i ] [ val ] == table [ i + dist ] [ i + delta ] :
                        cant [ i ] [ val ] = 1
                    cant [ i ] [ val ] += cant [ i ] [ val - 1 ] + cant [ i + 1 ] [ val ] - cant [ i + 1 ] [ val - 1 ]
                    if dist == N - 1 and cant [ i ] [ val ] == complete :
                        ans += 1
        print ( ans )
