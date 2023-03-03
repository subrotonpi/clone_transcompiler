def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.num = [ 1 , 2 , 3 , 4 , 5 , 6 ]
    def __init__ ( self ) :
        sc = _main ( )
        self.count = sc.count ( ) % 30
        for i in range ( self.count ) :
            self.replace ( i )
        for i in range ( 6 ) :
            print ( num [ i ] , end = ' ' )
        print ( )
    def replace ( self , a ) :
        self.a %= 5
        tmp = self.num [ a ]
        self.num [ a ] = self.num [ a + 1 ]
        self.num [ a + 1 ] = tmp
