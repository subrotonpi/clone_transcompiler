def _import ( ) : return ''.join ( [ chr ( ord ( x ) ) for x in range ( 26 ) ] )
def main ( ) :
    if not isinstance ( sys.stdin , sys.stdin ) or not sys.stdin.isatty ( ) :
        try :
            return sys.stdin.readline ( )
        except AttributeError :
            raise
    def __next__ ( n ) :
        return int ( next ( sys.stdin ) )
    def __next__ ( n ) :
        return next ( sys.stdin )
    def __next__ ( n ) :
        return next ( sys.stdin )
    def __next__ ( n ) :
        return next ( sys.stdin )
    def __next__ ( n ) :
        return next ( sys.stdin )
    def __next__ ( n ) :
        prev = [ ]
        dp = [ ]
        for i in range ( len ( A ) - 1 , - 1 , - 1 ) :
            c = A [ i ]
            cn = c - 'a'
            min = sum ( prev [ j ] ) // 2
            for j in range ( 26 ) :
                min = min [ j ]
            dp.append ( min + 1 )
            prev [ cn ] = dp [ i ]
        ans = [ ]
        chars = set ( )
        char_dist = [ ]
        char_dist_index = [ ]
        chars.sort ( )
        for i , c in enumerate ( A ) :
            chars.add ( c )
            dist = dp [ i ]
            if char_dist [ c - 'a' ] == - 1 :
                char_dist.append ( dist )
                char_dist_index.append ( i )
            if len ( chars ) == 26 :
                for j in range ( 26 ) :
                    if char_dist [ j ] == dist :
                        a = chr ( ord ( 'a' ) + j )
                        ans.append ( a )
                        i = char_dist_index [ j ]
                        break
                chars = [ ]
                chars.sort ( )
        for i in range ( 26 ) :
            if char_dist [ i ] == - 1 :
                ans.append ( chr ( ord ( 'a' ) + i ) )
                break
        return ans
    return __next__
