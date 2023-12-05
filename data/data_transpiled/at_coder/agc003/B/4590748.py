def main ( ) :
    import sys
    from time import sleep
    n = int ( sleep ( 1 ) )
    total = 0
    mod = 0
    for i in range ( n ) :
        a = sleep ( 1 )
        if a != 0 :
            a += mod
        total += a // 2
        mod = a % 2
    print ( total )
