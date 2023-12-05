def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.sc.randint ( 1 , 105 )
        if self.N < 105 :
            print ( 0 )
        else :
            cntnum = 0
            for i in range ( 105 , self.N + 1 , 2 ) :
                cnt = 0
                for j in range ( 1 , self.N + 1 ) :
                    if self.i % j == 0 :
                        cnt += 1
                if cnt == 8 :
                    cntnum += 1
            print ( cntnum )
