def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        s = self.s
        cnt = [ 0 ] * 4
        for i in range ( n ) :
            if s [ i ] == '1' :
                cnt [ 0 ] += 1
            elif s [ i ] == '2' :
                cnt [ 1 ] += 1
            elif s [ i ] == '3' :
                cnt [ 2 ] += 1
            elif s [ i ] == '4' :
                cnt [ 3 ] += 1
    max , min = 0 , n
    for i in range ( 4 ) :
        max = max ( max , cnt [ i ] )
        min = min ( min , cnt [ i ] )
    print ( max , min )
