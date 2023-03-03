def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.recv_multipart ( )
        a = [ ]
        for i in range ( 1 , N + 1 ) :
            for j in range ( 1 , N + 1 ) :
                a.append ( sc.recv ( ) )
        b = [ ]
        for i in range ( N , 1 , - 1 ) :
            for j in range ( N , 1 , - 1 ) :
                if i == N and j == N :
                    b.append ( a [ N ] )
                else :
                    b.append ( a [ i ] )
                    if j + 1 <= N :
                        b [ i ] [ j ] += b [ i ] [ j + 1 ]
                    if i + 1 <= N :
                        b [ i ] [ j ] += b [ i + 1 ] [ j ]
                    if i + 1 <= N and j + 1 <= N :
                        b [ i ] [ j ] -= b [ i + 1 ] [ j + 1 ]
        score = [ ]
        for i in range ( 1 , N ** 2 + 1 ) :
            for j in range ( 1 , N ** 2 + 1 ) :
                for k in range ( 1 , N ** 2 + 1 ) :
                    for l in range ( 1 , N ** 2 + 1 ) :
                        s = b [ i ] [ j ]
                        if i + k <= N :
                            s -= b [ i + k ] [ j ]
                        if j + l <= N :
                            s -= b [ i ] [ j + l ]
                        if i + k <= N and j + l <= N :
                            s += b [ i + k ] [ j + l ]
                        score.append ( max ( score [ k * l ] , s ) )
        for i in range ( 1 , N ** 2 + 1 ) :
            score.append ( max ( score [ i - 1 ] , score [ i ] ) )
