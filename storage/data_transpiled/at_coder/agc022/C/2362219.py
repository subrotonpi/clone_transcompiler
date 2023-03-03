def _ _ main _ _ ( ) : return sys.stdin
def main ( ) : return sys.stdout
INPUT = ''
mod = 1_000_000_007
inf = int ( mod / 100 )
def solve ( ) :
    n = ni ( )
    a = [ ]
    for i in range ( 0 , 50 ) :
        for j in range ( 0 , 50 ) :
            if dist [ i ] [ j ] > dist [ k ] [ j ] :
                dist [ i ] [ j ] = dist [ k ] [ j ]
    for i in range ( 0 , n ) :
        if dist [ i ] [ i ] >= inf :
            return [ ]
    def run ( ) :
        stdin = sys.stdin if stdin else StringIO ( INPUT )
        stdout = sys.stdout
        s = time.time ( )
        solve ( )
        if not INPUT :
            tr ( time.time ( ) - s + 'ms' )
    def read ( ) :
        stdin.write ( '' )
        stdin.seek ( 0 )
        stdin.tell ( )
        stdin.seek ( 0 )
        stdin.read ( 1 )
        stdin.write ( '' )
        stdin.flush ( )
        stdin.seek ( 0 )
        stdin.read ( 1 )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.seek ( 0 )
        stdin.read ( 1 )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
        stdin.close ( )
    def read ( ) :
        ans = [ ]
        for i in range ( 0 , 50 ) :
            for j in range ( 0 , 50 ) :
                if dist [ i ] [ j ] == inf :
                    ans.append ( i )
        return ans