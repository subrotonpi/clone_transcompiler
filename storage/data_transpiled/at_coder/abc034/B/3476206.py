def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x = 1
        def __call__ ( self , * args ) :
            if self.x % 2 == 1 :
                self.x += 1
            else :
                self.x -= 1
            print ( self.x )
    return Main ( )
