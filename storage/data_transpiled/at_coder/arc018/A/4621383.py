def _import ( ) : return sys.stdin.read ( )
import random
import math
class Main ( object ) :
    def solve ( self , f , out ) :
        H , BMI = random.uniform ( 0 , math.log ( 'H' , 2 ) )
        out.write ( '%.3f' % ( BMI * H * H / 10000 ) )
    def write ( self , * ar ) :
        print ( ''.join ( [ chr ( i ) for i in ar ] ) )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
def main ( ) :
    main = Main ( )
    f = open ( '/dev/null' , 'w' )
    main.solve ( f , out )
    f.close ( )
    out.close ( )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def has_next_byte ( self ) :
        if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
            return True
        else :
            p = 0
            try :
                length = len ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( stream.read ( self.stream.read ( stream.read ( stream.read ( stream.read ( stream.read ( stream.read ( stream.read ( stream.read ( stream.read ( stream.read ( stream.read ( stream.read ( stream.read ( stream.read ( stream.stream.read ( stream.stream.read ( stream.stream.read ( stream.stream.stream.read ( stream.stream.stream.stream.read ( stream.stream.stream.stream.stream.stream.count ( ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )
