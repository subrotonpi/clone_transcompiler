def _import ( ) :
    import sys
    import os
    import os
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import __builtin__
    import sys
    class Main ( object ) :
        sc = __builtin__
        s = sc.next ( )
        alp = [ 0 ]
        alp = [ 0 ]
        s = long ( s )
        for i in s :
            alp [ i ] - 97
        matrix = [ ]
        for i in range ( 26 ) :
            for j in range ( 26 ) :
                if i == j :
                    matrix [ i ] [ j ] = 0
                else :
                    matrix [ i ] [ j ] = alp [ i ] * alp [ j ]
        sum = 0
        for i in range ( 26 ) :
            for j in range ( 26 ) :
                if i < j :
                    sum += matrix [ i ] [ j ]
        pl ( sum + 1 )
        for i in range ( 26 ) :
            for j in range ( 26 ) :
                if i < j :
                    pass
    class SC ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.tokens = [ ]
        def readline ( self ) :
            self.tokens = [ ]
        def readline ( self ) :
            if not self.tokens or not self.tokens :
                try :
                    self.tokens = [ ]
                except IndexError :
                    raise __builtin__
                return self.tokens [ 0 ]
        def readline ( self ) :
            try :
                return self.tokens [ 0 ]
            except IndexError :
                raise __builtin__
    return Main ( )
