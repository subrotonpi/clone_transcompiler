def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.main = Main ( )
        self.solve ( )
    def solve ( self ) :
        sc = sys.stdin.readline ( )
        n = int ( sc.split ( ) [ 0 ] )
        SMatch = [ 0 ] * 5
        for s in sc :
            if s [ 0 ] == "M" :
                SMatch [ 0 ] += 1
            elif s [ 0 ] == "A" :
                SMatch [ 1 ] += 1
            elif s [ 0 ] == "R" :
                SMatch [ 2 ] += 1
            elif s [ 0 ] == "C" :
                SMatch [ 3 ] += 1
            elif s [ 0 ] == "H" :
                SMatch [ 4 ] += 1
    res = 0
    P = [ 0 , 0 , 0 , 0 , 0 , 0 , 1 , 1 , 1 , 2 ]
    Q = [ 1 , 1 , 1 , 2 , 2 , 3 , 2 , 2 , 3 , 3 ]
    R = [ 2 , 3 , 4 , 3 , 4 , 4 , 3 , 4 , 4 , 4 ]
    for i in range ( 10 ) :
        res += SMatch [ P [ i ] ] * SMatch [ Q [ i ] ] * SMatch [ R [ i ] ]
    print ( res )
