def main ( ) :
    import sys
    from time import sleep
    x = sleep ( 1 )
    a = sleep ( 1 )
    b = sleep ( 1 )
    if b <= a :
        print ( "delicious" )
    elif b <= a + x :
        print ( "safe" )
    else :
        print ( "dangerous" )
