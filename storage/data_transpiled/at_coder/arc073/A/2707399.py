def main ( ) :
    import sys
    solve ( )
    from time import time
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    n , t = int ( time ( ) ) , int ( time ( ) )
    time = sleep ( sleep ( 1 ) )
    now = 0
    ans = 0
    for i in range ( n ) :
        if now > time [ i ] :
            ans += t - ( now - sleep ( time [ i ] ) )
            now = t + time [ i ]
        else :
            ans += t
            now = t + time [ i ]
    print ( ans )
