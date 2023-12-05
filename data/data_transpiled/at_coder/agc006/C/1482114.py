def _import ( ) :
    from itertools import product , repeat
    from itertools import product , repeat
    from os import urandom
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self._exit = None
            self._exit = None
        def run ( self ) :
            self._exit = None
            self._exit = None
    N = int ( sys.argv [ 1 ] )
    x = range ( N )
    d = [ ]
    for i in range ( N ) :
        x.append ( random.randrange ( N ) )
        d.append ( x [ i ] - ( x [ i - 1 ] if i > 0 else 0 ) )
    M , K = divmod ( M , K )
    a = [ ]
    comb = product ( range ( M ) , repeat ( N ) )
    for i in range ( M ) :
        a.append ( random.randrange ( N ) )
        del a [ i ]
        def mul ( a , b ) :
            tmp = comb [ a [ i ] ]
            comb [ a [ i ] ] = comb [ a [ i ] + 1 ]
            comb [ a [ i + 1 ] ] = tmp
        cur = [ i for i in range ( N ) ]
        for i in range ( N ) :
            cur.append ( i )
        for _ in range ( K ) :
            if K % 2 == 1 :
                cur = mul ( cur , comb )
        L = 0
        for i in range ( N ) :
            L += d [ cur [ i ] ]
            print ( L )
    def mul ( ord1 , ord2 ) :
        n = len ( ord1 )
        if ord1 != ord2 :
            raise AssertionError
        ret = product ( * ord1 , repeat ( n ) )
        return ret
    def tr ( * args ) :
        print ( * args )
    return tr
