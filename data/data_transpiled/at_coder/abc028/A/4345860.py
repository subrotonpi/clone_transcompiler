def import input_reader
from os.environ import environ
from os.name import environ
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
        self.rfile = environ [ 'input' ]
        self.wfile = environ [ 'output' ]
        self.stdin = InputReader ( rfile )
        self.stdout = open ( 'w' , 'wt' )
        self.solver = Task ( )
        self.solve ( 1 , self.stdin , self.wfile )
        self.stdout.close ( )
class Task ( object ) :
    def solve ( self , test_number , stdin = None , stdout = None ) :
        N = stdin.read ( )
        ans = ''
        if N <= 59 :
            ans = 'Bad'
        elif N <= 89 :
            ans = 'Good'
        elif N <= 99 :
            ans = 'Great'
        else :
            ans = 'Perfect'
        stdout.write ( ans )
class InputReader ( object ) :
    def __init__ ( self , stream = None , environ = environ ) :
        self.stream = stream
        self.environ = environ
        self.environ [ 'input' ] = ''
        self.environ [ 'output' ] = ''
        self.environ [ 'environ' ] = environ
    def readline ( self ) :
        while not self.stream or not self.environ [ 'readline' ] :
            try :
                self.stream.readline ( )
            except EOFError :
                pass
        return self.stream.readline ( )
    def readline ( self ) :
        while not self.stream or not self.environ [ 'readline' ] :
            try :
                self.stream.readline ( )
            except EOFError :
                pass
        return self.stream.readline ( )
