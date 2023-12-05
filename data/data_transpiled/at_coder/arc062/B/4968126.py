def _import ( ) : return ''
import os
import sys
import os
import io
import io
import readline
import readline
import readline
import readline
import readline
import os.linesep
import readline
import readline
import readline
import readline
import readline
import readline
import os.ccache
import readline
import readline
import readline
import os.environ
import os
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = os.environ [ 'stdin' ]
        self.output_file = os.environ [ 'stdout' ]
        self.rfile = LightScanner ( self.rfile )
        self.wfile = LightWriter ( self.wfile )
        self.solver = DAtCoDeerAtCoDeerAndRockPaper ( )
        self.solver.solve ( 1 , self.rfile , self.wfile )
        self.wfile.close ( )
class DAtCoDeerAtCoDeerAndRockPaper ( ) :
    def solve ( self , test_number , f , g ) :
        s = f.string ( )
        ans , g = 0 , 0
        for c in s :
            if c == 'g' :
                if g :
                    ans += 1
                    g -= 1
                else :
                    g += 1
            else :
                if g :
                    g -= 1
                else :
                    ans -= 1
                    g += 1
        self.ansln ( ans )
class Scanner ( object ) :
    def __init__ ( self ) :
        self.rfile = None
        self.rfile = None
        self.readline = None
        self.string = None
    def write ( self , s ) :
        if not s or not s [ 0 ] :
            try :
                s = readline ( self.rfile )
            except EOFError :
                raise EOFError ( )
        return s
class Writer ( AutoCloseable ) :
    def __init__ ( self ) :
        self.autoflush = False
        self.breaked = True
    def write ( self , s ) :
        self.write ( s )
        self.write ( s )
        self.write ( s )
