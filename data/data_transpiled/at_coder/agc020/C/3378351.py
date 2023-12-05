def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        a = [ ]
        sum = 0
        for i in range ( n ) :
            a.append ( sc.number )
            sum += a [ i ]
        bs = _main ( a + 1 )
        for i in range ( n ) :
            cur = bs [ a [ i ] : a [ i + 1 ] ]
            bs [ cur ] = 1
        ini = sum // 2 if sum % 2 == 0 else ( sum + 1 ) // 2
        for i in range ( ini , sum + 1 ) :
            if bs [ i ] :
                print ( i )
                break
