def _import ( ) :
    from io import StringIO
    import sys
    class Main ( object ) :
        def __init__ ( self , name ) :
            self.name = name
        def __repr__ ( self ) :
            return repr ( self.name )
        def __getitem__ ( self , key ) :
            return self.name [ key ]
        def __setitem__ ( self , key , value ) :
            self.name [ key ] = value
        def __len__ ( self ) :
            return len ( self.name )
    sys.stdout = Main ( )
