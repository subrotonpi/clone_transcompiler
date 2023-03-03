def main ( ) :
    import math
    from os import path
    sc = open ( path.join ( path.dirname ( __file__ ) , '..' ) )
    n = int ( sc.read ( ) )
    upper = 1000000
    a = [ i for i in range ( 2 , upper + 1 ) ]
    for i in range ( 2 , math.sqrt ( upper ) + 1 ) :
        for j in range ( i + i , upper + 1 , i ) :
            a [ j ] = 0
    sum = 0
    for i in range ( 1 , n + 1 ) :
        sum += i
    if a [ sum ] == 0 :
        print ( 'BOWWOW' )
    else :
        print ( 'WANWAN' )
