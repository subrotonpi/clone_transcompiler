def _import ( ) : return
from itertools import repeat
from itertools import chain
from random import randint
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( chain ( [ 0 ] ) )
        self.X , self.Y = chain ( [ randint ( 0 , 1 ) for i in range ( N ) ] )
        print ( self.solve ( ) )
    def solve ( self ) :
        cnt = 0
        for i in range ( self.N - 2 ) :
            for j in range ( i + 1 , self.N - 1 ) :
                for k in range ( j + 1 , self.N ) :
                    if self.calc ( i , j , k ) :
                        cnt += 1
        return cnt
    def calc ( self , i , j , k ) :
        x1 = self.X [ j ] - self.X [ i ]
        y1 = self.Y [ j ] - self.Y [ i ]
        x2 = self.X [ k ] - self.X [ i ]
        y2 = self.Y [ k ] - self.Y [ i ]
        area = abs ( x1 * y2 - y1 * x2 )
        return area > 0 and area % 2 == 0
    @ staticmethod
    def readline ( ) :
        if not self.X or not self.Y :
            try :
                self.X = next ( iter ( self.X ) )
            except StopIteration :
                self.X = next ( iter ( self.X ) )
            return next ( iter ( self.X ) )
        else :
            self.X = next ( iter ( self.X ) )
    def __next__ ( self ) :
        return int ( next ( iter ( self.X ) ) )
    def __next__ ( self ) :
        return int ( next ( iter ( self.Y ) ) )
