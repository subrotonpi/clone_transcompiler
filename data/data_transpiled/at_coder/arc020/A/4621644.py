def _import ( ) : return
import sys
import random
class Main ( object ) :
    def solve ( self , f , out ) :
        a , b = random.randint ( 0 , 255 ) , random.randint ( 0 , 255 )
        out.write ( 'Draw' if abs ( a - 0 ) == abs ( b - 0 ) else 'Ant' if abs ( a - 0 ) < abs ( b - 0 ) else 'Bug' )
    def write ( self , * ar ) :
        print ( ' '.join ( map ( repr , ar ) ) , file = out )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
def main ( ) :
    main = Main ( )
    f = open ( sys.stdin , 'w' )
    f.write ( ' '.join ( map ( repr , ar ) ) )
    main.solve ( f , out )
    f.close ( )
    f.close ( )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def has_next_byte ( self ) :
        if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
            return True
        else :
            p = 0
            try :
                length = self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.read ( self.stream.read ( self.stream.read ( self.read ( stream.read ( stream.read ( self ) ) ) ) ) ) ) ) ) ) ) ) )
            except :
                pass
            if self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.read ( stream.read ( stream.read ( stream.read ( stream.read (