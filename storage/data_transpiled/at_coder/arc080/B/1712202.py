def _import ( ) : return _grid_coloring ( )
def sieve ( max ) :
    def next ( ) :
        is_composite = [ False ] * ( max + 1 )
        for i in range ( 2 , max + 1 ) :
            if not is_composite [ i ] :
                for j in range ( i * i , max + 1 , i ) :
                    is_composite [ j ] = True
            for i in range ( 2 , max + 1 ) :
                if not is_composite [ i ] :
                    print ( i , end = " " )
        return next ( )
    def grid_coloring ( ) :
        reader = _reader ( )
        height , width , num = reader.__next__ ( )
        color_nums = [ ]
        for i in range ( num ) :
            color_nums.append ( reader.__next__ ( ) )
        solution = [ ]
        r , c , color = 0 , 1
        for j in range ( height * width ) :
            r = j // width
            c = ( j - j // width * width ) if r % 2 == 0 else width - ( j - j // width * width ) - 1
            if color_nums [ color - 1 ] <= 0 :
                color += 1
            solution.append ( [ c , color ] )
            color_nums [ color - 1 ] -= 1
        for j in range ( height ) :
            for k in range ( width ) :
                print ( solution [ j ] [ k ] , end = " " )
        print ( )
    def sim_arrays ( ) :
        reader = _reader ( )
        n = reader.__next__ ( )
        res = 1
        res = exponential ( 3 , n )
        arr = [ ]
        for j in range ( n ) :
            arr.append ( reader.__next__ ( ) )
        oddways = 1
        for j in range ( n ) :
            if arr [ j ] % 2 == 0 :
                oddways *= 2
        print ( res - oddways )
    return res
