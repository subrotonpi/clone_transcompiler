def _import ( ) :
    from os import environ , _open
    from os import environ , _open
    from os import urandom
    from random import random
    from os import urandom
    from os.environ import _open
    from os import urandom
    from random import random
    from os import urandom
    from random import random
    from os.environ import _open
    from os import urandom
    from os.urandom import urandom
    from os import urandom
    from random import random
    from os import urandom
    from random import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
            self.stdin = InputIO ( self.stdin )
            self.stdout = open ( self.stdout , 'w' )
            self.solver = TaskD ( )
            self.solve ( 1 , self.stdin , self.stdout )
            self.stdout.close ( )
        def solve ( self , test_number , self , * args , ** kwargs ) :
            k = random ( )
            self.set = [ None ]
            for i in range ( 14 ) :
                s = [ ]
                for j in range ( i ) :
                    s.append ( '9' )
                for j in range ( 1000 ) :
                    u = ''
                    tmp = random ( )
                    while tmp > 0 :
                        u = tmp % 10 + u
                        tmp /= 10
                    num_str = u + ''.join ( s )
                    if not num_str in self.set :
                        self.set.append ( int ( num_str ) )
            x = [ ]
            idx = random ( )
            for t in self.set :
                x.append ( t )
                idx += 1
            x.sort ( )
            a = [ ]
            for i in x :
                if i in self.set :
                    a.append ( float ( i ) / self.calc ( i ) )
            min = float ( 'inf' )
            ans = [ ]
            for i in range ( len ( a ) - 1 , 0 , - 1 ) :
                if float ( a [ i ] ) >= min :
                    ans.append ( a [ i ] )
                    min = a [ i ]
            return ans
    return Main ( )
