def main ( ) :
    import sys
    from time import sleep
    from time import sleep
    from os.path import join
    from os import sep
    from os import chdir
    n = int ( sys.argv [ 1 ] )
    plot = [ 0 for _ in range ( 1000 ) ]
    for i in range ( n ) :
        base_time = join ( sys.argv [ 1 ] , '-' )
        times = base_time.split ( '-' )
        start_time = int ( times [ 0 ] )
        end_time = int ( times [ 1 ] )
        start = start_time - ( start_time % 5 )
        end = end_time + ( 5 - ( end_time % 5 ) == 5 )
        if end % 100 > 59 :
            end += 100 - 60 + ( end % 100 - 60 )
        start_index = start // 5
        end_index = end // 5
        for i in range ( start_index , end_index ) :
            plot [ i ] = 1
    start_flag = False
    for i in range ( len ( plot ) ) :
        if not start_flag :
            if plot [ i ] == 1 :
                print ( '%04d' % ( ( i * 5 ) ) , end = '-' )
                start_flag = True
        else :
            if plot [ i ] == 0 :
                print ( '%04d' % ( ( i * 5 ) ) )
                start_flag = False
