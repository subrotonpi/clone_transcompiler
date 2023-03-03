def main ( args ) :
    import sys
    from itertools import count
    f = open ( args [ 0 ] )
    T = int ( f.readline ( ) )
    for t in range ( 1 , T + 1 ) :
        n = int ( f.readline ( ) )
        if n == 0 :
            sys.stdout.write ( "Case #%d: INSOMNIA\n" % t )
            continue
        rem0 , cnt = 0 , 0
        seen = [ False ] * 10
        while n % 10 == 0 :
            rem0 += 1
            n //= 10
            seen [ 0 ] = True
            cnt = 1
        cur = n
        while cnt < 10 :
            tmp = cur
            while tmp > 0 :
                d = tmp % 10
                if not seen [ d ] :
                    seen [ d ] = True
                    cnt += 1
                tmp //= 10
            if cnt < 10 :
                cur += n
        sys.stdout.write ( "Case #%d: %d\n" % ( t , cur ) )
        while rem0 :
            sys.stdout.write ( "0" )
        sys.stdout.write ( "\n" )
        sys.stdout.flush ( )
