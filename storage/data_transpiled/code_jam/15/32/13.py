def import _main
class B ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        t = int ( sys.stdin.readline ( ).strip ( ) )
        for test in range ( 1 , t + 1 ) :
            k , l , s = _main ( self )
            keyboard = raw_input ( )
            target = raw_input ( )
            print ( "Case #%d: %.10f\n" % ( test , solve ( keyboard , target , s ) ) )
    def solve ( keyboard , target , s ) :
        dp = [ [ 1.0 ] * len ( target ) for _ in range ( 1 , s + 1 ) ]
        precalc = [ [ ] * len ( keyboard ) for _ in range ( 1 , s + 1 ) ]
        max_save = 0
        for cur_match_len in range ( 0 , len ( target ) ) :
            for keyboard_idx in range ( len ( keyboard ) ) :
                word = target [ : cur_match_len ]
                word += keyboard [ keyboard_idx ]
                for result_len in range ( len ( word ) ) :
                    if target.startswith ( word [ - result_len : ] ) :
                        precalc [ cur_match_len ] [ keyboard_idx ] = result_len
                        if cur_match_len == len ( target ) :
                            max_save = max ( max_save , result_len )
                        break
        extra_to_type = len ( target ) - max_save + 1
        max_banana = 1 + ( s - len ( target ) ) / extra_to_type
        if extra_to_type > len ( target ) :
            max_banana = 0
        multiplier = 1.0 / len ( keyboard )
        for curChar in range ( 1 , s + 1 ) :
            for cur_match_len in range ( 0 , len ( target ) ) :
                for keyboard_idx in range ( 0 , len ( keyboard ) ) :
                    for keyboard_idx in range ( 0 , len ( keyboard ) ) :
                        if keyboard [ keyboard_idx ] == curChar :
                            precalc [ cur_match_len ] [ keyboard_idx ] += precalc [ cur_match_len ] [ curChar ] * multiplier
        return total_banana
return B
