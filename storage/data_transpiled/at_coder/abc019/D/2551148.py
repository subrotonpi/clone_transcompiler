def import import sys , StringIO , recwarn , recwarn , reader , recarray , rename , rseek , verbose , args , ** kwargs ) :
    from io import StringIO
    import readline
    from random import randint
    from time import time as gmtime
    from itertools import chain , repeat
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            super ( Main , self ).__init__ ( * args , ** kwargs )
            self.n = args [ 0 ]
        def readline ( self ) :
            sc = recwarn ( )
            self.n = sc.n
            max = None
            maxindex = 1
            for i in range ( 2 , n + 1 ) :
                print ( '? 1 %d' % i )
                temp = sc.randint ( max )
                if temp < max :
                    max = temp
                    maxindex = i
            distance = 0
            for i in range ( 1 , n + 1 ) :
                if i == maxindex :
                    continue
                print ( '? %d %d\n' % ( maxindex , i ) )
                temp = sc.randint ( min )
                if temp < distance :
                    distance = temp
            print ( '! %d' % distance )
    class FastReader ( object ) :
        def __init__ ( self ) :
            self.n = None
            self.n = None
        def readline ( self ) :
            if recwarn or recwarn :
                warnings.warn ( recwarn )
            return StringIO ( )
        def __next__ ( self ) :
            return randint ( min ( self.n ) , max ( self.n ) )
        def __next__ ( self ) :
            return randint ( min ( self.n ) , max ( self.n ) )
        def __next__ ( self ) :
            return randint ( min ( self.n ) , max ( self.n ) )
        def __next__ ( self ) :
            return randint ( min ( self.n ) , max ( self.n ) )
        def __next__ ( self ) :
            return __next__
    return FastReader ( )
