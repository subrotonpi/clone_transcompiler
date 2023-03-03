def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.ABCD = ( sys.stdin.read ( ) )
    A = [ ABCD // 1000 , ABCD % 1000 // 100 , ABCD % 100 // 10 , ABCD % 10 ]
    plus = [ False ] * 3
    for i in range ( 1 << 3 ) :
        sum = A [ 0 ]
        for j in range ( 3 ) :
            plus [ j ] = False
        for j in range ( 3 ) :
            if ( 1 & ( i >> j ) ) == 1 :
                sum += A [ j + 1 ]
                plus [ j ] = True
            else :
                sum -= A [ j + 1 ]
        if sum == 7 :
            break
    print ( A [ 0 ] , end = ' ' )
    for i in range ( 3 ) :
        print ( '+' if plus [ i ] else '-' , end = ' ' )
        print ( A [ i + 1 ] , end = ' ' )
    print ( '=' * 7 )
