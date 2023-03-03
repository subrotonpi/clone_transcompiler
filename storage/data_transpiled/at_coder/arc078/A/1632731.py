def __solve ( f ) :
    from math import sin , cos , log
    N = int ( f.readline ( ) )
    a = __line_to_nums ( f.readline ( ) )
    sum_all = sum ( a )
    x_sum = [ ]
    y_sum = [ ]
    x_sum.append ( a [ 0 ] )
    y_sum.append ( sum_all - x_sum [ 0 ] )
    ret = abs ( x_sum [ 0 ] - y_sum [ 0 ] )
    for i in range ( 1 , N - 1 ) :
        x_sum.append ( x_sum [ i - 1 ] + a [ i ] )
        y_sum.append ( sum_all - x_sum [ i ] )
        ret = min ( ret , abs ( x_sum [ i ] - y_sum [ i ] ) )
    return ret
    ex1 = '6\n' + '1 2 3 4 5 6'
    ex2 = '2\n' + '10 -10'
    def main ( ) :
        print ( solve ( open ( '/dev/null' ) ) )
    def line_to_nums ( line ) :
        str_nums = line.split ( )
        ret = [ ]
        for num in str_nums :
            ret.append ( int ( num ) )
        return ret
    return main
