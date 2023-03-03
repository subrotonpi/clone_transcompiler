def main ( ) :
    import sys
    import random
    stdIn = sys.stdin
    N = len ( stdIn )
    T = [ ]
    z , s , t = 0 , 0 , 0
    y , x , w = 0 , 0 , 0 , 0
    while z < N :
        T.append ( stdIn.read ( ) )
        z += 1
    z = 0
    T.sort ( )
    while z < N - 1 :
        y , x = T [ z ] , T [ z + 1 ]
        while 1 :
            if x == y :
                s = 2
                break
            if x > y :
                s = 0
                if x % y == 0 :
                    break
                else :
                    w , y = y , x % y , w
            if y > x :
                s = 1
                if y % x == 0 :
                    break
                else :
                    w , x = x , y % x , w
        if s == 0 :
            T [ z + 1 ] = T [ z ] / y * T [ z + 1 ]
        if s == 1 :
            T [ z + 1 ] = T [ z ] / x * T [ z + 1 ]
        if s == 2 :
            t = 0
        z += 1
    print ( T [ z ] )
