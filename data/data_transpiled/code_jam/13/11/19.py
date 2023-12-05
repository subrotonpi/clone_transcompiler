def _import ( ) : return 2 * x * n + 2 * n * n - n
def cs ( n ) : return 2 * x * n + 2 * n * n - n
def main ( ) :
    s = raw_input ( )
    tc = s.count ( )
    for tt in range ( 1 , tc + 1 ) :
        x = int ( s.next ( ) )
        t = int ( s.next ( ) )
        ok = 0
        notok = 10000000000L
        while notok > ok + 1 :
            mid = ok + notok // 2
            if cs ( mid ) <= t :
                ok = mid
            else :
                notok = mid
        print ( "Case #{}: {}".format ( tt , ok ) )
