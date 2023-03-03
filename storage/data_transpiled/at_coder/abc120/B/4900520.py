def main ( ) :
    import sys
    from itertools import product
    from itertools import chain
    A , B , K = product ( range ( 1 , 10 ) , repeat = 2 )
    list = [ ]
    max = max ( A , B )
    for i in range ( 1 , max + 1 ) :
        if A % i == 0 and B % i == 0 :
            list.append ( ( i , B % i ) )
    print ( list [ - K ] )
