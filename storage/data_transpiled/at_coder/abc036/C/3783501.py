def import import sys
import struct
import struct
class Main ( struct.Struct ) :
    def __init__ ( self , * args ) :
        sc = struct.Struct ( 'i' )
        n = sc.size
        a = [ ]
        set1 = struct.Struct ( 'i' )
        for i in range ( n ) :
            a.append ( sc.unpack ( 'i' ) )
            set1.append ( a [ i ] )
        m = { }
        t = len ( set1 )
        for i in range ( t ) :
            m [ set1.popleft ( ) ] = i
        for i in range ( n ) :
            print ( m [ a [ i ] ] )
