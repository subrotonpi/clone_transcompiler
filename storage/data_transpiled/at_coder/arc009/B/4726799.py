def _import ( ) :
    import sys
    import os
    import os
    import sys
    import __builtin__ as io
    import __builtin__ as io
    import sys
    class Main ( sc ) :
        def __init__ ( self ) :
            sc = sc ( sys.stdin )
            junjo = [ i for i in range ( 10 ) ]
            N = sc.randint ( 1 , N )
            convert = [ ]
            for i in range ( N ) :
                a = sc.randint ( 1 , N )
                convert.append ( [ a , 0 ] )
                self._cnv ( a )
            self._quick_sort ( convert , 0 , N - 1 )
            for i in range ( N ) :
                self._pl ( convert [ i ] )
        def cnv ( num ) :
            ret = 0
            con = 1_000_000_000
            for i in range ( 0 , 9 ) :
                tmp = num // con
                ret += con * junjo [ tmp ]
                num %= con
                con /= 10
            return ret
    class SC ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self._lst = [ ]
        def next ( self ) :
            if not self._lst or not self._lst :
                try :
                    self._lst = [ self._lst ]
                except AttributeError :
                    raise __builtin__
            return self._lst [ 0 ]
        def pl ( self ) :
            print ( self._lst )
        def p ( self ) :
            print ( self._lst )
        def quick_sort ( self , d , left , right ) :
            if left >= right :
                return
            p = d [ ( left + right ) / 2 ] [ 0 ]
            l , r = left , right
            tmp , tmp1 , tmp2 = self._lst [ 0 ]
            while l <= r :
                while self._lst [ 0 ] < p :
                    l += 1
                while self._lst [ 0 ] > p :
                    r -= 1
            return self._lst [ 0 ]
    return Main ( )
