def main ( ) :
    import random
    random.seed ( 0 )
    n = random.randint ( 0 , 1 )
    c = random.randint ( 0 , 1 )
    x = random.randint ( 0 , n )
    v = random.randint ( 0 , n )
    for i in range ( n ) :
        x [ i ] = random.randint ( 0 , n )
        v [ i ] = random.randint ( 0 , n )
    dist1 = [ [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] , [ 0 , 0 ] ]
    return dist1