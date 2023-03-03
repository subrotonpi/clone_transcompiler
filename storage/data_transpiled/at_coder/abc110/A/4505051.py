def main ( ) :
    import sys
    import numpy
    class Main ( object ) :
        def __init__ ( self ) :
            self.ans , N = numpy.random.randint ( 3 , size = ( 3 , 3 ) )
        def __call__ ( self ) :
            sc = numpy.random.choice ( ( 1 , 2 , 3 , 4 ) )
            a = numpy.random.randint ( 3 , size = ( 3 , 3 ) )
            a = numpy.sort ( a )
            print ( a [ 0 ] + ( a [ 2 ] * 10 + a [ 1 ] ) )
    return Main ( )
