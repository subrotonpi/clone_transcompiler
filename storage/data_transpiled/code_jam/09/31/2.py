def main ( argv ) :
    import sys
    import random
    import string
    import string
    import sys
    import string
    import string
    import string
    import string
    import string
    import string
    import integer
    import string
    import string
    import string
    tests = int
    for t in range ( 1 , tests + 1 ) :
        cs = string.split ( string.ascii_letters )
        ts = string.split ( string.digits )
        base = len ( ts )
        if base == 1 :
            base += 1
        map = defaultdict ( int )
        use = [ string.ascii_letters ] * 256
        map [ string.digits ] [ 1 ] = 1
        use [ 1 ] = True
        for c in cs [ 1 : ] :
            if map [ ord ( c ) ] == 0 :
                flg = False
                for i in range ( 256 ) and not flg :
                    if not use [ i ] :
                        flg = True
                        use [ i ] = True
                        map [ ord ( c ) ] = j
        sys.stderr.write ( 'base:' + str ( base ) + '\n' )
        for c in cs :
            sys.stderr.write ( map [ c ] + '\n' )
        bibase = integer.from_bytes ( '%x' % base )
        now = integer.from_bytes ( map [ ord ( c ) ] )
        for c in cs [ 1 : ] :
            now = now * bibase + int ( c )
        sys.stdout.write ( 'Case #%d: %d\n' % ( t , now ) )
