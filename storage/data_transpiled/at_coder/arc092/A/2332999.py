def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        red = [ [ int ( i ) for i in sc.readline ( ).split ( ) ] for i in range ( n ) ]
        blue = [ [ int ( i ) for i in sc.readline ( ).split ( ) ] for i in range ( n ) ]
        red.sort ( lambda a , b : cmp ( a [ 0 ] , b [ 0 ] ) )
        blue.sort ( lambda a , b : cmp ( a [ 1 ] , b [ 0 ] ) )
        print ( self.calc ( red , blue , n ) )
        sc.close ( )
    def calc ( red , blue , n ) :
        ret , maxtemp , index , maxindex , flag = 0 , - 1 , 0 , 0
        for i in range ( n ) :
            index = 0
            flag = 0
            maxtemp = - 1
            while index < n and red [ index ] [ 0 ] < blue [ i ] [ 0 ] :
                if maxtemp <= red [ index ] [ 1 ] < blue [ i ] [ 1 ] :
                    maxtemp = red [ index ] [ 1 ]
                    maxindex = index
                    flag = 1
                index += 1
            if flag == 1 :
                ret += 1
                red [ maxindex ] [ 1 ] = 201
        return ret
