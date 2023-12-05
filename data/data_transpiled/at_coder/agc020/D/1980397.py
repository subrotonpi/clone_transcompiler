def pyre_is_error ( ) : return - 1
import pyre_is_error
import pyre_is_error
import pyre_is_error
import pyre_is_error
import pyre_is_error
import pyre_is_error
import pyre_is_error
import os
import os
import os
import r
class ConsoleIO ( io.Reader ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream.flush ( )
    def write_line ( self , s ) :
        self.stream.write ( s )
    def write_int ( self , n ) :
        self.stream.write ( self.stream.read ( n ) )
    def write_int ( self , k , sep ) :
        self.stream.write ( self.stream.read ( ) )
    def read ( self , buf ) :
        try : return self.stream.read ( )
        except Exception : return ''
    def read_long_array ( self ) :
        n = self.stream.read ( ).strip ( '\\' ).split ( ' ' )
        for i in range ( len ( self.stream.read ( n ) ) ) :
            self.stream.write ( self.stream.read ( n ) )
    def write ( self , k , sep ) :
        self.stream.write ( self.stream.read ( ) )
    def write ( self , buf ) :
        self.stream.write ( self.stream.read ( ) )
    def write ( self , k , sep ) :
        self.stream.write ( self.stream.read ( ) )
    def read ( self , buf ) :
        try : return self.stream.read ( )
    def write ( self , k , sep ) :
        self.stream.write ( self.stream.read ( ) )
    def write ( self , buf ) :
        self.stream.write ( self.stream.read ( ) )
    def write ( self , k , sep ) :
        self.stream.write ( self.stream.read ( ) )
    def read ( self , buf ) :
        self.stream.write ( self.stream.read ( ) )
    def write ( self , buf ) :
        self.stream.write ( self