def import _main
class Point ( object ) :
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
class Line ( object ) :
    def __init__ ( self , start , end ) :
        self.start = start
        self.end = end
class Main ( object ) :
    def __init__ ( self ) :
        with open ( "../examples/" , "r" ) as f :
            self.ax = f.readline ( ).strip ( )
            self.ay = f.readline ( ).strip ( )
            self.bx = f.readline ( ).strip ( )
            self.by = f.readline ( ).strip ( )
            self.chopline = _main ( ( ax , ay ) , ( bx , by ) )
    N = len ( sys.argv )
    points = [ ]
    for i in range ( N ) :
        x = sys.argv [ i ]
        y = sys.argv [ i + 1 ]
        points.append ( ( x , y ) )
    del sys.argv [ i ]
    lines = [ Line ( points [ i ] , points [ ( i + 1 ) % N ] ) for i in range ( N ) ]
    cross_count = 0
    for line in lines :
        check_a = ( line.start [ 0 ] - line.end [ 0 ] ) * ( chopline.start [ 1 ] - line.start [ 1 ] ) + ( line.start [ 1 ] - line.end [ 1 ] ) * ( line.start [ 0 ] - chopline.start [ 0 ] )
        check_b = ( line.start [ 0 ] - line.end [ 0 ] ) * ( chopline.end [ 1 ] - line.end [ 1 ] ) + ( line.start [ 1 ] - chopline.end [ 1 ] ) * ( line.start [ 0 ] - chopline.start [ 0 ] )
        check_c = ( chopline.start [ 0 ] - chopline.end [ 0 ] ) * ( chopline.start [ 1 ] - chopline.start [ 1 ] )
        check_d = ( chopline.start [ 0 ] - chopline.end [ 0 ] ) * ( chopline.start [ 1 ] - chopline.start [ 1 ] )