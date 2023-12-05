def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = long ( self.X )
            self.Y = long ( self.Y )
        def __call__ ( self , X , Y ) :
            self.X = X
            self.Y = Y
    i = 0
    while X <= Y :
        i += 1
        X *= 2
    print ( i )
