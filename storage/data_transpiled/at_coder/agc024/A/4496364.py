def _import ( ) : return _import ( )
import os
import sys
import io
import os
import io
import os
import sys
import os
import sys
import os.linesep
import sys
import io
import io
import os
import os
import sys
import os
import os
import sys
import os
import sys
import os
import os
import sys
import os
import os
import sys
import subprocess
import subprocess
import subprocess
import subprocess
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.output_file = sys.stdout
        self.stdin = LightScanner ( self.rfile )
        self.stdout = LightWriter ( self.output_file )
        self.solver = AFairness ( )
        self.solve ( 1 , self.stdin , self.stdout )
        self.stdout.close ( )
    def solve ( self , test_number , self , out ) :
        a , b , c = self.longs ( )
        k = self.test_number
        if k % 2 == 1 :
            out.ansln ( b - a )
        else :
            out.ansln ( a - b )
    class Scanner ( object ) :
        def __init__ ( self , stream = None ) :
            self.stream = stream
            self.stream = self.stream
        def string ( self ) :
            if not self.stream or not self.stream :
                try :
                    self.stream = stream.readline ( )
                except IOError :
                    raise OSError ( )
            return self.stream.readline ( )
        def longs ( self ) :
            return long ( self.string )
    class Writer ( AutoCloseable ) :
        def __init__ ( self ) :
            self.stream = stream
            self.autoflush = False
            self.breaked = True
        def write ( self , s ) :
            try :
                self.write ( s )
                self.fast_flush = False
            except IOError :
                raise OSError ( )
            return self.stream.readline ( )
        def write ( self , s ) :
            try :
                self.write ( s )
                self.fast_flush = True
            except IOError :
                pass
    return Writer
