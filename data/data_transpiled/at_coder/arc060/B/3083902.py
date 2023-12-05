def _import ( ) :
    from math import sqrt
    from math import sin , cos
    from math import sin
    from math import cos
    class Main ( object ) :
        def givenFunc ( b , n ) :
            if b <= 1 : return - 1
            if n < b : return n
            else : return givenFunc ( b , n // b ) + n % b
    def solve ( N , S ) :
        for b in range ( 2 , 2 * N + 1 ) :
            if givenFunc ( b , N ) == S : return b
        for p in range ( int ( sqrt ( N ) + 1 ) , 1 , - 1 ) :
            b = 1 + ( N - S ) / p
            if givenFunc ( b , N ) == S : return b
        return N , N + 1
    def main ( ) :
        with open ( "../../../../" , "r" ) as sc :
            N , S = sc.read ( ).split ( )
            print ( solve ( N , S ) )
    return Main ( )
