def _import ( ) : return
from StringIO import StringIO
from itertools import chain
from random import randint
from itertools import chain
class Main ( object ) :
    def __init__ ( self , n ) :
        self.N = n
        self.S = [ ]
        for i in chain ( self.N , self.S ) :
            self.S.append ( i.decode ( 'ascii' ) )
        print ( self.solve ( ) )
    def solve ( self ) :
        ans = 0
        for i in range ( self.N ) :
            r = - 1
            for j in range ( self.N ) :
                if self.S [ i ] [ j ] == '.' :
                    r = j
            if r != - 1 :
                ans += 1
                self.nuru ( i , r )
        return ans
    def nuru ( self , c ) :
        for i in range ( 0 , c ) :
            self.S [ r ] [ i ] = 'o'
        if r + 1 != self.N :
            for i in range ( self.c , self.N ) :
                self.S [ r + 1 ] [ i ] = 'o'
    from itertools import chain
    class FastScanner ( object ) :
        def __init__ ( self , stream = None ) :
            self.stream = stream
            self.stream = None
        def readline ( self ) :
            if self.stream is None or not stream.readline ( ) :
                try :
                    self.stream = iter ( self.stream )
                except StopIteration :
                    self.stream = stream
            return self.stream.readline ( )
        def __next__ ( self ) :
            return next ( self.stream )
        def __next__ ( self ) :
            return next ( self.stream )
        def __next__ ( self ) :
            return next ( self.stream )
    return Main ( )
