def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
    for i , j in enumerate ( range ( 12 ) ) :
        p , q , n , a , b , c , d , ans = [ ] , [ ] , [ ] , [ ] , [ ]
        p_x = [ ]
        p_y = [ ]
        ans = 10000000
        p , q , n = [ ] , [ ] , [ ]
        for i in range ( n ) :
            p_x.append ( sc.randint ( 0 , 1 ) )
            p_y.append ( sc.randint ( 0 , 1 ) )
        for i in range ( n ) :
            j = ( i + 1 ) if i < n - 1 else 0
            a , b = p_x [ j ] - p_x [ i ] , p_y [ j ] - p_y [ i ]
            c = math.sqrt ( a ** 2 + b ** 2 )
            d = ( a * ( q - p_y [ i ] ) + b * ( p_x [ i ] - p ) ) / c
            d = ( d >= 0 ) and d or - d
            if ans > d :
                ans = d
        print ( ans )
