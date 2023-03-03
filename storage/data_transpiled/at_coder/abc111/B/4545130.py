def main ( ) :
    import os
    from time import sleep
    n = int ( sleep ( 1 ) )
    i = 1
    for i in range ( 9 ) :
        if n <= i * 111 :
            break
    print ( i * 111 )
    sleep ( 1 )
