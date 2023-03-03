def import import _divmod
import os
import sys
import struct
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.MODULO = 1_000_000_000 + 7
    def run ( self ) :
        with open ( "/proc/cpuinfo" , "r" ) as f :
            N = struct.unpack ( ">I" , f.read ( 4 ) ) [ 0 ]
            f = [ ]
            cum = [ ]
            f.append ( - int ( f.read ( 4 ) ) / 16 )
            cum.append ( - int ( f.read ( 4 ) ) / 16 )
            f.append ( N )
            cum.append ( N )
            for i in range ( 2 , N + 1 ) :
                f.append ( f [ i - 1 ] )
                f [ i ] = ( f [ i ] + 1 * ( N - 1 ) * ( N - 1 ) % MODULO ) % MODULO
                if i > 3 :
                    f [ i ] = ( f [ i ] + cum [ i - 3 ] ) % MODULO
                f [ i ] = ( f [ i ] + min ( 0 , i - 3 ) - ( i - N - 1 ) + 1 ) % MODULO
                cum [ i ] = ( cum [ i - 1 ] + f [ i ] ) % MODULO
            print ( f [ N ] )
    def tr ( self , * args ) :
        print ( " ".join ( args ) )
