def import import struct
class Main ( struct.Struct ) :
    def __init__ ( self ) :
        struct.Struct ( "I" ).__init__ ( self )
    def __getitem__ ( self , key ) :
        return struct.Struct ( "I" ).__getitem__ ( key )
    def __setitem__ ( self , key , value ) :
        return struct.Struct ( "I" ).__setitem__ ( self , key , value )
    def __iter__ ( self ) :
        return self
