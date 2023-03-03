def import input_reader
from os.environ import environ
from os.environ import environ
from os.environ import environ
from os.environ import copy
from os.environ import environ
from os.environ import copy
from os.environ import copy
from os.environ import environ
from os.environ import copy
from os.environ import copy
from os.environ import copy
from os.environ import environ
from os.chdir
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = environ [ 'input_file' ]
        self.wfile = environ [ 'output_file' ]
        self.stdin = InputReader ( rfile )
        self.stdout = open ( 'w' , 'wt' )
        self.solver = Task ( )
        self.solve ( 1 , self.stdin , self.wfile )
        self.stdout.close ( )
class Task ( object ) :
    def solve ( self , test_number , stdin = None , stdout = None ) :
        X = stdin.read ( )
        ans = ord ( X [ 1 ] ) + ord ( X [ 0 ] )
        stdout.write ( ans )
class InputReader ( object ) :
    def __init__ ( self , stream = None , environ = environ ) :
        self.stream = stream
        self.environ = environ
        self.environ = copy ( )
        self.environ [ 'input_file' ] = StringIO ( stdin.read ( ) )
        self.environ [ 'output_file' ] = StringIO ( stdin.read ( ) )
        self.stdin.close ( )
        self.stdout.close ( )
    def readline ( self ) :
        while not self.stream.readline ( ) or not self.stream.readline ( ) :
            try :
                self.stdin.readline ( )
            except EOFError :
                pass
        return self.stream.readline ( )
    def readline ( self ) :
        while not self.stream.readline ( ) :
            try :
                self.stdin.readline ( )
            except EOFError :
                pass
        return self.stream.readline ( )
