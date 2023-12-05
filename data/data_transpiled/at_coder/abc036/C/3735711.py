def _ _ main _ _ ( ) : return 31 * x + y
def main ( ) : return 31 * x + y
def __str__ ( self ) : return "(%s, %s)" % ( self.x , self.y )
def __repr__ ( self ) : return "(%s, %s)" % ( self.x , self.y )
def __main__ ( self ) : return
def __main__ ( self ) : return
def __init__ ( self ) :
    rfile = sys.stdin
    wfile = sys.stdout
    self.light_scanner = LightScanner ( rfile )
    self.writer = sys.stdout
    self.solver = C ( )
    self.solver.solve ( 1 , self.solver , self.solver )
    self.writer.close ( )
class C :
    def solve ( self , test_number , self , f ) :
        n = self.ints
        raw = [ ]
        compressed = [ ]
        for i in range ( n ) :
            raw.append ( ( i , self.ints ) )
        raw.sort ( key = lambda x : x [ 1 ] )
        m = - 1
        last = - 1
        for i in range ( n ) :
            if last != raw [ i ] [ 1 ] :
                m += 1
            compressed [ raw [ i ] [ 0 ] ] = m
            last = raw [ i ] [ 1 ]
        return [ i for i in zip ( raw , compressed ) ]
class LightScanner ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.tokenizer = None
    def __init__ ( self , string = None ) :
        if string is None or not string :
            try :
                self.tokenizer = shlex.split ( string )
            except :
                raise TypeError ( "bad string" )
        return string
    def ints ( self ) :
        return int ( string )
class Vec2i ( object ) :
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
        self.string = string
        self.tokenizer = tokenizer
        self.tokenizer = tokenizer
        self.tokenizer = tokenizer
return C
