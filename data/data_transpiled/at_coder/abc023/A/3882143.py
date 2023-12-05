def main ( ) :
    import sys
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
        def __getattr__ ( self , attr ) :
            return getattr ( self.a , attr )
        def __getitem__ ( self , item ) :
            return getattr ( self.a , item )
        def __setitem__ ( self , item , value ) :
            self.b = item
            self.c = value
        def __len__ ( self ) :
            return len ( self.a )
    return Main ( )
