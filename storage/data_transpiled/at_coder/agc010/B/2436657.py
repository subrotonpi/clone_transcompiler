def main ( ) :
    import sys
    from itertools import repeat
    n = len ( sys.stdin.readline ( ) )
    a = repeat ( n )
    print ( 'YES' if check ( a ) else 'NO' )
    def check ( a ) :
        n = len ( a )
        sum = sum ( a )
        if sum % ( long ( n ) * ( n + 1 ) / 2 ) != 0 :
            return False
        else :
            step = sum / ( long ( n ) * ( n + 1 ) / 2 )
            count = 0
            for i in range ( n - 1 ) :
                if ( a [ i ] - a [ i + 1 ] + step ) % n != 0 or a [ i ] - a [ i + 1 ] + step < 0 :
                    return False
                count += ( a [ i ] - a [ i + 1 ] + step ) / n
            if ( a [ n - 1 ] - a [ 0 ] + step ) % n != 0 or a [ n - 1 ] - a [ 0 ] + step < 0 :
                return False
            else :
                count += ( a [ n - 1 ] - a [ 0 ] + step ) / n
            return count == step
    return check
