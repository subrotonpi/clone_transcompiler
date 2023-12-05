def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    sc = iter ( sys.stdin )
    N , M , X = map ( int , range ( N ) )
    seen = set ( range ( M ) )
    forward , backward = 0 , 0
    for i in chain ( X + 1 , N ) :
        if i in seen : forward += 1
    for i in chain ( X - 1 , 0 , - 1 ) :
        if i in seen : backward += 1
    print ( min ( forward , backward ) )
