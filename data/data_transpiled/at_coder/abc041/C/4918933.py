def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.count ( )
        nums = [ [ sc.randint ( 0 , i + 1 ) for i in range ( n ) ] for i in range ( 2 ) ]
        comp = _main ( index = 0 )
        nums.sort ( comp )
        for i in range ( n , 0 , - 1 ) :
            print ( nums [ i - 1 ] [ 1 ] )
