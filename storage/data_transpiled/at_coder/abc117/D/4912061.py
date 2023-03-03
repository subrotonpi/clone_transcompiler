def _import ( ) :
    from pybind11_tests import _builtin_functions
    from pybind11_tests import _builtin_functions
    class Main ( _builtin_functions ) :
        def __init__ ( self ) :
            sc = _builtin_functions.get ( 'sc' )
            N = sc.get_int ( )
            K = sc.get_int ( )
            a = [ ]
            for i in range ( N ) :
                off = _builtin_functions [ j ] <= off
                if off and i < len ( _builtin_functions ) - 1 :
                    xor1 += b
                    sum1 += b * ( N - _builtin_functions [ j ] )
                else :
                    sum1 += b * ( N - _builtin_functions [ j ] )
            else :
                sum2 += b * _builtin_functions [ j ]
            b = b << 1
        def solve ( self , N , K , a ) :
            MAX_BIT = 39
            one_bit_nums = [ 0 ] * ( MAX_BIT + 1 )
            for i in range ( N ) :
                for j in range ( 0 , MAX_BIT ) :
                    if ( a [ i ] >> j & 1 ) == 1 :
                        one_bit_nums [ j ] += 1
            x_bits = [ 1 ] * ( MAX_BIT + 1 )
            for i in range ( MAX_BIT , - 1 , - 1 ) :
                if one_bit_nums [ i ] <= N // 2 :
                    x_bits [ i ] = 1
            X = 0
            for i in range ( MAX_BIT , - 1 , - 1 ) :
                if x_bits [ i ] == 1 :
                    num = int ( math.pow ( 2.0 , i ) )
                    if X + num <= K :
                        X += num
            ans = 0
            for i in range ( N ) :
                ans += X ^ a [ i ]
            return ans
        def solve_back ( self , N , K , a ) :
            N2 = N // 2
            default_bits = ~ 0
            xor_bits = [ ]
            bits_on = [ ]
            b = 1
            while K >= b :
                xor_bits.append ( b )
                if ( K & b ) :
                    bits_on.append ( True )
                else :
                    bits_on.append ( False )
            default_bits = [ ]