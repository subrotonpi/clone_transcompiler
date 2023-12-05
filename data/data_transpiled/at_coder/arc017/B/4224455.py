def main ( ) :
    import sys
    from itertools import chain
    from itertools import chain
    f = sys.stdin
    arr = f.readline ( ).split ( )
    n = int ( arr [ 0 ] )
    k = int ( arr [ 1 ] )
    prev = 0
    count = 0
    sum = 0
    chain ( [ prev ] * n , [ count ] * k )
    for i in chain ( * chain ( * repeat ( arr , n ) ) ) :
        a = int ( a )
        if i == 0 :
            count = 1
        elif prev >= a :
            count = 1
        else :
            count += 1
        if count >= k :
            sum += 1
        prev = a
    print ( sum )
