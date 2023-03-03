def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.randint ( 0 , M )
        X = sc.randint ( 0 , N )
        Y = sc.randint ( 0 , N )
        xs = [ ]
        maxX = - 100
        for i in range ( N ) :
            xs.append ( sc.randint ( 0 , X ) )
            maxX = max ( xs )
        ys = [ ]
        minY = 100
        for i in range ( M ) :
            ys.append ( sc.randint ( 0 , Y ) )
            minY = min ( ys )
        if Y <= X :
            print ( "War" )
            return
        for i in range ( X + 1 , Y + 1 ) :
            if ( maxX < i ) and ( minY >= i ) :
                print ( "No War" )
                return
        print ( "War" )
