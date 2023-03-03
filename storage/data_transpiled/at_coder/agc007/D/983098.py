def import import sys , stdin , stdout , stderr , stdin , readline , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , ) :
    if sys.stdin is not None and readwrite :
        try :
            fh = stdin.readline ( )
        except AttributeError :
            raise EOFError ( 'No input file found' )
        if readwrite and readwrite :
            try :
                fh.seek ( - 1 , os.SEEK_END )
            except IOError :
                raise EOFError ( 'No input file found' )
        else :
            fh.seek ( 0 , os.SEEK_SET )
    else :
        fh = stdin
    stdout = sys.stdout
    stdin = stdin.read ( )
    stdout = stdout.write
    solver = TaskD ( )
    solver.solve ( 1 , stdin , stdout )
    stdout.close ( )
class TaskD :
    def __init__ ( self , test_number , stdin = None , stdout = None , stderr = None ) :
        self.n , self.e , self.t = test_number
        self.x = [ ]
        for i in range ( 1 , n + 1 ) :
            self.x.append ( stdin.read ( ) )
        state = [ [ ] for i in range ( 3 ) ]
        ptr = 0
        for i in range ( 1 , n + 1 ) :
            while 2 * ( self.x [ i ] - self.x [ ptr + 1 ] ) > t :
                ptr += 1
            state [ 1 ].append ( ptr )
        min = float ( 'inf' ) / 2
        for i in range ( 1 , n + 1 ) :
            for j in range ( int ( state [ 1 ] [ i - 1 ] ) , int ( state [ 1 ] [ i ] ) ) :
                min = min ( min , state [ 0 ] [ j ] - 2 * self.x [ j + 1 ] )
            state [ 0 ].append ( min + 2 * self.x [ i ] , state [ 0 ] [ int ( state [ 1 ] [ i ] ) ] + t )
        ans = state [ 0 ] + e
        stdout