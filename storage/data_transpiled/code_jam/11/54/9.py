def _ ( ) : return next ( iter ( sys.stdin.readline ( ) ) )
def solve ( ) :
    s = next ( iter ( sys.stdin.readline ( ) ) )
    s = reversed ( s )
    qcnt = 0
    for i in s :
        if i == '?' :
            qcnt += 1
    q = [ i for i in range ( qcnt ) if i == '?' ]
    res = 0
    for i in s :
        if i == '1' :
            res |= 1 << i
    for mask in range ( 1 , qcnt ) :
        cur = res
        for i in range ( qcnt ) :
            if mask & ( 1 << i ) :
                cur |= 1 << q [ i ]
        if is_square ( cur ) :
            out.write ( str ( cur ) )
            return
    sys.stderr.write ( 'NOT GOOD\n' )
    def issquare ( val ) :
        root = math.sqrt ( val )
        r = round ( root )
        while r ** 2 < val :
            r += 1
        while r ** 2 > val :
            r -= 1
        return r ** 2 == val
    def main ( ) :
        with open ( 'D-%s.in' % ( 'large' if large else 'small' ) , 'r' ) as f :
            lines = f.readlines ( )
        if lines :
            lines = lines [ : 2 ]
        else :
            lines = lines [ 1 : ]
        for i in range ( 1 , T + 1 ) :
            out.write ( 'Case #%d: ' % i )
            solve ( )
        out.close ( )
    return ''
