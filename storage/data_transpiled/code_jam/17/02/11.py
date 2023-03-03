def import _open
import os
import os
import sys
import os
import sys
import os
import sys
import os
import subprocess
import subprocess
import subprocess
def backtrack ( x , smaller = False ) :
    if x == ndigits :
        return True
    limit = 9 if x == ndigits else x
    for i in range ( limit , a [ - 1 ] ) :
        a [ x ] = i
        if backtrack ( x , smaller = True ) or x < ndigits :
            return True
class InputReader ( subprocess.PIPE ) :
    def __init__ ( self , stream = sys.stdout , bufsize = 32768 ) :
        self.stream = stream or sys.stdout
        self.bufsize = None
    def readline ( self ) :
        try :
            import readline
        except ImportError :
            raise EOFError
        return self.stream.readline ( )
    def readline ( self ) :
        return int ( readline ( self ) )
class Main ( object ) :
    def __init__ ( self , stream = sys.stdout , bufsize = - 1 ) :
        self.stream = stream or sys.stdout
    def readline ( self ) :
        try :
            import re
            regex = r'B-(small|large).*[.]in'
            directory = os.path.dirname ( os.path.abspath ( __file__ ) )
            candidates = os.listdir ( directory )
            torun = None
            for candidate in candidates :
                if not torun or os.path.getmtime ( candidate ) > os.path.getmtime ( candidate ) :
                    torun = candidate
            self.stream = open ( torun , 'rb' )
        except OSError :
            raise EOFError
    def readline ( self ) :
        try :
            return self.stream.readline ( )
        except OSError :
            raise EOFError
sys.stdout = open
sys.stderr = open
solver = TaskB ( )
test_count = int ( sys.stdin.read ( ) )
for i in range ( 1 , test_count + 1 ) :
    solver.solve ( i , f , a )
sys.stdout.write ( '\n' )
