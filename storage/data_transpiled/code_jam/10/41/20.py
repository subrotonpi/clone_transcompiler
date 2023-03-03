def _ _ init _ _ ( ) : return read_wrapper ( )
class CodeJammer ( io.BufferedReader ) :
    def __init__ ( self , reader ) :
        self.reader = reader
        self.case_num = 1
    def __init__ ( self ) :
        pass
    def process_all ( self ) :
        self.reader.read ( )
        try :
            self.reader.read ( )
        except ( ValueError , TypeError ) :
            raise ( "ReadWrapper expected a int and read " + line )
    def read_array ( self ) :
        t = reader.read ( )
        for i in t :
            yield i
    def output ( self , s ) :
        if not s :
            print ( "Case #%d:" % ( self.case_num ) )
    def read_string_array ( self ) :
        line = reader.read ( )
        try :
            t = reader.read ( )
            for i in t :
                yield i
        except ( ValueError , TypeError ) :
            raise ( "ReadWrapper expected a long array and read " + line )
    def read_string_array ( self ) :
        line = reader.read ( )
        try :
            yield i
        except ( ValueError , TypeError ) :
            raise ( "ReadWrapper expected a string and read " + line )
    def output ( self , n ) :
        yield int ( n )
    def output ( self , n ) :
        yield str ( n )
    def output ( self , d , digits = 0 ) :
        s = "0."
        for i in t :
            s += "0"
        f = reader.read ( )
        output ( f.format ( d ) )
    def set_delims ( self , self , return_them = False ) :
        self.delims = return_them
    def get_token ( self ) :
        s = ""
        for i in t :
            if not s :
                yield i
            else :
                yield i
    def run ( self , args ) :
        if len ( args ) == 0 :
            buff = sys.stdin
        else :
            filename