def solve ( ) :
    import sys
    from random import randint , randrange
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    from random import random
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    from random import random
    class B :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
            self.stdout = sys.stdout
            self.choice = choice
        def write ( self , a ) :
            self.ans = 0
            for i in range ( self.n ) :
                maxVal = - 1
                maxPos = - 1
                for j in range ( self.n ) :
                    if self.maxVal < a [ j ] :
                        maxVal = a [ j ]
                        maxPos = j
                self.a [ maxPos ] = - 1
                cost1 = 0
                for j in range ( self.maxPos ) :
                    if self.a [ j ] < 0 :
                        cost1 += 1
                cost2 = self.i - cost1
                ans += min ( cost1 , cost2 )
            self.printcase ( )
            self.write ( ans )
        def printcase ( self ) :
            self.stdout.write ( "Case #%d: " % test )
        def printlnCase ( self ) :
            self.stdout.write ( "Case #%d:" % test )
        def randint ( self ) :
            return randint ( self.n )
        def long ( self ) :
            return long ( self.n )
        def uniform ( self ) :
            return uniform ( self.n )
        def string ( self ) :
            while self.tok is None or not self.tok.startswith ( "." ) :
                self.tok = self.tok [ 0 ]
            return self.tok
    return B
