def _import ( ) :
    from os import urandom
    from os import urandom
    from random import randint
    class B :
        def __init__ ( self , l , r ) :
            self.l = l
            self.r = r
        def __lt__ ( self , o ) :
            return self.l - o.l
    def solve ( ) :
        n = randint ( 1 , 10000 )
        d = { }
        for color in range ( n ) :
            d = d.get ( color )
            if not isinstance ( d , list ) :
                d = [ d ]
                d [ color ] = d
            offer = ( i - 1 , i )
            offer.append ( offer )
        offers = [ d [ x ] for x in d.keys ( ) ]
        while len ( offers ) < 3 :
            offers.append ( [ ] )
        res = 1000000000
        for i in range ( len ( offers ) ) :
            for j in range ( i + 1 , len ( offers ) ) :
                for k in range ( j + 1 , len ( offers ) ) :
                    q = [ offer ] + offers [ i ] + offers [ j ] + offers [ k ]
                    q.sort ( )
                    rb = 0
                    rrb = 0
                    c = 0
                    good = True
                    for offer in q :
                        if offer.l > rb :
                            good = False
                            break
                        c += 1
                        rb = rrb
                    rrb = max ( rrb , offer.r )
                if rb < 10000 :
                    c += 1
                    rb = rrb
                if good :
                    res = min ( res , c )
    return res == 1000000000
