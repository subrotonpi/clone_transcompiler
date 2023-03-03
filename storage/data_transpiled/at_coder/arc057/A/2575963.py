def _ ( ) : return next ( iter ( [ random.randint ( 0 , 100 ) for i in range ( 10 ) ] ) )
def __next_long_list ( n ) : return [ random.randint ( 0 , 100 ) for i in range ( n ) ]
class Main ( object ) :
    def __init__ ( self , input_stream , output_file ) :
        self.input_stream = input_stream
        self.output_file = output_file
        self.input_stream = input_stream
        self.output_file = output_file
        self.solver = TaskX ( )
        self.solve ( 1 , input_stream , output_file )
        self.output_file.close ( )
INF = 1 << 30
MOD = 1000000007
mh4 = [ 0 , - 1 , 1 , 0 ]
mw4 = [ - 1 , 0 , 0 , 1 ]
mh8 = [ - 1 , - 1 , - 1 , 0 , 0 , 1 , 1 , 1 ]
mw8 = [ - 1 , 0 , 1 , - 1 , 1 , - 1 , 0 , 1 ]
a , k = 0 , 0
class TaskX ( object ) :
    def solve ( self , test_number , input_stream , output_file ) :
        a = input_stream.__next__ ( )
        k = input_stream.__next__ ( )
        tar = 2 * long ( pow ( 10 , 12 ) )
        if k == 0 :
            output_file.write ( tar - a )
        else :
            for m in range ( 100 ) :
                num = ( pow ( k + 1 , m ) - 1 ) / k + a * pow ( ( k + 1 ) , m )
                if num >= tar :
                    output_file.write ( m )
                    return
    def func ( t ) :
        return 1 + k * t + t
class InputReader ( object ) :
    def __init__ ( self , input_stream , output_file ) :
        self.input_stream = input_stream
        self.output_file = output_file
        self.tok = input_stream.__next__ ( )
    def __next__ ( self ) : return int ( next ( iter ( [ random.randint ( 0 , 100 ) for i in range ( n ) ] ) ) )
    def __next__ ( self ) : return int ( next ( iter ( [ random.randint ( 0 , 100 ) for i in range ( n ) ] ) ) )
return Main ( )
