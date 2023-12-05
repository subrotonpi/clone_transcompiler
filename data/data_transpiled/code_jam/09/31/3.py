def import_py3 ( ) :
    import py3
    from py3 import py3
    s = py3.Scanner ( )
    s.useDelimiter = ","
    test_cases = py3.eval ( s.readline ( ) )
    for t , inp in enumerate ( test_cases ) :
        print ( "Case #%d: %d\n" % ( t + 1 , calc ( inp ) ) )
    DIGITS = "1023456789abcdefghijklmnopqrstuvwxyz"
    def calc ( inp ) :
        if len ( inp ) == 1 :
            return 1
        d = { }
        base = 0
        for c in inp :
            if c not in d :
                base += 1
            d [ c ] = None
        idx = 0
        s = [ ]
        for c in inp :
            if d [ c ] is None :
                d [ c ] = DIGITS [ idx ]
                idx += 1
            s.append ( d [ c ] )
        if base == 1 :
            base = 2
        return int ( ''.join ( s ) , base )
    return calc
