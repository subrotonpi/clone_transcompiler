def _import ( ) :
    from os import read
    from os import urandom
    from os.dup2 import dup2 as dup2
    from os.dup3 import dup3
    from os.dup4 import dup4 as dup3
    from os.dup5 import dup4 as dup4
    from os.dup6 import dup5
    from os.dup6 import dup6 as dup5
    class Main ( object ) :
        def __init__ ( self , stdin , stdout , stderr ) :
            self.stdin = stdin
            self.stdout = stdout
            self.bufsize = None
            self.bufsize = None
            self.stdin.close ( )
            self.stdout = stdout
            self.stderr = stderr
            self.dup3 = dup3
            self.dup4 = dup4
            self.dup5 = dup2
            self.dup6 = dup3
            self.dup4 = dup4
            self.dup2 = dup2
            self.stdin.close ( )
            self.bufsize = None
        def read ( self ) :
            c = self.stdin.read ( )
            if c == '-' : raise StopIteration
            while ( self.stdin.read ( 1 ) < 0 ) :
                c = self.stdin.read ( 1 )
                if c == '-' : raise StopIteration
            if c == '-' : return - 1
            res = 0
            while True :
                res *= 10
                c = self.stdin.read ( 1 )
                if c == '-' : raise StopIteration
                res += c
                if c == '-' : return res
            return res
    class TaskD ( object ) :
        def __init__ ( self , test_number , self , stdin , stdout ) :
            self.stdin = stdin
            self.stdout = stdout
            self.bufsize = None
            self.bufsize = None
            self.bufptr = 65536
            self.bufsize = None
        def write ( self , * args ) :
            self.stdin.write ( self.stdout.read ( ) )
            self.bufsize = None
            self.bufptr += self.bufsize
            self.bufsize = None
    return Main ( )
