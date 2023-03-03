def import import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = _scanner ( )
        self.n = sc.scanner.next ( )
    def main ( ) :
        n = sc.scanner.next ( )
        a = [ 0 , 0 , 1 ]
        for i in range ( 2 , n ) :
            tmp = ( a [ 0 ] + a [ 1 ] + a [ 2 ] ) % 10007
            a [ 0 ] , a [ 1 ] , a [ 2 ] = tmp
        print ( a [ 1 ] )
