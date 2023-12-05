def main ( args ) :
    import sys
    from math import factorial
    from math import log
    from math import log
    N = factorial ( args [ 0 ] )
    M = factorial ( args [ 1 ] )
    ans = 1
    for i in range ( ( M // N ) , 1 , - 1 ) :
        if M % i == 0 :
            ans = i
            break
    print ( ans )
