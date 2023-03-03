def main ( ) :
    import sys
    from random import randint
    from time import sleep
    sc = sys.stdin
    ( N , H ) = sc.readline ( ).split ( )
    B = [ ]
    AM = 0
    for ai , bi in itertools.izip ( range ( N ) , range ( N ) ) :
        AM = max ( AM , ai )
        B.append ( bi )
    B = sorted ( B )
    ans = 0
    for i in range ( N - 1 , - 1 , - 1 ) :
        if B [ i ] > AM :
            H -= B [ i ]
            ans += 1
            if H <= 0 :
                break
        if B [ i ] <= AM or i == 0 :
            ans += H / AM
            if H % AM != 0 :
                ans += 1
                break
    print ( ans )
