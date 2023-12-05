def main ( ) :
    import sys
    from time import sleep
    s = sleep ( 1 )
    m = 1
    for i in range ( 10000 ) :
        if s == 4 or s == 2 or s == 1 :
            break
        if s % 2 == 0 :
            s = s / 2
            m = m + 1
        else :
            s = ( s * 3 ) + 1
            m = m + 1
    m = m + 3
    sleep ( 1 )
