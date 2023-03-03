def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            self.A = int ( args [ 0 ] )
            self.B = int ( args [ 1 ] )
            self.C = int ( args [ 2 ] )
            self.D = int ( args [ 3 ] )
            self.Alice = int ( args [ 4 ] )
            self.Bob = int ( args [ 5 ] )
        def __repr__ ( self ) :
            return "%s %s" % ( self.A , self.B , self.C )
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            self.Alice = int ( args [ 1 ] )
            self.Bob = int ( args [ 2 ] )
        def __repr__ ( self ) :
            return "%s %s" % ( self.Alice , self.Bob )
    return Main ( )
