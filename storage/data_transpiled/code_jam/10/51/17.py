def _ _ import _ _ ; SPACETOKEN import SPACETOKEN os , SPACETOKEN os , SPACETOKEN sys , SPACETOKEN os.write SPACETOKEN as SPACETOKEN os.write SPACETOKEN '' SPACETOKEN to SPACETOKEN '' SPACETOKEN '.join ( [ str ( i ) for i in range ( 1 , k ) ] ) )
def _ ( a , b ) :
    d = randint ( )
    k = randint ( )
    ten = 1
    for i in range ( d ) :
        ten *= 10
    el = [ False ] * k
    max = 0
    for i in range ( k ) :
        el [ i ] = randint ( )
        max = max ( max , el [ i ] )
    if k == 1 :
        print ( "I don't know." , file = sys.stderr )
    elif k == 2 :
        if el [ 0 ] == el [ 1 ] :
            print ( el [ 0 ] , file = sys.stderr )
        else :
            print ( "I don't know." , file = sys.stderr )
    else :
        q = [ ]
        for p in range ( max + 1 , ten + 1 ) :
            if p in prime :
                P = int ( p )
                if el [ 0 ] == el [ 1 ] :
                    q.append ( el [ 0 ] )
                    continue
                x1 , x2 , y1 , y2 = el [ 0 ] , el [ 1 ] , el [ 2 ]
                if x1 == 0 :
                    tmp = x1
                    x1 , x2 , tmp = x2 , y1 , y2 , tmp
                x1inv = divmod ( x1 , P )
                X = int ( 1 - int ( x1inv * x2 ) )
                Y = int ( y2 - int ( x2 * x2 * x1inv ) )
                Y %= p
                if Y < 0 : Y += p
                b = int ( ( Y * X ) % p )
                a = int ( ( int ( y1 - b ) * x1inv ) % p )
                if a < 0 : a += p
                ne = int ( ( int ( el [ k - 1 ] * a + b ) ) % p )
                if ne == 0 : return ne
    return True
