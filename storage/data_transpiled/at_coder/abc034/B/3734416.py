def import import _io , StringIO , StringIO , StringIO , ConfigParser , ConfigParser
from io import StringIO
from ConfigParser import SafeConfigParser
from io import StringIO
from ConfigParser import SafeConfigParser
from io import StringIO
from ConfigParser import SafeConfigParser
from io import StringIO
from ConfigParser import SafeConfigParser
from io import StringIO
from ConfigParser import SafeConfigParser
from io import StringIO
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.readfp = StringIO ( StringIO ( stream ) )
        self.stream = StringIO ( stream )
        self.readfp = SafeConfigParser ( )
        self.readfp = SafeConfigParser ( StringIO ( stream ) )
        self.readfp = SafeConfigParser ( )
        self.sections = { }
    def readline ( self ) :
        if self.stream.readline :
            self.stream.seek ( 0 )
            self.readfp.write ( self.stream.read ( ) )
        else :
            self.stream.seek ( 0 )
            self.sections [ 0 ] = self.sections [ 0 ].strip ( )
        return self.sections [ 0 ].replace ( '\n' , ' ' )
    def write ( self , test_number , s ) :
        n = s.split ( '\n' )
        if n % 2 == 0 :
            self.sections [ 0 ].write ( self.sections [ 0 ].replace ( '\n' , ' ' ) )
        else :
            self.sections [ 0 ].write ( self.sections [ 0 ].replace ( '\n' , ' ' ) )
