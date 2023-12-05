def import _np
import numpy
import numpy
import numpy
import scanner
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.n = args [ 0 ]
        self.data = [ 1 , 2 , 3 , 4 , 5 , 6 ]
        numpy.rotate ( self.data , - n // 5 )
        for i in range ( n % 5 ) :
            numpy.swap ( self.data , i , ( i + 1 ) % 5 )
        self.data.sort ( )
        print ( )
