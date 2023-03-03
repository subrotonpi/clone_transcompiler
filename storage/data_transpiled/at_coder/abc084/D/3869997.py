def main ( ) :
    import sys
    from math import sqrt
    from math import sin , cos
    from math import sqrt
    from math import sin , cos
    from math import sin , cos
    from math import log
    from math import log
    from math import sin , cos , pi
    Q = int ( sys.stdin.read ( ) )
    count = [ 0 ] * 100001
    for i in range ( 2 , 100000 ) :
        if isPrime ( i ) == True and isPrime ( ( i + 1 ) / 2 ) == True :
            count [ i ] = count [ i - 1 ] + 1
        else :
            count [ i ] = count [ i - 1 ]
    for l , r in zip ( range ( Q ) , range ( 1 , - 1 , - 1 ) ) :
        print ( count [ r ] - count [ l - 1 ] )
    def isPrime ( n ) :
        if n == 1 : return False
        if n == 2 : return True
        for i in range ( 2 , sqrt ( n ) + 1 ) :
            if n % i == 0 :
                return False
        return True
    return isPrime
