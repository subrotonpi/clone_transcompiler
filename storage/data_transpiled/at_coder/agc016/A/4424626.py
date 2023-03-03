def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    sc = open ( 'test.txt' , 'r' )
    s = sc.read ( )
    sc.close ( )
    cnt = [ 0 ] * 26
    for c in s :
        idx = ord ( c ) - ord ( 'a' )
        cnt [ idx ] += 1
    min = 100
    for i in range ( 26 ) :
        if not cnt [ i ] :
            continue
        char = chr ( i + ord ( 'a' ) )
        t = s
        m = 0
        for i in range ( 100 ) :
            if check ( t , char ) :
                break
            w = ""
            m += 1
            for k in range ( len ( t ) - 1 ) :
                if t [ k ] == char or t [ k + 1 ] == char :
                    w += char
                else :
                    w += t [ k ]
            t = w
        min = min ( min , m )
    print ( min )
    def check ( s , char ) :
        for i in range ( len ( s ) ) :
            if char != s [ i ] :
                return False
        return True
    return check
