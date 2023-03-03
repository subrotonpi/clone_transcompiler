def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.price = [ int ( i ) for i in sys.stdin.readline ( ).strip ( ).split ( ' ' ) ]
        self.price = [ i for i in self.price if i > 0 ]
    def main ( self ) :
        self.n = int ( self.n )
        self.price = [ i for i in self.price if i > 0 ]
        self.price = [ i for i in self.price if i > 0 ]
        self.price = [ i for i in self.price if i > 0 ]
        for k in self.price [ : - 1 ] :
            if k > self.price [ k - 1 ] :
                self.price [ k - 1 ] = self.price [ k - 1 ]
                break
