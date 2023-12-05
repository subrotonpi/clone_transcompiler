def _import ( ) : return sys.stdout.write
import matplotlib
import matplotlib.pyplot as plt
import matplotlib.text as text
import matplotlib.math as math
import matplotlib.util as util
class Main ( object ) :
    def __init__ ( self , problem ) :
        self.problem = 'B'
        self.filename = '%s-large' % self.problem
        def solve ( self ) :
            R , C , D = self.iread ( ) , self.iread ( ) , self.iread ( )
            int_matrix = [ [ ] for i in range ( 3 ) ]
            w = [ [ ] for i in range ( 3 ) ]
            for s in readword ( ) :
                for j in range ( C ) :
                    w [ 0 ] [ i ] [ j ] = s [ j ] - '0'
                    w [ 1 ] [ i ] [ j ] = w [ 0 ] [ i ] [ j ] * i
                    w [ 2 ] [ i ] [ j ] = w [ 0 ] [ i ] [ j ] * j
            for t in range ( 3 ) :
                for i in range ( 1 , R + 1 ) :
                    for j in range ( 1 , C + 1 ) :
                        ww = w [ t ] [ i - 1 ] [ j - 1 ]
                        int_matrix [ t ] [ i ] [ j ] = - int_matrix [ t ] [ i - 1 ] [ j - 1 ] + int_matrix [ t ] [ i - 1 ] [ j ] + int_matrix [ t ] [ i ] [ j - 1 ] + w [ t ] [ i ] [ j ]
                        m [ t ] -= w [ t ] [ i ] [ j ] + w [ t ] [ i + k ] [ j ] - int_matrix [ t ] [ i ] [ j + k ] + int_matrix [ t ] [ i ] [ j + k ] + int_matrix [ t ] [ i ] [ j + k ]
    return Main
