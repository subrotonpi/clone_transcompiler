def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    A = randint ( 1 , 5 )
    B = randint ( 1 , 5 )
    Aafter = str ( A )
    Bafter = str ( B )
    max = int ( Aafter ) - int ( Bafter )
    AA = ""
    if A < 900 :
        AA = "9"
        AA += str ( Aafter [ 1 ] )
        AA += str ( Aafter [ 2 ] )
        max = max
    elif A < 990 :
        AA = "99" + str ( Aafter [ 2 ] )
        max = max
    elif A >= 990 :
        AA = "999"
        max = max
    if B >= 200 :
        Bafter = "1" + str ( Bafter [ 1 ] ) + str ( Bafter [ 2 ] )
        max = max
    elif B >= 110 and B <= 200 :
        Bafter = "10" + str ( Bafter [ 2 ] )
        max = max
    elif B < 110 :
        Bafter = "100"
        max = max
    log ( max )
