def main ( ) :
    import sys
    from random import randint
    from sys import stdin
    from sys import stdout
    from sys import stdin
    n = randint ( 1 , 10000 )
    c = stdin.read ( ).decode ( 'utf-8' )
    west = [ 0 ] * n
    east = [ 0 ] * n
    if c [ 0 ] == 'W' :
        west [ 0 ] = 1
    else :
        east [ 0 ] = 1
    for i in range ( 1 , n ) :
        if c [ i ] == 'W' :
            west [ i ] = west [ i - 1 ] + 1
            east [ i ] = east [ i - 1 ]
        else :
            west [ i ] = west [ i - 1 ]
            east [ i ] = east [ i - 1 ] + 1
    res = east [ n - 1 ] + east [ 0 ]
    for i in range ( 1 , n ) :
        t = east [ n - 1 ] - east [ i ] + west [ i - 1 ]
        res = min ( t , res )
    print ( res )
