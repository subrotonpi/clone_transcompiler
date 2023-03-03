def _import ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self , o ) :
            self.v = o.v
            self.d = o.d
        def __lt__ ( self , o ) :
            return self.v < o.v
    class Value ( object ) :
        def __init__ ( self , o ) :
            self.v = o.v
            self.i = o.i
            self.d = o.d
        def __lt__ ( self , o ) :
            return self.v < o.v
    class Main ( object ) :
        def __init__ ( self , o ) :
            self.v = o.v
            self.i = o.i
            self.d = o.d
        def __lt__ ( self , o ) :
            return self.v < o.v
        def __gt__ ( self , o ) :
            return self.v > o.v
        def __eq__ ( self , o ) :
            return self.v < o.i
        def __le__ ( self , o ) :
            return self.d < o.i
        def __ge__ ( self , o ) :
            return self.v >= o.v
        def __ne__ ( self , o ) :
            return self.v >= o.i
    return Main ( )
