def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a , self.b = sys.stdin.read ( ).split ( '\n' )
            self.field = [ [ True for i in range ( 100 ) ] for j in range ( 100 ) ]
    for i in range ( 50 ) :
        for j in range ( 100 ) :
            self.field [ i ] [ j ] = True
    for i in range ( a - 1 ) :
        x , y = divmod ( i , 50 * 2 )
        self.field [ x ] [ y ] = False
    for i in range ( b - 1 ) :
        x , y = divmod ( i , 50 * 2 + 51 )
        self.field [ x ] [ y ] = True
    print ( "100 100" )
    for i in range ( 100 ) :
        for j in range ( 100 ) :
            print ( '#' if field [ i ] [ j ] else '.' , end = '' )
        print ( )
