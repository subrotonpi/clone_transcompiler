def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
            self.c = 3
            self.k = 4
        def __repr__ ( self ) :
            return "%s(%s)" % ( self.a , self.b )
    a = Main ( )
    b = Main ( )
    c = Main ( )
    k = Main ( )
    k.__repr__ ( )
    print ( a - b if k % 2l == 0 else b - a )
