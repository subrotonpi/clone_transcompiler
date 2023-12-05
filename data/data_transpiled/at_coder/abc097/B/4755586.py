def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        x = self.sc.randint ( 1 , 100 )
        a = 1
        for i in range ( 2 , x + 1 ) :
            b = i * i
            while b <= x :
                a = max ( a , b )
                b = b * i
        print ( a )
