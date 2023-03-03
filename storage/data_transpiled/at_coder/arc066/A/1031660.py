def __is_possible ( n , counter ) :
    import sys
    if n % 2 == 0 :
        for i in range ( 1 , n , 2 ) :
            if counter [ i ] != 2 :
                return False
        for i in range ( 0 , n , 2 ) :
            if counter [ i ] != 0 :
                return False
        return True
    else :
        if counter [ 0 ] != 1 :
            return False
        for i in range ( 1 , n , 2 ) :
            if counter [ i ] != 0 :
                return False
        for i in range ( 2 , n , 2 ) :
            if counter [ i ] != 2 :
                return False
        return True
def solve ( n , counter ) :
    if not __is_possible ( n , counter ) :
        return 0
    output = 1
    for i in range ( n // 2 ) :
        output *= 2
        output %= 1000000007
    return output
def main ( ) :
    s = raw_input ( )
    n = int ( s.strip ( ) )
    counter = [ 0 ] * n
    for i in range ( n ) :
        counter [ int ( s.strip ( ) ) ] += 1
    print ( solve ( n , counter ) )
return main
