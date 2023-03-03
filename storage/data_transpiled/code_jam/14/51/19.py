def main ( args ) :
    from time import sleep
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve = lambda self : self.solve ( )
        def solve ( self , N , a , b , c , d ) :
            with cin ( ) as s :
                T = s.__next__ ( )
                for C in range ( 1 , T + 1 ) :
                    N , a , b , c , d = s.__next__ ( )
                    print ( "Case #%d: %s" % ( C , solve ( N , a , b , c , d ) ) )
        def solve ( self , N , a , b , c , d ) :
            arr = [ ]
            sum = 0
            for i in range ( N ) :
                arr.append ( int ( ( i * a + b ) % c + d ) )
                sum += arr [ i ]
    def solve ( self , N , a , b , c , d ) :
        arr = [ ]
        sum = 0
        for i in range ( N ) :
            arr.append ( int ( ( i * a + b ) % c + d ) )
            sum += arr [ i ]
    LS = [ ]
    RS = [ ]
    for i in range ( N ) :
        LS.append ( arr [ i ] + ( i > 0 ) )
        RS.append ( arr [ N - i - 1 ] + ( i > 0 ) )
    LO = HI = sum
    pow2 = 1
    while pow2 * 2 <= N :
        pow2 *= 2
    while LO + 1 < HI :
        MI = ( LO + HI ) / 2
        if possible ( MI , N , pow2 , LS , RS , sum ) :
            HI = MI
        else :
            LO = MI
    return float ( sum - HI ) / sum
def possible ( self , req , N , pow2 , LS , RS , sum ) :
    L = getMax ( LS , N , pow2 , req )
    R = getMax ( RS , N , pow2 , req )
    return ( sum - L - R ) <= req
getMax ( arr , N , pow2 , req )
return 0
