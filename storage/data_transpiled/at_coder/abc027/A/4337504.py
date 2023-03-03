def import input_reader
from os.environ import environ
from os.environ import default_environ
from os.environ import default_environ
from os.environ import environ
from os.environ import default_environ
from os.environ import environ
from os.environ import default_environ
from os.environ import environ
from os.environ import default_environ
from os.environ import copy
from os.environ import copy
from os.environ import copy
from os.environ import copy
from os.environ import copy
from os.environ import copy
from os.environ import copy
from os.chdir
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = environ
        self.stdout = copy
        self.stdin = InputReader ( default_environ ( ) )
        self.stdout = copy
        self.stderr = copy
        self.solver = default_environ ( )
        self.solve ( 1 , self.stdin , self.stdout )
        self.stdout.close ( )
    def solve ( self , test_number , input , output ) :
        l1 , l2 , l3 = input
        ans = 0
        if l1 == l2 : ans = l3
        if l2 == l3 : ans = l1
        if l3 == l1 : ans = l2
        return ans
