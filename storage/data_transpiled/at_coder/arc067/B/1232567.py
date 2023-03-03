def _import ( ) : return int ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return float ( next ( ) )
class Main ( object ) :
    def __init__ ( self ) :
        self.N = randint ( 0 , N )
        self.A = randint ( 0 , N )
        self.B = randint ( 0 , N )
        self.X = [ randint ( 0 , N ) for i in range ( self.N ) ]
        self.memo = [ ]
        self.memo.append ( 0 )
        for i in range ( 1 , N ) :
            if ( self.X [ i ] - self.X [ i - 1 ] ) * A < B :
                self.memo [ i ] = min ( self.memo [ i ] , ( self.X [ i ] - self.X [ i - 1 ] ) * A + self.memo [ i - 1 ] )
            else :
                self.memo [ i ] = min ( self.memo [ i ] , B + self.memo [ i - 1 ] )
        self.out.write ( self.memo [ self.N - 1 ] )
    def main ( self ) :
        self.out.flush ( )
        with open ( "/dev/null" , "w" ) as f :
            f.write ( self.out )
    def __init__ ( self ) :
        self.out.flush ( )
        super ( Main , self ).__init__ ( )
    def __init__ ( self ) :
        self.out.flush ( )
    def __init__ ( self ) :
        self.out.flush ( )
        super ( Main , self ).__init__ ( )
    def __init__ ( self ) :
        self.out.flush ( )
    def __iter__ ( self ) :
        self.next = iter ( self.data ).__next__
    def __next__ ( self ) :
        while self.hasNext ( ) :
            self.next = iter ( self.data ).__next__
        return __next__
