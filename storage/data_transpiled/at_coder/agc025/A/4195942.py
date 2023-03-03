def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        min = sys.maxint
        for i in range ( 1 , n // 2 + 1 ) :
            temp = 0
            a = str ( i )
            for char in a :
                temp += ord ( char )
            b = str ( n - i )
            for char in b :
                temp += ord ( char )
            min = min ( min , temp )
        print ( min )
