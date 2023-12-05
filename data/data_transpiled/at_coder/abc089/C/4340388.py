def import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.n = sc.__next__ ( )
        ar = [ 0 ] * 5
        for s in sc.split ( ) :
            if s [ 0 ] == 'M' :
                ar [ 0 ] += 1
            elif s [ 0 ] == 'A' :
                ar [ 1 ] += 1
            elif s [ 0 ] == 'R' :
                ar [ 2 ] += 1
            elif s [ 0 ] == 'C' :
                ar [ 3 ] += 1
            elif s [ 0 ] == 'H' :
                ar [ 4 ] += 1
    ans = 0
    for i in range ( pow ( 2 , 5 ) ) :
        s = str ( int ( i ) )
        bit_num = 0
        for j in s :
            if j == '1' :
                bit_num += 1
        if bit_num != 3 :
            continue
        temp = 1
        for j in range ( 5 ) :
            if ( 1 & i >> j ) == 1 :
                temp *= ar [ j ]
        ans += temp
    print ( ans )
