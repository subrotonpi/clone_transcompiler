def _import ( ) : return _import ( )
import sys
class Main ( object ) :
    def solve ( self , f , out ) :
        desert , jangle = [ next ( self ) for i in range ( 7 ) ]
        def randint ( self , n ) :
            if not self.hasNext ( ) : raise StopIteration
            temp = self.readByte ( )
            if temp == '-' :
                minus = True
                temp = self.readByte ( )
            if temp < '0' or self.isdigit ( ) :
                n = 0
            else :
                n = - n if self.readByte ( ) == '0' else n
            return minus
        def close ( self ) :
            try :
                self.close ( )
            except :
                pass
            return
    def write ( * ar ) :
        print ( "".join ( map ( str , ar ) ) , file = sys.stdout )
    def main ( self ) :
        main = Main ( )
        f = FastScanner ( sys.stdin )
        f = FastScanner ( sys.stdout )
        f.write = sys.stdout
        main.solve ( f , out )
        f.close ( )
        f.close ( )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.buffer = ''
        self.length , self.p = 0 , 0
    def read ( self ) :
        self.stream.seek ( 0 )
        if self.stream.read ( 1 ) == '' : return self.stream.read ( )
        else : p = 0
        try : length = self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.length ) ) ) )
        except : pass
        if self.stream.read ( 1 ) == '' : return self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.length ) ) ) )
    def randint ( self , n ) : return min ( self.stream.read ( n ) , n )
    def read ( self ) : return min ( self.stream.read ( n ) , n )
return
