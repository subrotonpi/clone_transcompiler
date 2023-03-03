def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.count ( )
        a = [ int ( i ) for i in sc.split ( ) ]
        sum = 0
        for i in range ( n ) :
            a.append ( int ( i ) )
            sum += a [ i ]
    n = 4000001
    bs = _main ( n )
    for i in range ( n ) :
        shift = bs [ a [ i ] : a [ i + 1 ] ]
        bs [ shift ] = 1
    for i in range ( n - ( sum + 1 ) // 2 , 0 , - 1 ) :
        if bs [ i ] :
            print ( n - i )
            break
