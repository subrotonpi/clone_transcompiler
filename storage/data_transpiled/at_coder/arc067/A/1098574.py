def main ( ) :
    import sys
    from math import log
    from math import factorial
    from math import log
    from math import log
    from math import factorial
    from math import log
    n = factorial ( n )
    prime = [ 1 - 1 ] * 1000
    for i in range ( 2 , 1000 ) :
        prime [ i - 1 ] = True
    for i in range ( 1 , 1000 ) :
        if prime [ i - 1 ] :
            for j in range ( 2 , i * j + 1 ) :
                prime [ i * j - 1 ] = False
    counter = [ 0 for i in range ( 1 , 1000 ) ]
    for i in range ( 1 , n + 1 ) :
        for j in range ( 1 , i + 1 ) :
            if prime [ j - 1 ] :
                x = i
                count = 0
                while x % j == 0 :
                    x = x // j
                    count += 1
                counter [ j - 1 ] += count
    result = 1
    for i in range ( 1 , 1000 ) :
        result = ( result * ( counter [ i - 1 ] + 1 ) ) % 1000000007
    print ( str ( result % 1000000007 ) )
