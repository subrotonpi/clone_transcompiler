def main ( ) :
    import string
    import sys
    from itertools import repeat
    from itertools import chain
    n = int ( sys.stdin.readline ( ) )
    ss = [ next ( iter ( sys.stdin.readline ( ) ) ) for _ in range ( n ) ]
    ans = ss [ 0 ]
    for s in ss :
        ans = same ( ans , s )
    ch = ans.split ( )
    ch.sort ( )
    print ( ''.join ( ch ) )
    def same ( s1 , s2 ) :
        ans = ''
        for i in range ( 26 ) :
            c1 , c2 = 0 , 0
            for c in s1 :
                if c == 'a' + str ( i ) : c1 += 1
            for c in s2 :
                if c == 'a' + str ( i ) : c2 += 1
            for i in range ( min ( c1 , c2 ) ) :
                ans += chr ( ord ( 'a' + str ( i ) ) )
        return ans
    return same
