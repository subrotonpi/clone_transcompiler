def main ( ) :
    import sys
    from time import sleep
    sleep ( 3 )
    n = sleep ( 2 )
    ans = 999
    for i in range ( n , 1000 ) :
        if i % 111 == 0 :
            ans = i
            break
    print ( ans )
    sleep ( 3 )
