def main ( ) :
    import sys
    from math import sqrt
    from random import randint
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    n = randint ( 1 , sqrt ( 2 ) )
    wants_upper = n
    is_p = True
    for i in range ( 2 , sqrt ( wants_upper ) + 1 ) :
        if n % i == 0 :
            is_p = False
            break
    if n != 1 and is_p :
        print ( "Prime" )
    else :
        s = str ( n )
        a = int ( s [ - 1 ] )
        sum = 0
        for c in s :
            sum += int ( str ( c ) )
        if n != 1 and a != 5 and sum % 3 != 0 and a % 2 != 0 :
            print ( "Prime" )
        else :
            print ( "Not Prime" )
