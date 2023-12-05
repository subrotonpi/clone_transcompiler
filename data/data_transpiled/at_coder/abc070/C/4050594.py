def main ( ) :
    import time
    class Main ( object ) :
        def __init__ ( self ) :
            self.time = time
    N = int ( sys.argv [ 1 ] )
    time = [ ]
    for i in range ( N ) :
        time.append ( time [ i ] )
    for i in range ( N - 1 ) :
        time [ i + 1 ] = ( time [ i ] / GCD ( time [ i ] , time [ i + 1 ] ) ) * time [ i + 1 ]
    print ( time [ N - 1 ] )
    def GCD ( a , b ) :
        if a < b :
            return GCD ( b , a )
        else :
            if a % b == 0 :
                return b
            else :
                return GCD ( b , a % b )
