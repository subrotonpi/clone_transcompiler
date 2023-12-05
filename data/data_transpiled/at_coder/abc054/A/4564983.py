def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 1
            if self.a == 1 :
                self.a = 20
            if self.b == 1 :
                self.b = 20
            if self.a == self.b :
                print ( "Draw" )
            elif self.a < self.b :
                print ( "Bob" )
            else :
                print ( "Alice" )
