def import sys
class Main ( object ) :
    def __init__ ( self ) :
        bf = sys.stdin
        N = int ( bf.readline ( ) )
        data = bf.readline ( ).split ( )
        max , sum = 0 , 0
        for i in range ( N ) :
            value = int ( data [ i ] )
            sum += value
            if max < value :
                max = value
        if sum - max > max :
            print ( "Yes" )
        else :
            print ( "No" )
