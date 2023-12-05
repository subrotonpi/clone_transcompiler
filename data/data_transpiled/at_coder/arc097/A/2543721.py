def main ( args ) :
    from sys import stdin
    rep = 1
    if len ( args ) > 1 :
        rep = int ( args [ 1 ] )
    ( )
    def __solve ( rep ) :
        with stdin.open ( ) as cin :
            for i in range ( rep ) :
                __solve ( cin )
    def solve ( s , K ) :
        N = len ( s )
        array = [ s [ i : i + K ] for i in range ( N ) ]
        array.sort ( )
        ans = None
        solve ( 0 , 0 , N , array , 0 , K )
        print ( ans )
    ans = None
    solve ( depth , start , end , array , total , K )
    if ans is not None :
        return - 1
    if len ( array [ start ] ) == depth :
        start += 1
    while start < end :
        c = array [ start ] [ depth ]
        next = start + 1
        for next in range ( end ) :
            if array [ next ] [ depth ] != c :
                break
        total += 1
        if total == K :
            ans = array [ start ] [ : depth + 1 ]
            return - 1
        total = solve ( depth + 1 , start , next , array , total , K )
        start = next
    return total
