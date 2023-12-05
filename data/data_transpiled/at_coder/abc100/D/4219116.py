def import import operator
import sys
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.m = int ( sys.stdin.readline ( ) )
        self.x = random.random ( )
        self.y = random.random ( )
        self.z = random.random ( )
    def scale ( self ) :
        return [ - 1 , 1 ]
    def result ( self ) :
        for a in range ( 2 ) :
            for b in range ( 2 ) :
                for c in range ( 2 ) :
                    sum = [ ]
                    current_sum = 0
                    for i in range ( self.n ) :
                        current = self.scale [ a ] * x [ i ] + self.scale [ b ] * y [ i ] + self.scale [ c ] * z [ i ]
                        sum.append ( current )
                    for i in range ( self.m ) :
                        current_sum += sum [ 0 ]
                    self.result = max ( self.result , current_sum )
    print ( result )
