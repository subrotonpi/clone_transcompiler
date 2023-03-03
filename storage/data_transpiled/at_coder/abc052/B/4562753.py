def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.main = Main ( )
        self.solve ( )
    def solve ( self ) :
        sc = sys.stdin.readline ( )
        n = int ( sc.readline ( ) )
        S = sc.read ( )
        sc.close ( )
        cnt , max = 0 , 0
        for i in range ( n ) :
            if S [ i ] == 'I' :
                cnt += 1
                if cnt > max :
                    max = cnt
            else :
                cnt -= 1
        print ( max )
