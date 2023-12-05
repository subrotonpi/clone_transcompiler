def main ( ) :
    import sys
    from itertools import count
    from itertools import count
    from itertools import count
    for i in range ( count ) :
        print ( i )
    spit_count = sum ( count ) * 2
    spits = [ count ( i ) for i in range ( spit_count ) ]
    spits.sort ( )
    dish_sum = 0
    for i in range ( spit_count ) :
        if i % 2 == 0 :
            dish_sum += spits [ i ]
    print ( dish_sum )
