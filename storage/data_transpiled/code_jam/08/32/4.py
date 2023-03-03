def import import _readline , _readline , _readline , _b , t , debug = False
def main ( ) :
    with _readline ( ) as fin :
        nt , it , debug = fin.next ( ) , 0
        for it in range ( 1 , nt + 1 ) :
            s = fin.next ( )
            d = _readline ( )
            r = _readline ( )
            n , i , j , k , m2 , m3 , m5 , m7 , i2 , i3 , i5 , i7 = s.split ( )
            for i in range ( 0 , n ) :
                for i2 in range ( 2 , 3 ) :
                    for i3 in range ( 3 , 5 ) :
                        for i7 in range ( 7 , 7 ) :
                            d [ i ] [ i2 ] [ i3 ] [ i5 ] [ i7 ] = _readline ( )
            d [ 0 ] [ 0 ] [ 0 ] = _readline ( )
            for i in range ( 1 , n + 1 ) :
                for j in range ( 1 , i + 1 ) :
                    t = _readline ( )
                    for k in range ( 1 , ( - 1 , - 1 ) + 1 ) :
                        if debug : print ( t )
                        m2 = ( t % { 's' : '2' } ) [ 0 ]
                        m3 = ( t % { 's' : '3' } ) [ 0 ]
                        m5 = ( t % { 's' : '5' } ) [ 0 ]
                        m7 = ( t % { 's' : '7' } ) [ 0 ]
                        for i2 in range ( 2 , 3 ) :
                            for i3 in range ( 3 , 5 ) :
                                for i7 in range ( 7 , 7 ) :
                                    d [ i ] [ ( i2 + m2 + 2 ) % 2 ] [ ( i3 + m3 ) % 3 ] [ ( i5 + m5 + 5 ) % 5 ] [ ( i7 + m7 ) % 7 ] [ i ] [ j ] [ i3 ] [ i7 ] = _readline ( )
