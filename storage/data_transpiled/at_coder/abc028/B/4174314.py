def _import ( ) : return [ int ( x ) for x in range ( 0 , 10 ) ]
class Main ( object ) :
    def __init__ ( self , * args ) :
        super ( Main , self ).__init__ ( * args )
    def read ( self ) :
        sc = FastScanner ( )
        S = sc.next ( )
        count = [ 0 ] * 6
        for c in S :
            count [ c ] = - 1
        for c in range ( 5 ) :
            print ( count [ c ] , end = ' ' )
        print ( count [ 5 ] )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self ) :
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.read ( self.stream.tell ( ) )
    def has_next_byte ( self ) :
        if self.stream.tell ( ) < self.stream.tell ( ) :
            return True
        else :
            self.stream.seek ( 0 )
            try :
                self.stream.read ( self.stream.tell ( ) )
            except :
                pass
            if self.stream.tell ( ) <= self.stream.tell ( ) :
                return False
        return True
    def has_next_byte ( self ) :
        if self.stream.tell ( ) < self.stream.tell ( ) :
            return True
        else :
            self.stream.seek ( 0 )
    def is_printable_char ( self ) :
        while self.stream.tell ( ) < self.stream.tell ( ) :
            self.stream.seek ( 0 )
    def __next__ ( self ) :
        return True
    def read ( self ) :
        if self.stream.tell ( ) < self.stream.tell ( ) :
            return False
        else :
            return True
    def __next__ ( self ) :
        return __next__
