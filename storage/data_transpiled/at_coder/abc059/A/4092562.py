def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
        def __str__ ( self ) :
            return "%s%s%s" % ( self.A , self.B , self.C )
    return Main ( )
