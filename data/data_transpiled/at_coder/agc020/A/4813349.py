def _import ( ) : return
import sys
import struct
import os
import sys
import struct
import sys
import struct
import sys
class Main ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.A = struct.unpack ( '>i' , self.A ) [ 0 ]
        self.B = struct.unpack ( '>i' , self.B ) [ 0 ]
        self.write ( 'Alice' if self.A % 2 == self.B % 2 else 'Borys' )
    def main ( self ) :
        w = sys.stdout.write
        exec ( struct.pack ( '>i' , self.A ) , w )
        w.flush ( )
