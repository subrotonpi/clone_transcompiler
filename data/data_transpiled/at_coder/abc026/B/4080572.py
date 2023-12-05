def import numpy
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
    def __call__ ( self , * args ) :
        arr = numpy.array ( args )
        arr = [ ]
        for i in range ( len ( arr ) ) :
            arr.append ( arr [ i ] )
        arr.sort ( )
        total = 0
        for i in range ( n ) :
            if i % 2 != n % 2 :
                total += arr [ i ] ** 2
            else :
                total -= arr [ i ] ** 2
        print ( total * numpy.pi )
