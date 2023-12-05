def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        str = sc.readline ( )
        array = str.split ( '' )
        array = [ int ( i ) for i in array ]
        min = 1000
        for i in range ( 2 , len ( array ) ) :
            sum = 0
            sum += array [ i - 2 ] * 100
            sum += array [ i - 1 ] * 10
            sum += array [ i ]
            if abs ( sum - 753 ) < min :
                min = abs ( sum - 753 )
        print ( min )
