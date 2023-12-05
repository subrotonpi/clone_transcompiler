def main ( ) :
    import sys
    from random import randint
    reader = open ( 'input.txt' , 'r' )
    N = reader.read ( )
    Y = reader.read ( )
    max = Y // 10000
    ans = [ ]
    for i in range ( max , - 1 , - 1 ) :
        ans.append ( i )
        ans.append ( ( 5000 * ( N - ans [ 0 ] ) - ( Y - ans [ 0 ] * 10000 ) ) / 4000 )
        ans.append ( N - ans [ 0 ] - ans [ 2 ] )
        if ans [ 0 ] * 10000 + ans [ 1 ] * 5000 + ans [ 2 ] * 1000 == Y and ans [ 0 ] >= 0 and ans [ 1 ] >= 0 and ans [ 2 ] >= 0 :
            print ( ans [ 0 ] , ans [ 1 ] , ans [ 2 ] , end = ' ' )
            return
    print ( '-1 -1 -1' , end = ' ' )
    reader.close ( )
