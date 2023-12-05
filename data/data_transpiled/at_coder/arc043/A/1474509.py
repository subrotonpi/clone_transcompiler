def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.shape [ 0 ]
        a = sc.uniform ( 0 , 1 )
        b = sc.uniform ( 0 , 1 )
        p = [ sc.randint ( 0 , N ) for _ in range ( N ) ]
        p = [ i for i in p if i ]
        p = [ i for i in p if i ]
        if p [ 0 ] == p [ N - 1 ] :
            print ( - 1 )
            return
        ave = 0
        for i in p :
            ave += i
        ave /= N
        m = p [ N - 1 ] - p [ 0 ]
        P , Q = b / m , a - P * ave
        print ( P , Q )
