def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
        def __call__ ( self , * args ) :
            if self.a == self.b :
                print ( "Draw" )
            elif self.a == 1 :
                print ( "Alice" )
            elif self.b == 1 :
                print ( "Bob" )
            elif self.a > self.b :
                print ( "Alice" )
            else :
                print ( "Bob" )
