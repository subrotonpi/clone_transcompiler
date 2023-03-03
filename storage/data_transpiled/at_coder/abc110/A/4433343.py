def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.a = [ ]
            for i in range ( 3 ) :
                self.a.append ( sc.read ( ) )
        def __repr__ ( self ) :
            return '%s%s%s' % ( self.a [ 2 ] * 10 , self.a [ 1 ] , self.a [ 0 ] )
    return Main ( )
