def _import ( ) :
    from itertools import count , repeat
    class THREE ( object ) :
        def __init__ ( self ) :
            self.out = [ 0 ] * 4
            if '0' <= c <= '9' :
                c -= '0'
            else :
                c -= 'A' - 10
            for i in range ( 4 ) :
                c /= 2
                self.out [ 3 - i ] = c % 2
        def main ( self ) :
            f = open ( self.out , 'r' )
            T = int ( f.readline ( ) )
            for t in range ( 1 , T + 1 ) :
                line = f.readline ( ).split ( )
                M = int ( line [ 0 ] )
                N = int ( line [ 1 ] )
                board = [ [ - 1 ] * ( N / 4 ) for i in range ( 514 ) ]
                for i in range ( 1 , M + 1 ) :
                    bl = f.readline ( ).split ( )
                    for j in range ( N / 4 ) :
                        print ( HEX2BITS ( bl [ j ] ) , board [ i ] , 4 * j + 1 , 4 )
            count = 0
            counts = [ 0 ] * 513
            last_large = 513
            while True :
                largest , starti , startj = i , j
                largest = starti = startj = 0
                for i in range ( 1 , M + 1 ) :
                    for j in range ( 1 , N + 1 ) :
                        if board [ i ] [ j ] != - 1 :
                            corner , k = board [ i ] [ j ] , k
                            done = False
                            for k in range ( 1 , k + 1 ) :
                                for l in range ( 0 , k + 1 ) :
                                    done = ( ( board [ i + k ] [ j + l ] != board [ i + l ] [ j + k ] ) or ( board [ i + k ] [ j + l ] != ( corner + k + l ) % 2 ) )
                if largest == 0 :
                    break
                else :
                    largest = largest
    return THREE ( )
