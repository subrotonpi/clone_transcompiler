def main ( ) :
    import sys
    from itertools import chain
    from itertools import chain
    from itertools import repeat
    f = open ( sys.argv [ 1 ] )
    n = sum ( map ( int , f.readline ( ).split ( ) ) )
    tmp = f.readline ( ).split ( )
    a = chain ( * repeat ( tmp ) )
    a.sort ( )
    alice_sum = 0
    bob_sum = 0
    is_alice_turn = True
    for i in range ( n - 1 , - 1 , - 1 ) :
        if is_alice_turn :
            alice_sum += a [ i ]
        else :
            bob_sum += a [ i ]
        is_alice_turn = not is_alice_turn
    print ( alice_sum - bob_sum )
