def _import ( ) : return int ( a ) * MOD
from io import StringIO
import readline
import readline
import readline
import readline
import readline
import time
import sys
class Main ( object ) :
    def __init__ ( self , f ) :
        readline.__init__ ( self )
        self.N , X , Y , Z = readline.readline ( ).strip ( ).split ( ' ' )
    def __next__ ( self ) :
        a = [ ]
        for i in range ( self.N ) : a.append ( randint ( 0 , a.pop ( ) ) )
        return a
    def __next__ ( self ) :
        return int ( self.next ( ) )
    def __next__ ( self ) :
        return int ( self.next ( ) )
    def __next__ ( self ) :
        return int ( self.next ( ) )
    def __next__ ( self ) :
        return int ( self.next ( ) )
    def __next__ ( self ) :
        return int ( self.next ( ) )
    def __next__ ( self ) :
        return int ( self.next ( ) )
    def MOD ( self ) :
        return 1_000_000_007
    def solve ( self ) :
        B = X + Y + Z
        BN = 1 << B
        MEMO = [ ]
        OK = ( 1 << X + Y + Z - 1 ) | ( 1 << Y + Z - 1 ) | ( 1 << Z - 1 )
        MASK = ( 1 << X + Y + Z ) - 1
        for i in range ( BN ) :
            for j in range ( 10 ) :
                next = ( i << ( j + 1 ) ) | ( 1 << j )
                next &= MASK
                if ( OK & next ) == OK :
                    MEMO [ i ] [ j ] = - 1
                else :
                    MEMO [ i ] [ j ] = next
        dp = [ ]
        prev = [ ]
        dp.append ( 1 )
        for i in range ( self.N ) :
            temp = dp
            dp = prev
            prev = temp
            [ bit ] = 0
            for bit in range ( self.N ) :
                if prev [ bit ] == 0 :
                    continue
                for n in range (