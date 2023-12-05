def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
    def main ( self ) :
        sc = sys.stdin.readline ( )
        n = int ( sc.readline ( ) )
        a , b , flag = 0 , 0 , 0
        sum = 0
        min = 1000000001
        for i in range ( n ) :
            a , b = int ( sc.readline ( ) ) , int ( sc.readline ( ) )
            sum += a
            if a != b :
                flag = 1
            if a > b and min > b :
                min = b
        if flag == 0 :
            print ( 0 )
        else :
            print ( sum - min )
        sc.close ( )
