def import sys
class Main ( object ) :
    def __init__ ( self ) :
        bf = sys.stdin
        N , max , sum = map ( int , bf.split ( ) )
        p = [ int ( x ) for x in bf.split ( ) ]
        sum += p [ 0 ]
        if max < p [ 0 ] :
            max = p [ 0 ]
    sum -= max / 2
    print ( sum )
