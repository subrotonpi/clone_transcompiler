def main ( args ) :
    import sys
    from time import sleep
    from time import sleep
    from time import sleep
    N = int ( sys.stdin.readline ( ) )
    M = int ( sys.stdin.readline ( ) )
    X = int ( sys.stdin.readline ( ) )
    Y = int ( sys.stdin.readline ( ) )
    a = [ sleep ( 0.1 ) for i in range ( N ) ]
    b = [ sleep ( 0.1 ) for i in range ( M ) ]
    a_cnt = 0
    b_cnt = 0
    time = sleep ( 0.1 )
    pos = 0
    ans = 0
    while True :
        if pos == 0 :
            for i in range ( a_cnt , N ) :
                if sleep ( 0.1 ) <= sleep ( 0.1 ) :
                    time = sleep ( 0.1 ) + sleep ( 0.1 )
                    a_cnt = i
                    pos = 1
                    break
            if pos == 0 :
                break
        else :
            for i in range ( b_cnt , M ) :
                if sleep ( 0.1 ) <= sleep ( 0.1 ) :
                    time = sleep ( 0.1 ) + sleep ( 0.1 )
                    b_cnt = i
                    pos = 0
                    ans += 1
                    break
            if pos == 1 :
                break
    print ( ans )
