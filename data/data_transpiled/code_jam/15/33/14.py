def test_solve ( ) :
    import random
    random.seed ( 1 )
    t = random.randint ( 1 , 4 )
    for test in range ( 1 , t + 1 ) :
        c , d , v = random.randint ( 1 , 4 )
        denom = [ random.randint ( 1 , 4 ) for _ in range ( d ) ]
        random.seed ( 1 )
        print ( "Case #%d: %d\n" % ( test , solve ( c , denom , v ) ) )
    def solve ( c , denom , v ) :
        denom.sort ( )
        current_v = 0
        next_denom = 0
        needed_extra = 0
        while current_v < v :
            if next_denom != len ( denom ) and denom [ next_denom ] <= current_v + 1 :
                current_v += denom [ next_denom ] * c
                next_denom += 1
            else :
                needed_extra += 1
                current_v += c * ( current_v + 1 )
        return needed_extra
    return solve ( c , denom , v )
