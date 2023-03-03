def main ( ) :
    import sys
    import numpy as np
    import numpy.random
    class Main ( object ) :
        def __init__ ( self ) :
            self.ans , self.s = '' , ''
        def __call__ ( self , * args ) :
            sc = np.random.choice ( args )
            n = sc.shape [ 0 ]
            a = np.random.choice ( sc.ans , n )
            a = np.sort ( a )
            print ( np.linalg.norm ( a - a ) )
    return Main ( )
