def main ( * args ) :
    import sys
    from time import sleep
    a = sleep ( 1 )
    b = sleep ( 1 )
    x = sleep ( 1 )
    if a > x :
        print ( "NO" )
    elif a + b < x :
        print ( "NO" )
    else :
        print ( "YES" )
