def main ( ) :
    import queue
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            r = sc.randint ( 0 , c )
            c = sc.randint ( 0 , c )
            tmp_r = sc.randint ( 0 , c ) - 1
            tmp_s = sc.randint ( 0 , c ) - 1
            if self.bfs [ gy ] != 0 :
                print ( self.bfs [ gy ] [ gx ] )
                return
    if self.bfs [ '' ] [ '' ] :
        map = [ [ ] for _ in range ( r ) ]
        bfs = [ [ ] for _ in range ( r ) ]
        bfs [ '' ] [ tmp_r ] [ tmp_s ] = 1
        for i in range ( r ) :
            input_tmp = sc.next ( )
            for j in range ( c ) :
                map [ i ] [ j ] = input_tmp [ j ] == '.'
        nums = queue.Queue ( )
        nums.put ( tmp_r * c + tmp_s )
        while True :
            nums = queue.Queue ( )
            for i in range ( len ( nums ) ) :
                tmp_r = nums.peek ( ) // c
                tmp_s = nums.poll ( ) % c
                if tmp_r != 0 and map [ tmp_r - 1 ] [ tmp_s ] and bfs [ tmp_r - 1 ] [ tmp_s ] == 0 :
                    bfs [ tmp_r - 1 ] [ tmp_s ] = bfs [ tmp_r ] [ tmp_s ] + 1
                    nums.put ( c * ( tmp_r - 1 ) + tmp_s )
                if tmp_s != 0 and map [ tmp_r ] [ tmp_s - 1 ] and bfs [ tmp_r ] [ tmp_s + 1 ] == 0 :
                    bfs [ tmp_r ] [ tmp_s - 1 ] = bfs [ tmp_r ] [ tmp_s ] + 1
                    nums.put ( c * ( tmp_r ) + tmp_s - 1 )
                if tmp_r != r - 1 and map [ tmp_r + 1 ] [ tmp_s ] and bfs [ tmp_r + 1 ] [ tmp_s ] == 0 :
                    bfs [ tmp_r + 1 ] [ tmp_s ] = bfs [ tmp_r ] [ tmp_@@