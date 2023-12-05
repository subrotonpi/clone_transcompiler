def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
    data = [ [ i for i in range ( self.m ) ] for i in range ( self.n ) ]
    data.sort ( lambda x , y : x [ 1 ] == y [ 1 ] )
    for i in range ( 1 , self.m ) :
        if data [ i ] [ 1 ] == data [ i - 1 ] [ 1 ] :
            data [ i ] [ 3 ] = data [ i - 1 ] [ 3 ] + 1
    data.sort ( lambda x , y : x [ 0 ] - y [ 0 ] )
    string = [ "%06d%06d\n" % ( x [ 1 ] , x [ 3 ] ) for x in data ]
    sys.stdout.write ( ''.join ( string ) )
