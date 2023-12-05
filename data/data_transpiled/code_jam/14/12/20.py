def world2014.round1a ( args ) :
    import os
    import os
    import os.path
    import sys
    import random
    import sys
    class FullBinaryTree ( object ) :
        def solve ( self , N , connection ) :
            cnt = [ ]
            for i in range ( N ) :
                split = line.strip ( ).split ( ' ' )
                connection [ j ] = [ ]
                cnt [ i ].append ( int ( split [ 0 ] ) )
                cnt [ i ].append ( int ( split [ 1 ] ) )
        self.cnt = [ ]
        def solve ( self , connection , idx , parent ) :
            if self.cnt [ idx ] [ parent ] >= 0 : return self.cnt [ idx ] [ parent ]
            res = [ ]
            for i in range ( len ( connection ) ) :
                if self.cnt [ i ] [ 0 ] != self.cnt [ i ] [ 1 ] : res += [ self.cnt [ i ] [ 1 ] ]
            self.cnt.append ( res )
        self.cnt = [ ]
        for i in range ( len ( connection ) ) :
            v1 , v2 = connection [ i ] [ 0 ] , connection [ i ] [ 1 ]
            self.cnt [ v1 ] += [ v2 ]
            self.cnt [ v2 ] += [ v1 ]
        self.cnt = [ ]
        for i in range ( N ) :
            self.cnt [ i ].append ( - 1 )
        self.cnt = [ ]
        for i in range ( len ( connection ) ) :
            self.cnt [ i ].append ( 0 )
        self.cnt = [ ]
    def solve ( self , N , connection ) :
        if self.cnt [ idx ] [ parent ] >= 0 : return self.cnt [ idx ] [ parent ]
        num = [ ]
        for i in range ( len ( connection ) ) :
            if self.cnt [ i ] [ 0 ] == self.cnt [ i ] [ 1 ] :
                self.cnt [ i ].append ( 0 )
        self.cnt [ idx ].append ( 1 )
