def _import ( ) :
    from os import urandom
    import random
    class C ( object ) :
        def __init__ ( self ) :
            self.stdin = urandom ( 1024 )
            self.stdout = urandom ( 1024 )
            self.stderr = urandom ( 1024 )
            self.empty -= 2
        def odd ( self , empty ) :
            for x in range ( 3 ) :
                r , c , m = random.randint ( 0 , 3 )
                self.empty -= 2
                if empty == 0 :
                    return self.empty
            for e in range ( 2 , len ( self.grid ) ) :
                [ self.grid [ e ] [ x ] for x in range ( 3 ) ]
    def odd ( self , empty ) :
        for x in range ( 3 ) :
            r , c , m = random.randint ( 0 , 3 )
            self.empty -= 2
            if empty == 0 :
                return self.empty
        for e in range ( 2 , len ( self.grid ) ) :
            [ self.grid [ e ] [ x ] for x in range ( 3 ) ]
        empty = r * c - m
        possible = True
        if empty == 1 :
            self.grid [ 0 ] [ 0 ] = 'c'
        elif r == 1 :
            for z in range ( empty ) :
                self.grid [ 0 ] [ z ] = '.'
        elif c == 1 :
            for a in range ( empty ) :
                self.grid [ a ] [ 0 ] = '.'
        elif empty < 4 :
            possible = False
        elif min ( r , c ) == 2 :
            if empty % 2 == 1 :
                possible = False
            else :
                self.even ( self , empty )
        else :
            if empty % 2 == 0 :
                self.even ( self , empty )
            else :
                if empty % 2 == 0 :
                    possible = False
                else :
                    self.odd ( self , empty )
    self.odd ( )
