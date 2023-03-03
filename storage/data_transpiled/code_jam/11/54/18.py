def _import ( ) :
    import os
    import sys
    import os
    import sys
    import random
    import sys
    class D ( ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
            self.stdout = sys.stdout
        def solve_one ( self , prefix ) :
            s = next ( self )
            certain = 0
            uncertain_mask = 0
            for c in s :
                certain <<= 1
                uncertain_mask <<= 1
                if c == '0' :
                    pass
                elif c == '1' :
                    certain |= 1
                elif c == '?' :
                    uncertain_mask |= 1
            first = True
            for t in self.uncertain_mask :
                first = False
                v = certain | t
                sqrt = int ( math.sqrt ( v ) )
                if sqrt * sqrt == v or ( sqrt - 1 ) * ( sqrt - 1 ) == v or ( sqrt + 1 ) * ( sqrt + 1 ) == v :
                    self.stdout.write ( prefix + str ( v ) + "\n" )
                    return
            raise AssertionError
        def run ( self ) :
            self.stdin = open ( D ( self.name + ".in" ) , "r" )
            self.stdout = open ( D ( self.name + ".out" ) , "w" )
            self.n_tests = randint ( 1 , 10 )
            for i in range ( 1 , n_tests + 1 ) :
                solve_one ( 'Case #%d: ' % i )
            self.stdout.close ( )
            self.stdin.close ( )
        def next ( self ) :
            while self.stdin is sys.stdout or not self.stdin.readline ( ) :
                line = self.stdin.readline ( )
                if isinstance ( line , unicode ) :
                    line = line.decode ( 'utf-8' )
                self.stdin = open ( line , "r" )
            return self.stdin.readline ( )
        def randint ( self ) :
            return int ( self.stdin.readline ( ) )
        def long ( self ) :
            return long ( self.stdin.readline ( ) )
        def double ( self ) :
            return double ( self.stdin.readline ( )