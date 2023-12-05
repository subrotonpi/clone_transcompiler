def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self ) :
            stream.seek ( 0 )
            stream.seek ( 0 )
            S = stream.read ( 1 )
            T = stream.read ( 1 )
            R , U , Q = 0 , 0 , 0
            for c in S :
                if c == 'L' :
                    R -= 1
                if c == 'R' :
                    R += 1
                if c == 'U' :
                    U += 1
                if c == 'D' :
                    U -= 1
                if c == '?' :
                    Q += 1
            R = abs ( R )
            U = abs ( U )
            if T == 2 :
                dist = abs ( R + U - Q )
                if R + U > Q :
                    print ( dist )
                else :
                    if dist % 2 == 0 :
                        print ( 0 )
                    else :
                        print ( 1 )
            else :
                print ( R + U + Q )
    class FastScanner ( stream.read ) :
        def __init__ ( self ) :
            stream.seek ( 0 )
        def read ( self ) :
            self.stream = stream.read ( 1024 )
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return True
            else :
                self.stream.seek ( 0 )
        def next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return self.stream.read ( 1 )
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                yield self.stream.read ( 1 )
    return Main ( )
