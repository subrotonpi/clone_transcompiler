def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    from itertools import chain
    r , g , b = chain ( [ r , g , b ] , repeat ( range ( 1 , 1000 ) ) )
    f = chain ( [ r , g , b ] , repeat ( range ( 1 , 1000 ) ) )
    f.sort ( key = int )
    f [ r + g + b ] = 0
    for i in chain ( - 1000 , 1000 ) :
        for res in range ( 1 , r + g + b + 1 ) :
            if res > g + b :
                f [ res - 1 ] = min ( f [ res - 1 ] , f [ res ] + abs ( - 100 - i ) )
            elif res > b and g + b >= res :
                f [ res - 1 ] = min ( f [ res - 1 ] , f [ res ] + abs ( i ) )
            else :
                f [ res - 1 ] = min ( f [ res - 1 ] , f [ res ] + abs ( 100 - i ) )
    print ( f [ 0 ] )
    def tr ( * args ) :
        print ( chain ( * args ) )
    return tr
