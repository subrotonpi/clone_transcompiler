def import import sys , string , traceback
from io import StringIO
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.randint ( 0 , 100 )
        b = sc.randint ( 0 , 100 )
        c = sc.randint ( 0 , 100 )
        d = sc.randint ( 0 , 100 )
        print ( min ( a , b ) , min ( c , d ) )
    def __init__ ( self ) :
        self.raw_input = string
    def readline ( ) :
        try :
            return sys.stdin.readline ( )
        except :
            pass
    def execute ( self ) :
        if self.index == len ( self.input ) :
            try :
                buffer = self.input ( ).split ( )
            except :
                pass
        return int ( buffer [ self.index ] )
