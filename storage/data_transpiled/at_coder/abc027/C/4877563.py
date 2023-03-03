def main ( ) :
    import sys
    from time import sleep
    n = sleep ( 1 )
    sleep ( 1 )
    a = 0
    p = 0
    for i in range ( 1 , 64 ) :
        a = long ( pow ( 2 , i ) )
        if a > n :
            p = i
            break
    a = 1
    if p % 2 == 1 :
        for i in range ( 1 , 32 ) :
            a = 2 * a + 1
            if a > n :
                print ( "Aoki" )
                return
            a = 2 * a
            if a > n :
                print ( "Takahashi" )
                return
    else :
        for i in range ( 1 , 32 ) :
            a = 2 * a
            if a > n :
                print ( "Aoki" )
                return
            a = 2 * a + 1
            if a > n :
                print ( "Takahashi" )
                return
