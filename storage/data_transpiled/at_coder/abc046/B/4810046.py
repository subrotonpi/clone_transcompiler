def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            self.args = args
            self.N = int ( self.N )
            self.K = int ( self.K )
            self.print ( self.color ( N , K ) )
        def color ( self , N , K ) :
            color = K
            for i in range ( 1 , N ) :
                color *= ( K - 1 )
            return color
    return Main ( )
