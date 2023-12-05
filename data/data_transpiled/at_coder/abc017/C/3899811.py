def import import sys
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.m = int ( sys.stdin.readline ( ) )
        self.q = [ 0 ] * m
        self.sum = 0
        for i in range ( self.n ) :
            a , b , c = random.randint ( - 1 , 1 )
            if b != m :
                self.q [ b ] -= c
            self.q [ a ] += c
            self.sum += c
        for i in range ( self.m - 1 ) :
            self.q [ i + 1 ] += self.q [ i ]
        self.q = sorted ( self.q )
        print ( self.sum - self.q [ 0 ] )
