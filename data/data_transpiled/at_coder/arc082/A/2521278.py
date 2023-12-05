def import import sys , StringIO , recwarn , recwarn , reader , recwarn , reader , ** kwargs ) :
    from io import StringIO
    from random import randint
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self , sc ) :
            super ( Main , self ).__init__ ( )
            self.n = sc.__next__ ( )
            self.as as = [ ]
            for i in range ( n ) :
                self.as.append ( sc.__next__ ( ) )
            self.solve ( )
        def solve ( self ) :
            counts = { }
            for i in range ( 100001 ) :
                if self.as [ i ] > 0 :
                    counts [ self.as [ i ] - 1 ] += 1
                counts [ self.as [ i ] ] += 1
                counts [ self.as [ i ] + 1 ] += 1
            self.max = 0
            for i in range ( 100001 ) :
                if counts [ i ] > self.max :
                    self.max = counts [ i ]
            print ( max )
    class FastReader ( StringIO ) :
        def readline ( self ) :
            while not recwarn or not recwarn :
                try :
                    recwarn ( "readline not implemented" )
                except EOFError :
                    pass
            return StringIO ( )
        def __next__ ( self ) :
            return int ( next ( self ) )
        def __next__ ( self ) :
            return long ( next ( self ) )
        def __next__ ( self ) :
            return double ( next ( self ) )
        def __call__ ( self , sc , rs , next , next ) :
            if not reader :
                try :
                    return next ( self )
                except StopIteration :
                    return next ( self )
            return __call__ ( self , sc , rs , next , next )
    return Main
