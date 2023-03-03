def _import ( ) : return int ( next ( ) )
def solve ( ) :
    if ask ( long ( 1e12 ) ) :
        for i in range ( 0 , 10 ) :
            ans = long ( pow ( 10 , i ) + 1 )
            if ask ( ans ) :
                answer ( ans - 1 )
                return
        raise AssertionError
    for args in range ( 10 , - 1 , - 1 ) :
        out.write ( "? 1" )
        for i in args :
            out.write ( '0' )
        out.write ( "\n" )
        out.flush ( )
        res = get ( )
        if res :
            go ( args + 1 )
            return
    def go ( i ) :
        left , right = long ( pow ( 10 , i ) - 1 ) , long ( pow ( 10 , i ) - 1 )
        left -= 1
        right += 1
        while left < right - 1 :
            mid = ( left + right ) >> 1
            out.write ( "? %s%s" % ( mid , '0' ) )
            out.flush ( )
            if get ( ) :
                right = mid
            else :
                left = mid
        answer ( right )
    ask ( long ( x ) )
    out.write ( "? %s" % x )
    out.flush ( )
    return get ( )
def get ( ) :
    res = raw_input ( ).lower ( )
    return res == 'Y'
global infile
global outfile
infile = open ( 'infile' , 'r' )
outfile = open ( 'outfile' , 'w' )
solve ( )
outfile.close ( )
