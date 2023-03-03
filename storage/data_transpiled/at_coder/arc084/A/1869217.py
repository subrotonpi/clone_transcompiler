def import _int_to_int
import sys
import struct
import os
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
    def g_int ( self ) :
        return int ( self.s )
    def main ( self , $ ) :
        n = g_int ( )
        a , b , c = self._in ( n )
        v1 , v2 = [ ] , [ ]
        def _prefix ( v ) :
            for i in range ( n ) :
                for v in range ( n ) and a [ v ] < b [ i ] :
                    pass
                v1.append ( v )
        v1.extend ( _prefix ( v1 , sum ) )
        def _prefix ( v ) :
            for i in range ( n ) :
                for v in range ( n ) and b [ v ] < c [ i ] :
                    pass
                v2.append ( 0 if v == 0 else v1 [ v - 1 ] )
        print ( sum ( v2 ) )
    def _in ( self , n ) :
        return struct.calcsize ( 'I' )
