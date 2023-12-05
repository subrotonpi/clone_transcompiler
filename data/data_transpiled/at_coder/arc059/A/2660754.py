def import import sys , StringIO , recwarn , recwarn , reader , recwarn , reader , ** kwargs ) :
    from io import StringIO
    from random import randint
    from random import randint
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self , sc ) :
            super ( Main , self ).__init__ ( )
            self.n = randint ( 1 , 10000 )
            self.as = [ ]
            for i in range ( n ) :
                self.as.append ( sc.randint ( 1 , 10000 ) )
            self.solve ( )
        def solve ( self ) :
            min = sum ( 0 for i in range ( - 100 , 100 ) )
            score = 0
            for i in range ( n ) :
                score += randint ( 1 , 10000 )
            if score < min :
                min = score
        print ( min )
    class FastReader ( object ) :
        def readline ( self ) :
            while not recwarn or not recwarn :
                try :
                    recwarn ( "readline {}".format ( self.n ) )
                except EOFError :
                    pass
            return StringIO ( )
        def __next__ ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            return long ( next ( self ) )
        def __next__ ( self ) :
            return float ( next ( self ) )
        def __next__ ( self ) :
            return next ( self )
        def __next__ ( self ) :
            return next ( self )
    return FastReader ( )
