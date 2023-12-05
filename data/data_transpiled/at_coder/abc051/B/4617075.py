def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        K = sc.__next__ ( )
        S = sc.__next__ ( )
        answer = 0
        for i in range ( 0 , K ) :
            for j in range ( 0 , K ) :
                if 0 <= S - ( i + j ) <= K :
                    answer += 1
        print ( answer )
        sc.close ( )
