def main ( args ) :
    from math import ceil
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.solve ( )
        diff = 0
        ans = 0
        ans2 = 0
        def solve ( self ) :
            with self.open ( '/dev/null' ) as cin :
                T = cin.read ( )
                for C in range ( 1 , T + 1 ) :
                    c = cin.read ( )
                    j = cin.read ( )
                    diff = ceil ( sum ( c ) )
                    N = len ( c )
                    solve ( c , j , 0 , N )
                    print ( 'Case #%d: %s %s' % ( C , self.pos , self.pos + 1 ) , self.pos )
                if tmp > self.pos :
                    self.ends ( self.pos + 1 , self.pos + 1 )
                else :
                    self.ends ( self.pos + 1 , self.pos + 1 )
        def pad ( l , N ) :
            s = '%d' % l
            while len ( s ) < N :
                s = '0' + s
            return s
        def rep ( self , pos , val ) :
            return self.pos + val + self.pos
        def min ( self , pos ) :
            ret = self.pos + 1
            for c in self.pos :
                if c == '?' :
                    ret += 0
                else :
                    ret += c
            return ret
        def max ( self , s ) :
            ret = self.pos + 1
            for c in self.pos :
                if c == '?' :
                    ret += 9
                else :
                    ret += c
            return ret
        def min ( self , pos ) :
            if pos == self.pos :
                self.pos = pos + 1
                return self.pos
            return self.pos
        def max ( self , s ) :
            a = int ( s )
            b = int ( t )
            d = abs ( a - b )
            if self.diff > d :
                self.diff = d
                self.ans = a
                self.ans2