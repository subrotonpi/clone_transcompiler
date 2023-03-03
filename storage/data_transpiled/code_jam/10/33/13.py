def test_cut ( a , b , size ) :
    import os
    import sys
    import os
    import sys
    class MakeingChessBoard ( board ) :
        def main ( self ) :
            f = open ( sys.argv [ 1 ] , 'r' )
            out = open ( sys.argv [ 2 ] , 'w' )
            case_count = int ( f.readline ( ) )
            for i in range ( 1 , case_count + 1 ) :
                if bark [ i ] [ b ] == - 1 :
                    return False
                start1 = ( start1 + 1 ) % 2
            for j in range ( b , size + 1 ) :
                if bark [ i ] [ j ] == - 1 :
                    return False
                if j == b :
                    start2 = start1
                else :
                    if bark [ i ] [ j ] != ( start2 + 1 ) :
                        return False
                    start2 = ( start2 + 1 ) % 2
            return True
        def remove_bark ( self , a , b , size ) :
            for i in range ( a , size + 1 ) :
                temp = f.readline ( ).strip ( ).split ( )
                M = int ( temp [ 0 ] )
                N = int ( temp [ 1 ] )
                bark [ i ] = - 1
    def remove_bark ( self , a , b , size ) :
        for i in range ( b , size + 1 ) :
            temp = f.readline ( ).strip ( ).split ( )
            for jj in range ( N // 4 ) :
                tttt = int ( line [ jj : jj + 1 ] , 16 )
                test = tttt & 8
                bark [ ii ] [ jj * 4 + 0 ] = ( tttt & 8 ) / 8
                bark [ ii ] [ jj * 4 + 1 ] = ( tttt & 4 ) / 4
                bark [ ii ] [ jj * 4 + 2 ] = ( tttt & 2 ) / 2
                bark [ ii ] [ jj * 4 + 3 ] = tttt & 1
    MaxSize = min ( M , N )
    result = [ ]
    for ii in range ( MaxSize ) :
        for iii in range ( M - ii + 1