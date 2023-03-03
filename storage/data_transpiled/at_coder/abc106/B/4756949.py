def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 1
        self.c = 0
        for i in range ( 1 , n + 1 ) :
            if i % 2 == 0 :
                continue
            if self.div ( i ) == 8 :
                self.c += 1
        print ( self.c )
    def div ( self , n ) :
        cnt = 0
        for i in range ( 1 , n + 1 ) :
            if self.n % i == 0 :
                cnt += 1
        return cnt
