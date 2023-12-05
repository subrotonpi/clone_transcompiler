def main ( ) :
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            self.N , self.M = int ( self.N ) , int ( self.M )
        def __getitem__ ( self , key ) :
            return self.N + self.M / 2
    return Main ( )
