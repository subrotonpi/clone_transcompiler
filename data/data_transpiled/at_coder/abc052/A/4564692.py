def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
            self.c = 3
            self.d = 4
        def __repr__ ( self ) :
            return "%s %s" % ( self.a , self.b )
    a = Main ( )
    b = Main ( )
    c = Main ( )
    d = Main ( )
    ans = max ( a * b , c * d )
    print ( ans )
    sys.exit ( 1 )
