def main ( ) :
    import sys
    from random import randint
    sc = raw_input ( "Enter a number of numbers: " )
    ans = [ ]
    N = randint ( 1 , N )
    M = randint ( 1 , M )
    for i in range ( 1 , N + 1 ) :
        if i == M :
            continue
        ans.append ( i )
    print ( ans [ 0 ] )
