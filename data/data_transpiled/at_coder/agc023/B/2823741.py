def import _readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( sys.stdin )
        self.S = [ ]
        for s in sys.stdin :
            for i in range ( N ) :
                self.S.append ( s [ i ] )
        print ( self.solve ( ) )
    def solve ( ) :
        ans = 0
        loop :
        for a , b in enumerate ( sys.stdin ) :
            for i in range ( N ) :
                for j in range ( N ) :
                    if i == j :
                        continue
                    if self.S [ ( a + i ) % N ] [ ( b + j ) % N ] != self.S [ ( a + j ) % N ] [ ( b + i ) % N ] :
                        continue loop
            ans += N
        return ans
    @ property
    def readline ( self ) :
        if self.N < 2 or not self.S [ 0 ] :
            try :
                self.S = [ self.S [ 0 ] ]
            except :
                self.S = [ self.S [ 0 ] ]
        return self.S
    def readline ( self ) :
        if self.N < 2 or not self.S [ 0 ] :
            try :
                self.S = [ self.S [ 0 ] ]
            except :
                self.S = [ self.S [ 0 ] ]
        return self.S
    def readline ( self ) :
        if self.N < 2 or not self.S [ 0 ] :
            try :
                self.S = [ self.S [ 0 ] ]
            except :
                self.S = [ self.S [ 0 ] ]
        return self.S
    def readline ( self ) :
        if self.N < 2 or not self.S [ 0 ] :
            try :
                self.S = [ self.S [ 0 ] ]
            except :
                self.S = [ self.S [ 0 ] ]
        return self.S
