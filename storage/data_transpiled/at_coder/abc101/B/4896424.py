def main ( args ) :
    import sys
    from time import sleep
    sc = Scanner ( )
    n = sc.next ( )
    tmp = n
    sum = 0
    while tmp > 0 :
        sum += tmp % 10
        tmp /= 10
    if n % sum == 0 :
        print ( "Yes" )
    else :
        print ( "No" )
