def import _pylab
import pylab
import matplotlib.pyplot as plt
import matplotlib.cm
import matplotlib.pyplot as plt
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        plt.figure ( )
        self.color = [ 0 , 0 , 0 , 0 ]
    def mark ( self , x , y ) :
        self.color [ x + 250 ] [ y + 250 ] += 1
    def main ( self ) :
        plt.subplot ( 500 , 200 , 1 )
        x1 , y1 , r = plt.plot ( [ x , y ] , [ x + 250 , y + 250 ] )
        x2 , y2 , x3 , y3 = plt.plot ( [ x , y ] , [ x + 250 , y + 250 ] )
        shape = ( 500 , 500 )
        color = np.zeros ( shape )
        for x in range ( - 200 , 200 ) :
            for y in range ( - 200 , 200 ) :
                if ( x1 - x ) ** 2 + ( y1 - y ) ** 2 <= r ** 2 :
                    self.mark ( x , y )
                if x2 <= x <= x3 and y2 <= y <= y3 :
                    self.mark ( x , y )
                    self.mark ( x , y )
    is_red = is_blue = False
    for x in range ( - 200 , 200 ) :
        for y in range ( - 200 , 200 ) :
            is_red |= color [ x + 250 ] [ y + 250 ] == 1
            is_blue |= color [ x + 250 ] [ y + 250 ] == 2
    if is_red :
        pylab.imshow ( color , cmap = 'gray' )
    else :
        pylab.imshow ( color , cmap = 'gray' )
    if is_blue :
        pylab.show ( )
