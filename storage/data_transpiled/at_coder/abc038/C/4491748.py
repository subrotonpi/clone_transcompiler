def _import ( ) : return _fasta_ord ( )
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
    def read ( self ) :
        a = [ ]
        for i in range ( self.N ) :
            a.append ( self.read ( 1 ) )
        sum = self.N
        count = 1
        for i in range ( 1 , self.N + 1 ) :
            if i == self.N or a [ i ] <= a [ i - 1 ] :
                sum += count * long ( count - 1 ) / 2
                count = 1
            else :
                count += 1
        print ( sum )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.buffer = sys.stdin.read ( 1 )
        def __getattr__ ( self , attr ) :
            return getattr ( self.buffer , attr )
        def __getitem__ ( self , key ) :
            if key in self.buffer :
                return self.buffer [ key ]
            else :
                self.buffer [ key ] = self.buffer [ key ]
        def __getattr__ ( self , attr ) :
            return getattr ( self.buffer , attr )
        def __getitem__ ( self , key ) :
            return self.buffer [ key ]
        def __setattr__ ( self , attr , value ) :
            return getattr ( self.buffer , attr )
        def __getattr__ ( self , attr ) :
            return getattr ( self.buffer , attr )
        def __repr__ ( self ) :
            return "<%s>" % repr ( self.buffer )
