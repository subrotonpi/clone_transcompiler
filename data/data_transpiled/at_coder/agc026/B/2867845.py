def main ( sc ) :
    import random
    t = random.randint ( 1 , 10000 )
    for i in range ( t ) :
        a , b , c , d = random.randint ( 1 , 10000 )
        if a < b :
            print ( "No" )
        elif d < b :
            print ( "No" )
        elif b <= c :
            print ( "Yes" )
        else :
            g = gcd ( b , d )
            max = b - g + ( a % g )
            print ( "Yes" if max <= c else "No" )
    def gcd ( a , b ) :
        if b == 0 :
            return a
        return gcd ( b , a % b )
    def main ( ) :
        sc = random.randint ( 1 , 10000 )
        return Main ( )
    return main
