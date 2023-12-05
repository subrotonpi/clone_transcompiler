def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.v0 = sys.argv [ 0 ]
            self.v1 = sys.argv [ 1 ]
            self.v2 = sys.argv [ 2 ]
            self.v3 = sys.argv [ 3 ]
        def __repr__ ( self ) :
            return "<%s>" % repr ( self.v3 )
        def __call__ ( self ) :
            return "<%s>" % repr ( self.v2 )
        def __call__ ( self ) :
            return "<%s>" % repr ( self.v1 )
        def __repr__ ( self ) :
            return "<%s>" % repr ( self.v3 )
        def __call__ ( self ) :
            return "<%s>" % repr ( self.v2 )
        def __call__ ( self ) :
            return "<%s>" % repr ( self.v1 )
        def __repr__ ( self ) :
            return "<%s>" % repr ( self.v3 )
    return Main ( )
