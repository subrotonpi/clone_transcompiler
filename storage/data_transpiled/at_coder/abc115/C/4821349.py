def main ( ) :
    import sys
    import random
    import numpy
    class Main ( object ) :
        def __init__ ( self ) :
            self.N , self.K = sys.argv [ 1 ] , sys.argv [ 2 ]
        def __call__ ( self , * args ) :
            with open ( self.N , 'r' ) as f :
                self.N , self.K = f.read ( ) , f.read ( )
    trees = [ ]
    for i in range ( N ) :
        trees.append ( numpy.random.random ( ) )
    sys.stdout.write ( '\n'.join ( trees ) )
    current = trees [ K - 1 ] - trees [ 0 ]
    height = 0
    for i in range ( 1 , N - K + 1 ) :
        height = trees [ i + K - 1 ] - trees [ i ]
        if current > height :
            current = height
    print ( current )
