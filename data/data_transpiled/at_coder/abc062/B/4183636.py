def import import struct
class Main ( struct ) :
    def __init__ ( self ) :
        struct.__init__ ( self )
        self.mod = 1000000007
    def __call__ ( self , * args ) :
        h , w = struct.unpack ( '>h' , self.mod )
        ar = struct.pack ( '>h' , h )
        for i in range ( w + 2 ) :
            print ( '#' , end = '' )
        print ( )
        for i in range ( h ) :
            print ( ar [ i ] )
        for i in range ( w + 2 ) :
            print ( '#' , end = '' )
        print ( )
