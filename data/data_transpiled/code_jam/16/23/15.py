def test_solve ( ) :
    import locale
    import sys
    from locale import locale
    for test in range ( 1 , tn + 1 ) :
        en = locale.getlocale ( ) [ test ]
        words = [ ]
        first = { }
        second = { }
        cur_first = 0
        cur_second = 0
        for word in words :
            if word [ 0 ] not in first :
                first [ word [ 0 ] ] = cur_first
                cur_first += 1
            word = word [ 1 ]
            if word [ 1 ] not in second :
                second [ word [ 1 ] ] = cur_second
                cur_second += 1
        m , n = len ( first ) , len ( second )
        e = [ [ ] for _ in range ( m ) ]
        for word in first [ words [ 0 ] ] :
            e [ word [ 0 ] ] += second [ words [ word [ 1 ] ] ]
        r = m
        up = [ - 1 ] * n
        for i in range ( m ) :
            dfs ( i , [ ] , up , e )
        for i in range ( n ) :
            if up [ i ] < 0 :
                r += 1
        print ( "Case #%d: %d" % ( test , en - r ) )
    def dfs ( v , g , up , e ) :
        if g [ v ] :
            return False
        g [ v ] = True
        for to in e [ v ] :
            if up [ to ] or dfs ( up [ to ] , g , up , e ) :
                up [ to ] = True
                return True
        return False
    print ( "Case #%d: %d" % ( test , en - r ) )
