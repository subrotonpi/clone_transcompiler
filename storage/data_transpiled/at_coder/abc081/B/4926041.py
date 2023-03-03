def main ( ) :
    import math
    import numpy
    import numpy.random
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin
            self.N = self.s.shape [ 0 ]
            self.bit = 1000000007
            for i in range ( self.N ) :
                x = numpy.random.randint ( 0 , N )
                self.bit = min ( self.bit , numpy.lowestOneBit ( x ) )
            print ( int ( numpy.log ( self.bit ) / numpy.log ( 2 ) ) )
