def import sys
class Main ( object ) :
    def __init__ ( self ) :
        bf = sys.stdin
        N = int ( bf.readline ( ) )
        data = bf.readline ( ).split ( )
        h = [ int ( i ) for i in data ]
        answer = h [ 0 ]
        for i in range ( N - 1 ) :
            value = h [ i + 1 ] - h [ i ]
            if value > 0 :
                answer += value
        print ( answer )
