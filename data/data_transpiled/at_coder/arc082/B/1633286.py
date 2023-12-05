def _import ( ) :
    from math import sin , cos , exp
    N = int ( sys.stdin.readline ( ) )
    nums = line_to_int_nums ( sys.stdin.readline ( ) )
    for i in range ( N ) :
        nums [ i ] -= 1
    ret = 0
    for i in range ( N ) :
        if nums [ i ] == i :
            if i == N - 1 :
                swap ( i - 1 , i , nums )
            else :
                swap ( i , i + 1 , nums )
            ret += 1
    def swap ( i , j , nums ) :
        tmp = nums [ i ]
        nums [ i ] = nums [ j ]
        nums [ j ] = tmp
    ex1 = '5\n' + '1 4 3 5 2'
    ex2 = '2\n' + '1 2'
    ex3 = '2\n' + '2 1'
    ex4 = '9\n' + '1 2 4 9 5 8 7 3 6'
    def main ( ) :
        print ( solve ( open ( '/dev/null' ) ) )
    def line_to_int_nums ( line ) :
        str_nums = line.split ( )
        ret = [ int ( i ) for i in str_nums ]
        return ret
    def line_to_long_nums ( line ) :
        str_nums = line.split ( )
        ret = [ long ( i ) for i in str_nums ]
        return ret
    return main
