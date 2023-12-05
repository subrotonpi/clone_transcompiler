def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            self.N = int ( args [ 0 ] )
            self.Y = int ( args [ 1 ] )
            self.Y = int ( args [ 2 ] )
    for i in range ( 0 , N ) :
        for j in range ( 0 , N - i ) :
            k = N - i - j
            if i + j + k == N :
                ans = 10000 * i + 5000 * j + 1000 * k
                if ans == Y :
                    print ( i , j , k , ' ' )
                    sys.exit ( )
    print ( - 1 , - 1 , - 1 )
