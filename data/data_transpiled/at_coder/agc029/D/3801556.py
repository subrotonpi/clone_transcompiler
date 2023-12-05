def main ( ) :
    import sys
    import random
    import random
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            Scanner ( )
    H , W , N = random.randint ( 1 , 4 )
    block = [ list ( ) for w in range ( W ) ]
    for n in range ( N ) :
        x , y = random.randint ( 0 , N - 1 )
        block [ y ].append ( x )
    for w in range ( W ) :
        list ( block )
    ans = 1000000
    cur_x = 0
    for w in range ( W ) :
        cur_x += 1
        while cur_x < block [ w + 1 ] :
            cur_x += 1
        if cur_x >= block [ w ] :
            break
