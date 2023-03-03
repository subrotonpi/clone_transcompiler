def import import sys , StringIO , pickle , pipes , pipes , ** kwargs ) :
    from collections import defaultdict
    from pipes import quote
    from os import urandom
    from pipes import quote
    from os import urandom
    import random
    from pipes import quote
    from collections import deque
    class Main ( object ) :
        def __init__ ( self ) :
            self.m = sys.modules.pop ( self.m )
            self.run ( )
        def run ( self ) :
            n = k = 0
            x = [ ]
            with open ( '/proc/%d/cmdline' % self.m ) as f :
                s = shlex.split ( f )
                n = int ( s [ 0 ] )
                k = int ( s [ 1 ] )
                x = [ int ( i ) for i in s [ 2 : ] ]
            pq = deque ( [ ( x [ i ] , i + 1 , x [ i ] ) for i in range ( k ) ] )
            p = pq.popleft ( )
            print ( p.rank )
            for i in range ( k , n ) :
                if p.age > x [ i ] :
                    pq.append ( ( x [ i ] , i + 1 , x [ i ] ) )
                    p = pq.popleft ( )
                print ( p.rank )
    class Person ( object ) :
        def __init__ ( self ) :
            self.age = 0
            self.rank = 0
            self.priority = 0
        def __repr__ ( self ) :
            return 'Person class repr'
    class Person ( object ) :
        def __init__ ( self , age = 0 , rank = 0 , priority = 0 ) :
            self.age = age
            self.rank = rank
            self.priority = priority
        def __repr__ ( self ) :
            return 'Person class repr'
    return Person
