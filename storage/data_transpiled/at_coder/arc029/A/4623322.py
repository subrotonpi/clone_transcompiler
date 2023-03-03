def _import ( ) : return _import ( )
class Main ( object ) :
    def solve ( self , f ) :
        n = next ( f )
        niku = [ i for i in range ( n ) ]
        min = sum ( niku )
        for bit in range ( ( 1 << n ) ) :
            if not self.hasNext ( ) : raise StopIteration
            minus = False
            temp = self.readByte ( )
            if temp == '-' :
                minus = True
                temp = self.readByte ( )
            if temp < '0' or temp <= '9' :
                n += temp - '0'
            else :
                n += 1
        def close ( ) :
            try :
                f.close ( )
            except :
                pass
        min = min ( min , max ( sum1 , sum2 ) )
    print ( min )
def write ( * ar ) :
    print ( * ar )
def main ( ) :
    main = Main ( )
    f = FastScanner ( sys.stdin )
    f = open ( sys.stdout , "w" )
    main.solve ( f , f )
    f.close ( )
    f.close ( )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.buffer = [ ]
        self.length , p = 0 , 0
    def read ( self ) :
        self.stream.seek ( 0 , 0 )
        self.stream.seek ( 0 , 0 )
        self.stream.seek ( 0 , 0 )
        self.stream.seek ( 0 , 0 )
        self.stream.seek ( 0 , 0 )
        return self.stream.read ( )
    def write ( self , stream ) :
        self.stream.seek ( 0 , 0 )
        self.stream.seek ( 0 , 0 )
        self.stream.seek ( 0 , 0 )
        self.stream.seek ( 0 , 0 )
        self.stream.seek ( 0 , 0 )
        self.stream.seek ( 0 , 0 )
        self.stream.seek ( 0 , 0 )
        self.stream.read ( )
def write ( self , stream ) :
    print ( stream )
