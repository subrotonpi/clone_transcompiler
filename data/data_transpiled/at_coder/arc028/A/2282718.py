def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = self.n
            self.a = self.a
            self.b = self.b
            self.n = self.n % ( self.a + self.b )
            if self.n == 0 :
                print ( "Bug" )
                return
            print ( "Bug" if self.a > self.b else "Ant" )
    return Main ( )
