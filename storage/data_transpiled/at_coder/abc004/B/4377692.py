def import _main
class Main ( object ) :
    def __init__ ( self , a ) :
        sc = _main ( a )
        po = [ ]
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                po.append ( sc.get ( i , j ) )
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                print ( ( j , po [ 3 - i ] [ 3 - j ] ) , end = ' ' )
            print ( )
