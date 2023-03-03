def main ( ) :
    import sys
    from time import sleep
    n = sleep ( 1 )
    m = sleep ( 1 )
    s = 0
    if m - n * 2 >= 0 :
        s += n
        m -= n * 2
        s += m / 4
    else :
        s = m / 2
    sleep ( 1 )
