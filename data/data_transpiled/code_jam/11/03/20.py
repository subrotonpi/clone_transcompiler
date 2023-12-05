def import _sys
class c ( object ) :
    def __init__ ( self ) :
        self.n , self.arr = _sys.argv [ 1 ] , _sys.argv [ 2 ]
    def main ( self ) :
        with open ( self.name , 'r' ) as infile :
            T = infile.read ( )
    for t in range ( 1 , T + 1 ) :
        print ( "Case #%d: " % t , end = ' ' )
        self.n = self.n
        self.arr = [ ]
        self.sum = 0
        realsum = 0
        min = int ( 1e9 )
        for i in range ( self.n ) :
            self.arr.append ( infile.read ( ) )
            self.sum ^= self.arr [ i ]
            realsum += self.arr [ i ]
            min = min ( min , self.arr [ i ] )
        if self.sum != 0 :
            print ( "NO" )
            continue
        realsum -= min
        print ( realsum )
