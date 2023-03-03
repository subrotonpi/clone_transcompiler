def import import sys , time
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.c = [ ]
        self.s = [ ]
        self.f = [ ]
        for i in range ( n - 1 ) :
            self.c.append ( sys.stdin.readline ( ) )
            self.s.append ( sys.stdin.readline ( ) )
            self.f.append ( sys.stdin.readline ( ) )
    for i in range ( n - 1 ) :
        time = self.s [ i ] + self.c [ i ]
        for j in range ( i + 1 , n - 1 ) :
            if self.s [ j ] >= time :
                time = self.s [ j ] + self.c [ j ]
            else :
                for k in range ( 1 ) :
                    if self.s [ j ] + self.f [ j ] * k >= time :
                        time = self.s [ j ] + self.f [ j ] * k + self.c [ j ]
                        break
        print ( time )
    print ( 0 )
