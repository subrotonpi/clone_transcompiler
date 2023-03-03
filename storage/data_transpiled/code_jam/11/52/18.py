def import _open , sys , stdin , stdout , stderr , verbose , filename_verbose , verbose , filename_verbose , filename , filename_verbose , * args , ** kwargs ) :
    import readline
    import sys
    import os
    import getopt
    import os
    import sys , re
    from itertools import deque
    class B ( object ) :
        def __init__ ( self ) :
            self.stdin = stdin
            self.stdout = stdout
            self.stdout = stdout
            self.filename_verbose = verbose
        def readline ( self ) :
            return self.stdout
    def solve_one ( prefix ) :
        n = randint ( 1 , 10000 )
        count = [ ]
        for i in range ( n ) :
            count [ randint ( 1 , 10000 ) - 1 ] += 1
        ans = sys.maxsize
        q = deque ( )
        for i in count :
            nq = deque ( )
            while count [ i ] and not q.empty ( ) :
                nq.append ( q.popleft ( ) + 1 )
                del count [ i ]
            while not q.empty ( ) :
                ans = min ( ans , q.popleft ( ) )
            while count [ i ] and not q.empty ( ) :
                nq.append ( 1 )
                del count [ i ]
            q = nq
        while not q.empty ( ) :
            ans = min ( ans , q.popleft ( ) )
        stdout.write ( '%s%s\n' % ( prefix , ( n or 0 ) + '\n' ) )
    def run ( ) :
        stdin = open ( filename + '.in' , 'r' )
        stdout = open ( filename + '.out' , 'w' )
        n_tests = randint ( 1 , 10000 )
        for i in range ( 1 , n_tests + 1 ) :
            solve_one ( 'Case #%d: ' % i )
        stdout.close ( )
        stdin.close ( )
        stdout.close ( )
    next ( stdin )
    while not stdout or not stderr :
        line = stdin.readline ( )
        if not line :
            return None
        stdout = line.rstrip ( )
    randint ( 1 , 10000 )
    long ( 1 , 10000 )
    double ( 1 , 1 )
