def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.__next__ ( )
        n = int ( math.sqrt ( a ) )
        min = sys.maxint
        for i in range ( 1 , n + 1 ) :
            if a % i == 0 :
                min = max ( len ( str ( i ) ) , len ( str ( a / i ) ) )
        print ( min )
