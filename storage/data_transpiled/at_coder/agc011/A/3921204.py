def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    N , C , K = map ( int , repeat ( 3 , 4 ) )
    T_ = chain ( repeat ( N , C ) , repeat ( K , K ) )
    T_.sort ( )
    count = 1
    max = T_ [ 0 ] + K
    loop :
    for i in range ( N ) :
        index = i
        for j in range ( index , index + C ) :
            if j < N and T_ [ j ] <= max :
                i += 1
            elif j < N :
                break
            else :
                break loop
        if i < N :
            max = T_ [ i ] + K
            count += 1
    print ( count )
