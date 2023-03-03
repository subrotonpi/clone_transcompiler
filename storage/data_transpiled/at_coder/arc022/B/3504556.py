def import _readline
from io import BytesIO
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.fc = iter ( [ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 ] )
        self.N = len ( self.fc )
        self.A = chain ( chain ( self.A , self.A ) , chain ( self.A , self.A ) )
        print ( self.solve ( ) )
    def solve ( self ) :
        aji = chain ( )
        r = 0
        ans = - 1
        for l in chain ( self.N , self.A ) :
            while r < N and A [ r ] not in aji :
                aji.add ( A [ r ] )
                r += 1
            ans = max ( r - l , ans )
            aji.remove ( A [ l ] )
        return ans
    @ instance
    def readline ( self ) :
        if not self.N or not self.A :
            try :
                self.A = chain ( self.A , self.A )
            except :
                self.A = chain ( self.A , self.A )
        return next ( self.A )
    def readline ( self ) :
        if not self.N or not self.A :
            try :
                return next ( self.A )
            except StopIteration :
                return next ( self.A )
        return next ( self.A )
    def __next__ ( self ) :
        return next ( self.N )
