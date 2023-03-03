def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.count ( )
        sum = max = 0
        for i in range ( n ) :
            price = _main ( )
            sum += price
            max = max ( max , price )
        print ( sum - ( max / 2 ) )
