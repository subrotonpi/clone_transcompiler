def _import ( ) : return
from itertools import chain
from io import BytesIO
from random import randint
from time import sleep
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.N = randint ( 1 , 10000 )
        self.A = [ ]
        self.X = [ - 1 ]
        for i in range ( N + 1 ) :
            self.A.append ( next ( self.A ) )
            self.X.append ( i )
        print ( self.solve ( ) )
    def solve ( self ) :
        indice = [ ]
        sum = 0
        for a in range ( 1 , N + 1 ) :
            ai = self.X [ a ]
            left = indice.lower ( ai )
            right = indice.higher ( ai )
            if left is None :
                l = ai + 1
            else :
                l = ai - left
            if right is None :
                r = N - ai
            else :
                r = right - ai
            sum += long ( a ) * l * r
            indice.append ( ai )
        return sum
    class FastScanner ( object ) :
        def readline ( self ) :
            self.readline = None
            self.__next__ = None
            return next ( self.A )
        def readline ( self ) :
            if self.__next__ or not self.__next__ :
                try :
                    return next ( self.A )
                except StopIteration :
                    return next ( self.X )
            return next ( self.A )
        def __next__ ( self ) :
            a = [ ]
            for i in range ( self.N ) :
                a.append ( randint ( 0 , a ) )
            return a
        def __next__ ( self ) :
            return next ( self.A )
        def __next__ ( self ) :
            return next ( self.X )
    return Main
