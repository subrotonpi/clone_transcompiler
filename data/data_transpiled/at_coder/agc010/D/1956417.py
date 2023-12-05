def main ( ) :
    n = ni ( )
    a = na ( n )
    flg = False
    while True :
        odd = 0
        even = 0
        oddidx = 0
        for i in range ( n ) :
            if a [ i ] % 2 == 0 :
                even += 1
            else :
                odd += 1
                oddidx = i
        if even % 2 == 1 :
            print ( flg and "Second" or "First" )
            return table
        elif odd != 1 or a [ oddidx ] == 1 :
            print ( flg and "First" or "Second" )
            return table
        else :
            a [ oddidx ] -= 1
            g = a [ 0 ]
            for i in range ( n ) :
                g = gcd ( a [ i ] , g )
            for i in range ( n ) :
                a [ i ] /= g
        flg = not flg
    def main ( ) :
        with None , lambda : sys.stdin.readline ( )
        start = time.time ( )
        debug = sys.argv [ 1 ] if debug else None
        if debug :
            with _open ( _sys.argv [ 1 ] , 'r' ) as f :
                return f.read ( )
        sys.stdout.flush ( )
        tr ( ( time.time ( ) - start ) + "ms" )
    def read ( ) :
        while not sys.stdin.readline ( ) or not sys.stdin.readline ( ) :
            try :
                sys.stdin.readline ( )
            except :
                sys.stdout.write ( _sys.stderr.read ( ) )
        return sys.stdin.readline ( )
    def read ( ) :
        return int ( read ( ) )
    def write ( ) :
        sys.stdout.write ( _sys.stdout.read ( ) )
