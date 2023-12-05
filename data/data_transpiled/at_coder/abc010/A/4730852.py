def import import sys
import string
import io
import readline
import readline
import readline
import readline
import string
class Main ( object ) :
    def __init__ ( self , args ) :
        try :
            readline.parse_and_bind ( "" )
        except :
            print ( "Exception :" , sys.exc_info ( ) [ 0 ] )
    def __str__ ( self ) :
        return string.split ( self.data , "pp" ) [ 0 ]
