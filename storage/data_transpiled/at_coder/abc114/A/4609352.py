def import import sys , string , traceback ;
from os import urandom
from io import BytesIO
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = BytesIO ( )
    def open ( self , mode = 'r' ) :
        a = sys.stdin.read ( 1 )
        if mode in ( 7 , 5 , 3 ) :
            print ( "YES" )
        else :
            print ( "NO" )
    def close ( self ) :
        sys.stdout.write ( "\n" )
        sys.stdout.flush ( )
