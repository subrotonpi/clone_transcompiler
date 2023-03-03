def _import ( ) : return _LightScanner ( )
import os
import sys
import os
import sys
import os
import sys
import os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] = os.environ [ 'GBK' ] )
class Main ( object ) :
    def __init__ ( self , stdin = None , stdout = None , stderr = None ) :
        self.stdin = stdin
        stdout = sys.stdout
    def readline ( self ) :
        try :
            self.stdout = stdout
        except OSError :
            raise OSError ( 'readline not found' )
        return self.stdout
    def write ( self , s ) :
        try :
            self.stdout.write ( s )
        except OSError :
            raise OSError ( 'write not found' )
    