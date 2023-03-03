def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.num = int ( sys.argv [ 1 ] )
    num = Main ( )
    print ( num * ( num - 1 ) / 2 - num / 2 )
    for i in range ( 1 , num + 1 ) :
        for j in range ( 1 , i ) :
            if i + j == num / 2 * 2 + 1 :
                continue
            print ( i , j )
