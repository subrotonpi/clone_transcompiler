def main ( ) :
    import math
    import os
    import os
    import math
    import random
    import time
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.id = random.randint ( 0 , N )
            self.pos = random.randint ( 0 , N )
            self.lefts = [ ]
            self.rights = [ ]
            self.visited = [ ]
            for i in range ( N ) :
                left = random.randint ( 0 , N )
                right = random.randint ( 0 , N )
                self.lefts.append ( ( i , left ) )
                self.rights.append ( ( i , right ) )
            self.lefts.sort ( key = lambda x : x.pos - x.pos )
            self.rights.sort ( key = lambda x : x.pos )
            leftd = 0
            c = 0
            l = 0
            r = 0
            while l < N and r < N :
                while l < N and ( self.visited [ lefts [ l ].id ] or lefts [ l ].pos <= c ) : l += 1
                if l < N :
                    leftd += lefts [ l ].pos - c
                    c = lefts [ l ].pos
                    self.visited [ lefts [ l ].id ] = True
                while r < N and ( self.visited [ rights [ r ].id ] or rights [ r ].pos >= c ) : r += 1
                if r < N :
                    leftd += c - rights [ r ].pos
                    c = rights [ r ].pos
                    self.visited [ rights [ r ].id ] = True
            leftd += abs ( c )
            rightd = 0
            for i in range ( N ) :
                self.visited [ i ] = False
            c = 0
            l = 0
            r = 0
            while l < N and r < N :
                while r < N and ( self.visited [ rights [ r ].id ] or rights [ r ].pos >= c ) : r += 1
                if r < N :
                    rightd += c - rights [ r ].pos
                    c = rights [ r ].pos
                    self.visited [ rights [ r ].id ] = True
    return Main
    