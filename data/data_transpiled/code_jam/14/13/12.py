def round1a ( ) :
    import random
    import sys
    import random
    import sys
    class C ( object ) :
        def __init__ ( self ) :
            self.cases = random.randint ( 1 , 6 )
        def __init__ ( self ) :
            self.cases = random.randint ( 1 , 6 )
    for caze in range ( 1 , cases + 1 ) :
        N , tot = len ( [ random.randint ( 1 , 6 ) for i in range ( N ) if ( i > 0 and i + 1 < N ) and ( tmp < i + 1 or tmp > i + N / 2 ) ] )
        print ( 'Case #%d: %s' % ( caze , 'GOOD' if tot >= 610 else 'BAD' ) )
    def _print ( self , cant ) :
        print ( cant )
        r = random.Random ( 7 )
        for i in range ( cant ) :
            if good :
                val = self._gen_good ( N , r )
            else :
                val = self._reg ( N , r )
            print ( N )
            for j in val :
                print ( j , end = ' ' )
            print ( good )
    def _gengood ( self , N , r ) :
        ret = self._get ( N )
        for i in range ( N ) :
            pos = i + r.randint ( 0 , len ( ret ) - i )
            tmp = ret [ i ]
            ret [ i ] = ret [ pos ]
            ret [ pos ] = tmp
        return ret
    def _genbad ( self , N , r ) :
        ret = self._get ( N )
        for i in range ( N ) :
            pos = r.randint ( 0 , len ( ret ) )
            tmp = ret [ i ]
            ret [ i ] = ret [ pos ]
            ret [ pos ] = tmp
        return ret
