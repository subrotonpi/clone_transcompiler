def main ( ) :
    n = ni ( ) - 1
    a = nl ( )
    b = nl ( )
    c = nl ( )
    d = nl ( )
    for k in range ( 0 , n ) :
        min = a + k * c - ( n - k ) * d
        max = a + k * d - ( n - k ) * c
        if min <= b <= max :
            print ( "YES" )
            return
    print ( "NO" )
    def main ( ) :
        with open ( sys.argv [ 1 ] , "r" ) as f :
            start = time.time ( )
            debug = sys.argv [ 2 ] if len ( sys.argv ) > 2 else None
            if debug :
                with _open ( sys.argv [ 1 ] , "r" ) as f :
                    f.write ( _sys.stdin.read ( ) )
            f.seek ( 0 )
            f.truncate ( )
            solve ( )
            f.flush ( )
            tr ( ( time.time ( ) - start ) + "ms" )
    def main ( ) :
        with open ( sys.argv [ 1 ] , "w" ) as f :
            f.write ( _sys.stdout.read ( ) )
    def main ( ) :
        with open ( sys.argv [ 1 ] , "r" ) as f :
            f.write ( _sys.stdin.read ( ) )
    def main ( ) :
        with open ( sys.argv [ 1 ] , "r" ) as f :
            f.write ( _sys.stdout.read ( ) )
    def main ( ) :
        with open ( sys.argv [ 1 ] , "r" ) as f :
            f.write ( _sys.stdin.read ( ) )
    def main ( ) :
        with open ( sys.argv [ 1 ] , "r" ) as f :
            f.write ( _sys.stdin.read ( ) )
    def main ( ) :
        with open ( sys.argv [ 1 ] , "r" ) as f :
            f.write ( _sys.stdin.read ( ) )
