def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def __init__ ( self ) :
        self.arr = [ ]
        self.arr.append ( '1' )
        self.arr.append ( '2' )
        self.arr.append ( '3' )
        self.arr.append ( '4' )
        self.arr.append ( '5' )
        self.arr.append ( '6' )
        r = ''
        c = self.N % 30
        for i in range ( c ) :
            r = self.arr [ ( i % 5 ) ]
            self.arr [ ( i % 5 ) ] = self.arr [ ( i % 5 ) + 1 ]
            self.arr [ ( i % 5 ) + 1 ] = r
        print ( self.arr [ 0 ] , self.arr [ 1 ] , self.arr [ 2 ] , self.arr [ 3 ] , self.arr [ 4 ] , self.arr [ 5 ] )
