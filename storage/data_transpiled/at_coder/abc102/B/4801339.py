def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.max , self.min = 1 , 1000000000
        def __call__ ( self ) :
            self.max , self.min = max ( self.max ) , min ( self.min )
    return Main ( )
