def main ( n , s ) :
    import sys
    if n % 2 == 0 :
        return - 1
    if n == 1 :
        if s == 'b' :
            return 0
        else :
            return - 1
    if s [ 0 ] == 'b' :
        for i in range ( 0 , n - 2 , 3 ) :
            if not s [ i : i + 3 ] == 'bca' :
                return - 1
        if s [ n - 1 ] == 'b' :
            return n // 2
    if s [ 0 ] == 'a' :
        for i in range ( 0 , n - 2 , 3 ) :
            if not s [ i : i + 3 ] == 'abc' :
                return - 1
        if s [ n - 1 ] == 'c' :
            return n // 2
    if s [ 0 ] == 'c' :
        for i in range ( 0 , n - 2 , 3 ) :
            if not s [ i : i + 3 ] == 'cab' :
                return - 1
        if s [ n - 1 ] == 'a' and s [ n - 2 ] == 'c' :
            return n // 2
    return - 1
