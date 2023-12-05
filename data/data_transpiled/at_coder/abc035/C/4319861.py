def main ( ) :
    import sys
    from itertools import repeat
    from random import randint
    n = randint ( 1 , 10000 )
    q = randint ( 1 , 10000 )
    l = [ randint ( 1 , 10000 ) for _ in range ( q ) ]
    r = [ randint ( 1 , 10000 ) for _ in range ( q ) ]
    koma = [ 0 ] * 200100
    for i in range ( q ) :
        l [ i ] , r [ i ] = repeat ( i )
        koma [ l [ i ] - 1 ] += 1
        koma [ r [ i ] ] += 1
    omote = True
    for i in range ( n ) :
        pos = koma [ i ]
        if pos % 2 == 1 :
            omote = not omote
        if omote :
            sys.stdout.write ( 0 )
        else :
            sys.stdout.write ( 1 )
    sys.stdout.write ( "\n" )
