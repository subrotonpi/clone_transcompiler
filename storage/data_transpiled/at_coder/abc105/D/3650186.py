def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from time import sleep
    from sys import stdin
    from random import randint
    from random import randint
    from time import sleep
    n = randint ( 1 , 10000 )
    m = randint ( 1 , 10000 )
    ame = [ randint ( 1 , 10000 ) for i in range ( n + 1 ) ]
    for i in range ( 1 , n + 1 ) :
        ame [ i ] = ( ame [ i ] + ame [ i - 1 ] ) % m
    ame = [ ( i + 1 ) % m for i in ame ]
    sousu = 0
    genzai = 0
    dist = 0
    for i in range ( 0 , n ) :
        if ame [ i ] == genzai :
            dist += 1
        elif ame [ i ] != genzai :
            sousu += ( dist * ( dist - 1 ) / 2 )
            genzai = ame [ i ]
            dist = 1
    sousu += dist * ( dist - 1 ) / 2
    print ( sousu )
