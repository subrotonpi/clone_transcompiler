def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.count ( )
        h = [ ]
        max = 0
        for i in range ( N ) :
            h.append ( sc.get ( i ) )
            if h [ i ] > max :
                max = h [ i ]
        count = 0
        for t in range ( max ) :
            if h [ 0 ] > 0 :
                count += 1
            for i in range ( 1 , N ) :
                if h [ i - 1 ] <= 0 and h [ i ] > 0 :
                    count += 1
            for i in range ( N ) :
                h [ i ] -= 1
        print ( count )
