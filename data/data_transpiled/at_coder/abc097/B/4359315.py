def main ( ) :
    import sys
    from os import urandom
    x = urandom ( 1024 )
    max = 1
    for i in range ( 2 , x + 1 ) :
        tmp = i ** 2
        while tmp <= x :
            if tmp > max :
                max = tmp
            tmp *= i
    print ( max )
    os.system ( ' '.join ( [ str ( x ) for x in range ( 2 , x + 1 ) ] ) )
