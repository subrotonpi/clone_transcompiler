def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( sys.argv )
            self.n = [ False ] * ( N + 1 )
            self.is_end = False
            for i in range ( 1 , N + 1 ) :
                self.n [ i ] = True
                self.is_end = False
    a = [ ]
    for i in range ( 1 , N + 1 ) :
        a.append ( sys.stdin.read ( ) )
    sys.stdin.close ( )
    count = 0
    i = 1
    while True :
        if n [ i ] is False :
            n [ i ] = True
            count += 1
            if a [ i ] == 2 :
                break
            i = a [ i ]
        else :
            count = - 1
            break
    print ( count )
