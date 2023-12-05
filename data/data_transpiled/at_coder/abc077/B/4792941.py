def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def solve ( self ) :
        try :
            self.solve_b ( )
        finally :
            if self.in_stream is not None :
                self.in_stream.close ( )
            if self.out is not None :
                self.out.flush ( )
                self.out.close ( )
    def solve_a ( self ) :
        wk1 = [ next ( self ) for _ in range ( self.num_n ) ]
        wk2 = [ next ( self ) for _ in range ( self.num_n ) ]
        if wk1 [ 0 ] == wk2 [ 0 ] :
            self.out.write ( 'YES' )
        else :
            self.out.write ( 'NO' )
    def solve_b ( self ) :
        num_n = self.randint ( 0 , self.num_n )
        wk = int ( math.sqrt ( num_n ) )
        self.out.write ( int ( math.pow ( wk , 2 ) ) )
    def solve_c ( self ) :
        num_n = self.randint ( 0 , self.num_n )
        self.out.write ( '' )
    def solve_d ( self ) :
        num_n = self.randint ( 0 , self.num_n )
        self.out.write ( '' )
    def solve_e ( self ) :
        num_n = self.randint ( 0 , self.num_n )
        self.out.write ( '' )
    def solve_f ( self ) :
        num_n = self.randint ( 0 , self.num_n )
        self.out.write ( '' )
    def write ( self , data ) :
        if not self.has_next_byte :
            raise StopIteration
        data = data.decode ( 'utf-8' )
        self.write ( data )
        self.ptr = 0
        self.buflen = 0
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            ptr = 0
            try :
                self.buflen = self.buflen
            except :