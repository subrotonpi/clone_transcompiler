def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 0
            self.b = 1
            self.c = 2
            self.d = 3
            self.x = abs ( self.b - self.a )
            self.y = abs ( self.c - self.b )
            self.z = abs ( self.c - self.a )
            if self.x <= self.d and self.y <= self.d :
                print ( "Yes" )
            elif self.z <= self.d :
                print ( "Yes" )
            else :
                print ( "No" )
