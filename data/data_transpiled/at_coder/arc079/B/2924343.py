def import _readline
from sys import stdout
from itertools import chain
from itertools import chain
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.K = 0
        self.K = 0
        x = solve ( )
        j = chain ( [ str ( each ) for each in x ] , [ ] )
        print ( len ( x ) )
        print ( chain ( [ j ] , [ ] ) )
    def solve ( self ) :
        answer = [ ]
        d = self.K // 50
        r = int ( self.K % 50 )
        answer.append ( d + 49 )
        for i in range ( r ) :
            answer [ i ] += 1
        for i in range ( r , 50 ) :
            answer [ i ] -= r
        return answer
    @ instance
    def readline ( self ) :
        if not self.K or not self.K :
            try :
                self.K = next ( self.K )
            except StopIteration :
                self.K = 0
        return self.K
    def readline ( self ) :
        if not self.K or not self.K :
            try :
                self.K = next ( self.K )
            except StopIteration :
                self.K = 0
        return self.K
    def readline ( self ) :
        if not self.K or not self.K :
            try :
                return self.K
            except StopIteration :
                self.K = 0
        return self.K
    def readline ( self ) :
        return next ( self.K )
    def __next__ ( self ) :
        return next ( self.K )
    def __next__ ( self ) :
        return next ( self.K )
    def __next__ ( self ) :
        return next ( self.K )
