def main ( ) :
    import string
    from itertools import count
    t = int ( count ( 'a' ) )
    for x in range ( 1 , t + 1 ) :
        n = str ( count ( 'a' ) ).split ( '' )
        for i in range ( 0 , len ( n ) ) :
            if n [ i ] > n [ i + 1 ] :
                while i > 0 and n [ i - 1 ] == n [ i ] :
                    i -= 1
                n [ i ] -= 1
                while 1 :
                    n [ i ] = '9'
        y = ''.join ( n [ 1 : ] )
        print ( 'Case #{}: {}'.format ( x , y ) )
