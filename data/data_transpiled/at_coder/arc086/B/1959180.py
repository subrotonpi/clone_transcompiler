def import import sys , string , c_int , string , sys
from itertools import combinations
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
        self.N = sys.maxint
        self.a = intbv ( 0 , min = self.N , max = self.N )
        self.index = 0
        for i in range ( self.N ) :
            if abs ( a [ index ] ) < abs ( a [ i ] ) : index = i
        print ( 2 * self.N - 1 )
        for i in range ( self.N ) :
            print ( ( self.index + 1 ) , i + 1 )
        if self.a [ index ] :
            for i in range ( 2 , self.N + 1 ) :
                print ( ( self.i - 1 ) , i )
        else :
            for i in range ( self.N - 1 , 1 , - 1 ) :
                print ( ( self.i + 1 ) , i )
