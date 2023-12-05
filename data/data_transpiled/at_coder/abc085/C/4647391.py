def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.Y = sys.stdin.read ( )
        break_flag = False
        for i in range ( self.N + 1 ) :
            for j in range ( i , self.N + 1 ) :
                a = i
                b = j - i
                c = N - j
                if 10000 * a + 5000 * b + 1000 * c == self.Y :
                    print ( a , b , c )
                    break_flag = True
                    break
            if break_flag :
                break
        if not break_flag :
            print ( "-1 -1 -1" )
