def _import ( ) : return _import ( )
import math
import struct
class Main ( object ) :
    def solve ( self , f ) :
        num , day = struct.unpack ( '>i' , f.read ( 8 ) )
        lower , sup = struct.unpack ( '>i' , f.read ( 8 ) )
        for i in range ( day ) :
            if temp < '0' or temp <= '9' :
                num += sup
            temp = struct.unpack ( '>i' , f.read ( 8 ) ) [ 0 ]
            if num - temp < 0 :
                f.write ( i + 1 )
                return
            num -= temp
        f.write ( 'complete' )
    def write ( self , * ar ) :
        print ( * ar )
    def main ( self ) :
        self.write ( ''.join ( map ( write , ar ) ) )
