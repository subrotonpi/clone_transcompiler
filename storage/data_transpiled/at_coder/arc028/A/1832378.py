def main ( ) :
    import sys
    from itertools import repeat
    n = repeat ( n )
    a = repeat ( n )
    b = repeat ( n )
    turn = 'Ant'
    while n > 0 :
        if turn == 'Ant' :
            n -= a
            turn = 'Bug'
        else :
            n -= b
            turn = 'Ant'
    if turn == 'Ant' :
        print ( 'Bug' )
    else :
        print ( 'Ant' )
