def import java.io
from cStringIO import StringIO , InputStreamReader , StringIOWrapper , StringIOWrapper , InputIOWrapper , InputIOWrapper , InputIOWrapper , InputIOWrapper , InputIOWrapper , InputIOWrapper , InputIOWrapper , )
class Main ( object ) :
    input_file = sys.stdin
    output_file = sys.stdout
    in_stream = FastScanner ( input_file )
    out_stream = StringIO ( )
    solver = TaskIOWrapper ( )
    solver.solve ( 1 , in_stream , out_stream )
    out_stream.seek ( 0 )
    class TaskC ( object ) :
        def solve ( self , test_number , stream , out_stream ) :
            n = stream.tell ( )
            a = [ ]
            p = [ ]
            for i in range ( n ) :
                a.append ( stream.read ( ) )
                p.append ( a [ i ] )
            bo = { }
            cn = 0
            for cp in p :
                bo [ cp ] = cn
                cn += 1
            for ca in a :
                out_stream.write ( bo [ ca ] )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.buffer = StringIO ( )
            self.bufptr = 0
            self.buflength = 0
        def read ( self ) :
            if self.bufptr >= len ( self.buffer ) :
                if self.bufptr == len ( self.buffer ) :
                    raise InputIOWrapper ( )
                self.bufptr = 0
                try :
                    self.buflength = len ( self.buffer )
                except InputIOWrapper :
                    raise InputIOWrapper ( )
                if self.buflength <= 0 :
                    return - 1
                return self.buffer [ self.bufptr ]
        def isSpaceChar ( self ) :
            return self.isSpaceChar ( )
        def read ( self ) :
            n = 0
            b = self.readByte ( )
            while self.isSpaceChar ( ) :
                b = self.readByte ( )
                minus = ( b == '-' )
                if minus :
                    b = self.readByte ( )
            return b
    return Main ( )
