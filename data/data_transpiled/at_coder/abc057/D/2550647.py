def _import ( ) :
    from itertools import count , repeat
    from itertools import chain
    from itertools import chain
    from itertools import count
    n = count ( )
    a = count ( )
    b = count ( )
    v = chain ( [ next ( iter ( v ) ) for i in range ( n ) ] , repeat ( ) )
    v = [ next ( iter ( v ) ) for i in range ( n ) ]
    sum = [ v [ 0 ] ]
    for i in range ( 1 , n ) :
        sum.append ( sum [ i - 1 ] + v [ i ] )
    d = [ ( v [ i ] , v [ i ] ) for i in chain ( v , repeat ( ) ) ]
    max = select = 1
    cnt = 0
    for i in range ( a , b + 1 ) :
        if max * i <= sum [ i - 1 ] * select :
            if max * i == sum [ i - 1 ] * select :
                cnt += calc ( i , v , d )
            else :
                cnt = calc ( i , v , d )
            max = sum [ i - 1 ]
            select = i
    print ( '%f' % ( max * 1.0 / select ) )
    print ( cnt )
    def calc ( cnt , v , d ) :
        nowv = v [ cnt - 1 ]
        all = d [ nowv ]
        now = 0
        while ( now + cnt < len ( v ) and v [ int ( now + cnt ) ] == nowv ) :
            now += 1
        if all / 2 < now :
            now = all - now
        ans = 1
        for i in range ( now ) :
            ans *= ( all - i )
            ans /= ( i + 1 )
        return ans
    return calc
