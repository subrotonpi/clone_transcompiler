def _import ( ) : return sys.stdin.read ( )
import random
class Main ( ) :
    def solve ( self , f , out ) :
        n , normal , dynamic = random.randint ( 0 , 10 ) , random.randint ( 0 , 10 ) , random.randint ( 0 , 10 )
        out.write ( n * dynamic if n <= 5 else 5 * dynamic + ( n - 5 ) * normal )
    def write ( self , * ar ) :
        print ( ' '.join ( [ str ( a ) for a in ar ] ) )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
