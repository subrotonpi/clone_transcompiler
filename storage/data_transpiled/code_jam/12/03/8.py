def test_recycled_small ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from random import randint
    from itertools import chain
    cases = repeat ( 'case' )
    for trial in range ( 1 , cases + 1 ) :
        print ( 'Case #%d: ' % trial , end = ' ' )
        a , b = chain ( range ( a ) , range ( b ) )
        rots = 0
        for v in chain ( a , b ) :
            rots += count_rotations ( v , b )
        print ( rots )
    def count_rotations ( v , b ) :
        v_string = str ( v )
        next_string = v_string
        count = 0
        while True :
            next_string = rotate ( next_string )
            if next_string == v_string :
                break
            new_v = int ( next_string )
            if new_v > v and new_v <= b :
                count += 1
        return count
    def rotate ( next_string ) :
        return next_string [ 1 : ] + next_string [ 0 ]
    return chain ( [ a , b ] , repeat ( 'case' ) )
