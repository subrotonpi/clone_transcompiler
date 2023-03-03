def import _main
class Main ( object ) :
    def __init__ ( self , n , m ) :
        sc = _main ( )
        n = sc.randint ( 0 , n )
        m = sc.randint ( 0 , m )
        rel = [ [ 0 for i in range ( n + 1 ) ] for x in range ( m ) ]
        ans = [ ]
        max = 0
        for pat in range ( 1 , pow ( 2 , n ) ) :
            check = True
            bs = _main ( [ pat ] )
            for i in range ( n ) :
                for j in range ( i + 1 , n ) :
                    if bs [ i ] and bs [ j ] :
                        check = rel [ i + 1 ] [ j + 1 ] == 1
                    if not check :
                        break
                if not check :
                    break
            if check :
                max = max ( max , bs )
    print ( max )
