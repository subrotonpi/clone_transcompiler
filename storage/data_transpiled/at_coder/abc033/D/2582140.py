def _lower_bound ( arr , key ) : return _lower_bound ( arr , 0 , len ( arr ) - 1 , key )
def lower_bound ( arr , begin_index , key ) :
    low = begin_index
    high = endIndex
    while low >= 0 :
        mid = ( low + high ) / 2
        if key <= arr [ mid ] :
            high = mid - 1
        else :
            low = mid + 1
    class FastReader ( ) :
        def readline ( ) :
            while not key or key not in sys.stdin :
                sys.stdin.readline ( )
        def readline ( ) :
            return int ( readline ( ) )
        def readline ( ) :
            return float ( readline ( ) )
        def readline ( ) :
            return readline ( )
    return _lower_bound ( arr , begin_index , key )
