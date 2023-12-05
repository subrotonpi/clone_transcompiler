def import import _sys , os , sys
import os
import sys
import os
import sys
MOD = 1000000007
class Speed ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self.__dict__ = sys.__dict__
    def __repr__ ( self ) :
        return 'C-small-attempt1.in.txt'
    def open ( self , filename ) :
        f = open ( filename , 'w' )
        tests = os.popen ( 'C-small-attempt2.in.txt' ).readlines ( )
        for t in range ( 1 , tests + 1 ) :
            result = 0
            n , m , X , Y , Z = self.read ( ).split ( '.' )
            a = [ int ( i ) for i in f.readlines ( ) ]
            x = [ int ( ( X * a [ i % m ] + Y * ( i + 1 ) ) % Z ) for i in range ( m ) ]
            d = [ 1 ]
            for i in range ( n ) :
                d [ i ] = 1
                for j in range ( i - 1 , - 1 , - 1 ) :
                    if x [ j ] < x [ i ] :
                        d [ i ] = ( d [ i ] + d [ j ] ) % MOD
                result = ( result + d [ i ] ) % MOD
            print ( 'Case #%d: %s' % ( t , result ) , file = f )
        f.close ( )
        os.unlink ( filename )
