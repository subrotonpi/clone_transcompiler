def _import ( ) :
    from itertools import chain
    from itertools import chain
    from random import randint
    from itertools import chain
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( chain ( [ 0 ] ) )
            self.A = chain ( [ randint ( 0 , 1 ) for i in range ( N ) ] )
            print ( self.solve ( ) )
        def solve ( self ) :
            ans = 0
            while True :
                max = - sum ( A ) / 2
                max_index = - 1
                for i in range ( N ) :
                    if A [ i ] > max :
                        max = A [ i ]
                        max_index = i
                if max < N :
                    break
                d = max // N
                for i in range ( N ) :
                    if i == max_index :
                        A [ i ] -= d * N
                    else :
                        A [ i ] += d
                ans += d
            return ans
        @ chain
        def readline ( self ) :
            if self.N < N or not self.N :
                try :
                    return next ( self.A )
                except StopIteration :
                    return
            return next ( self.A )
        def __next__ ( self ) :
            return next ( self.A )
        def __next__ ( self ) :
            return next ( self.A )
        def __next__ ( self ) :
            return next ( self.A )
        def __next__ ( self ) :
            return next ( self.A )
    return Main
