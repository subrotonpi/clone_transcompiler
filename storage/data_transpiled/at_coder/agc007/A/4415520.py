def main ( ) :
    import sys
    from os import urandom
    import random
    h , w = random.randint ( 1 , 1024 )
    l = [ ]
    r = [ ]
    for s in urandom ( h ) :
        for i in range ( w ) :
            if s [ i ] == '#' :
                l.append ( i )
                break
        for i in range ( w - 1 , - 1 , - 1 ) :
            if s [ i ] == '#' :
                r.append ( i )
                break
    random.seed ( )
    ans = True
    for i in range ( h - 1 ) :
        if r [ i ] != l [ i + 1 ] :
            ans = False
    print ( 'Possible' if ans else 'Impossible' )
