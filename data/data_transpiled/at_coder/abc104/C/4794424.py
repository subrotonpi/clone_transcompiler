def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.D = sys.stdin.read ( )
        self.G = sys.stdin.read ( ) / 100
    p = [ 0 ] * ( D + 1 )
    c = [ 0 ] * ( D + 1 )
    score = [ 0 ] * ( D + 1 )
    for i in range ( 1 , D + 1 ) :
        p [ i ] = sys.stdin.read ( )
        c [ i ] = sys.stdin.read ( ) / 100
        score [ i ] = i * p [ i ] + c [ i ]
    ans = sys.maxsize
    for i in range ( 1 , D ) :
        max , num , value = 0 , 0 , 0
        for j in range ( D ) :
            if ( 1 & ( i >> j ) ) == 1 :
                num += p [ j + 1 ]
                value += score [ j + 1 ]
            else :
                max = j + 1
        if value < G :
            for j in range ( p [ max ] - 1 ) :
                value += max
                num += 1
                if value >= G :
                    break
        if value >= G :
            ans = min ( ans , num )
    print ( ans )
