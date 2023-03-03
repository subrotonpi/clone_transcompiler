def main ( ) :
    import sys
    from numpy.core import get_bitat
    with open ( '../../data/data/' , 'r' ) as sc :
        N = sc.read ( )
        K = sc.read ( )
        A = np.array ( sc.read ( ) )
        sum = 0
        for i in range ( N ) :
            A [ i ] = sc.read ( )
            sum += A [ i ]
        num_bin_digits = get_most_common ( K )
        net_gain_for_digit = [ ]
        for i in range ( num_bin_digits ) :
            one_count = 0
            zero_count = 0
            for j in range ( N ) :
                if get_bitat ( A [ j ] , i + 1 ) :
                    one_count += 1
                else :
                    zero_count += 1
            net_change = zero_count - one_count
            net_gain_for_digit.append ( net_change * pow ( 2 , i ) )
        print ( sum + get_max ( K , net_gain_for_digit , num_bin_digits - 1 , 0 , 0 ) )
    def get_max ( K , net_gain_for_digit , digit , cur_value , max ) :
        if digit < 0 :
            return max
        if net_gain_for_digit [ digit ] > 0 and cur_value + pow ( 2 , digit ) <= K :
            if cur_value + pow ( 2 , digit + 1 ) <= K :
                return get_max ( K , net_gain_for_digit , digit - 1 , cur_value + pow ( 2 , digit ) , max + net_gain_for_digit [ digit ] )
            else :
                return max ( get_max ( K , net_gain_for_digit , digit - 1 , cur_value + pow ( 2 , digit ) , max + net_gain_for_digit [ digit ] ) , max )
        else :
            return get_max ( K , net_gain_for_digit , digit - 1 , cur_value , max )
    def pow ( a , b ) :
        product = 1
        for i in range ( b ) :
            product *= a
        return product
