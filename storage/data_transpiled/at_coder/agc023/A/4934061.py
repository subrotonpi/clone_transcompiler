def import import sys
import struct
import struct
class Main ( struct.Struct ) :
    def __init__ ( self ) :
        sc = struct.Struct ( 'i' )
        N = sc.size
        a = struct.pack ( 'i' , N )
        a = [ sc.unpack ( 'i' ) [ 0 ] for i in a ]
        acc = [ acc [ i ] + a [ i ] for i in range ( N + 1 ) ]
        cnts = { }
        for i in range ( 0 , N ) :
            cnt = cnts [ acc [ i ] ] if acc [ i ] in cnts else 0
            cnts [ acc [ i ] ] += 1
        ans = 0
        for k , num in cnts.items ( ) :
            ans += struct.Struct ( 'i' ).pack ( k ) * ( num - 1 ) / 2
        self.out.write ( ans )
