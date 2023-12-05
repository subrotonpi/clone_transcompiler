def import import decimal
import sys
import decimal
import matplotlib.pyplot as plt
class Main ( object ) :
    def __init__ ( self ) :
        plt.figure ( )
    def __call__ ( self , * args , ** kwargs ) :
        N = float ( args [ 0 ] )
        d = float ( args [ 1 ] )
        x = float ( args [ 2 ] )
        ans = decimal.Decimal ( '0.0' )
        while N > 0.5 :
            adnum = decimal.Decimal ( d + x * ( N - 0.5 ) )
            ans = ans + adnum
            d = ( N + 1.0 ) * d / N + ( 5.0 * x ) / ( 2.0 * N )
            x = ( 1.0 + ( 2.0 / N ) ) * x
            del N
    plt.plot ( ans , '-' )
    plt.show ( )
