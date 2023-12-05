def _solve ( ) :
    import random
    import sys
    import os
    import sys
    import os
    import random
    import sys
    class C :
        def __init__ ( self ) :
            self.test_cases = randint ( )
            self.passed = 1
            for test in range ( self.passed , self.test_cases + 1 ) :
                self.out.write ( 'Case #%d:\n' % test )
                self.solve_one_test ( )
                self.out.flush ( )
        def readline ( self ) :
            return sys.stdin.readline ( )
        def readline ( self ) :
            return sys.stdin.readline ( )
    def readline ( self ) :
        return int ( readline ( self ) )
    def readline ( self ) :
        return int ( readline ( self ) )
    def readline ( self ) :
        return readline ( self )
    s = [ ]
    for i in range ( 0 , min ( len ( s ) , 50 ) ) :
        s.append ( randint ( 0 , len ( s ) ) )
    s = tuple ( s )
    n = len ( s )
    answer = solve_stupid ( s )
    answer1 , answer2 = answer [ 0 ] , answer [ 1 ]
    both = answer1 & answer2
    answer1 ^= both
    first = True
    for i in range ( n ) :
        if answer1 & ( 1 << i ) :
            if not first :
                print ( '' , end = '' )
            else :
                first = False
            print ( s [ i ] , end = '' )
    print ( )
    first = True
    for i in range ( 0 , n ) :
        if answer2 & ( 1 << i ) :
            if not first :
                print ( '' , end = '' )
            else :
                first = False
            print ( s [ i ] , end = '' )
    print ( )
    first = True
    for i in range ( 0 , n ) :
        if answer1 & ( 1 << i ) :
            print ( it , end = '' )
    mask = rng ( 1 ) * 1000000000 + rng ( 1 )
    return s
