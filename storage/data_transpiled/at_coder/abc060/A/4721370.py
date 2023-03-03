def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def solve ( self ) :
        try :
            self.solve_a ( )
        finally :
            if self.in_stream is not None :
                self.in_stream.close ( )
            if self.out is not None :
                self.out.flush ( )
                self.out.close ( )
    def solve_a ( self ) :
        str_a = next ( self )
        str_b = next ( self )
        str_c = next ( self )
        self.out.write ( str_a [ - 1 ] == str_b [ 0 ] and str_b [ - 1 ] == str_c [ 0 ] and 'YES' or 'NO' )
        self.out.flush ( )
    def solve_b ( self ) :
        num_n = self.randint ( 1 , 4 )
        self.out.write ( '' )
    def solve_c ( self ) :
        num_n = self.randint ( 1 , 4 )
        self.out.write ( '' )
    def solve_d ( self ) :
        num_n = self.randint ( 1 , 4 )
        self.out.write ( '' )
    def solve_e ( self ) :
        num_n = self.randint ( 1 , 4 )
        self.out.write ( '' )
    def solve_f ( self ) :
        num_n = self.randint ( 1 , 4 )
        self.out.write ( '' )
    def write ( self , data ) :
        if not self.has_next_byte :
            raise StopIteration
        data = [ ]
        ptr = self.get_ptr ( )
        self.get_ptr ( )
        self.get_ptr ( )
        self.get_ptr ( )
        self.get_ptr ( )
        self.get_ptr ( )
        self.get_ptr ( )
    def read ( self ) :
        return self.get_ptr ( )
    def write ( self , data ) :
        return self.get_ptr ( )
