def main ( ) :
    import sys
    from time import sleep
    sleep ( 1 )
    a = sleep ( 1 )
    b = sleep ( 1 )
    if a % 16 == 0 and b % 9 == 0 :
        print ( "16:9" )
    else :
        print ( "4:3" )
