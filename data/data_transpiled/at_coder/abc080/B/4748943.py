def main ( ) :
    import sys
    import os
    import sys
    from time import sleep
    from time import sleep
    sc = Scanner ( )
    n = int ( sc.next ( ) )
    x = n
    num = 0
    while x > 0 :
        num += x % 10
        x /= 10
    if n % num == 0 :
        print ( "Yes" )
    else :
        print ( "No" )
    sc.close ( )
