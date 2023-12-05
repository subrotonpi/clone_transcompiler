def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
            self.x = 3
        def __repr__ ( self ) :
            return "%s(%s)" % ( self.a , self.b , self.x )
    a = Main ( )
    b = Main ( )
    x = Main ( )
    x = Main ( )
    x.show ( )
    print ( ( b + x ) / x - ( a - 1 + x ) / x )
