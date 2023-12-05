def main ( ) :
    import sys
    import os
    import time
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = time.time ( )
            self.Y = time.time ( )
        def __call__ ( self , X , Y ) :
            self.X *= 2
            self.Y *= 2
            self.X /= 2
            self.Y /= 2
        def end ( self ) :
            self.Y /= 2
            self.Y /= 2
            self.end ( )
    return Main ( )
