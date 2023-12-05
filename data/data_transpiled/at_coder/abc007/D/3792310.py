def _import ( ) : return sys.stdin.read ( )
import io
import os
import sys
import struct
import os
import sys
import io
import io
import sys
class FasterScanner ( io.Scanner ) :
    def __init__ ( self ) :
        self.buffer = io.StringIO ( )
        self.buffer = io.StringIO ( )
        self.buffer = io.StringIO ( )
        self.buffer.seek ( 0 )
        self.buffer.seek ( 0 )
        self.buffer.read ( 1024 )
        self.buffer.seek ( 0 )
        self.buffer.seek ( 0 )
        self.buffer.read ( 1024 )
        self.buffer.seek ( 0 )
        self.buffer.write ( b )
        self.buffer.write ( b )
        self.solver = Task ( )
        self.solver.solve ( 1 , self.buffer , self.buffer.write )
        self.buffer.close ( )
    def next ( self ) :
        while self.buffer.read ( 1024 ).find ( b ) != - 1 :
            self.buffer.write ( b )
            self.buffer.seek ( 0 )
    def solve ( self , test_number , f , out ) :
        a = f.read ( 1024 ).split ( b )
        b = f.read ( 1024 ).split ( b )
        dl = len ( b )
        na = [ '0' ] * dl
        a = na [ : ]
        a = a [ : - 1 ]
        for i in range ( dl + 1 ) :
            for j in range ( 2 ) :
                for k in range ( 2 ) :
                    for l in range ( 2 ) :
                        if ( k | l ) == 1 :
                            ans += self.memo [ i ] [ j ] [ k ] [ l ]
    ans = 0
    for i in range ( 2 ) :
        for j in range ( 2 ) :
            for k in range ( 2 ) :
                for l in range ( 2 ) :
                    if ( k | l ) == 1 :
                        ans += self.memo [ i ] [ j ] [ k ] [ l ]
        ans += 1
    return ans
