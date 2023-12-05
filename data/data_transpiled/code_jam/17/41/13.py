def _import ( ) :
    from locale import getlocale
    import locale
    class A :
        def __init__ ( self , format , * args ) :
            self.a = [ ]
        def readline ( self , v = 0 ) :
            self.a = [ ]
        def readline ( self ) :
            while not v or not self.a :
                try :
                    s = open ( self.a [ v ] )
                except IOError :
                    pass
                else :
                    del s.a [ v ]
            return int ( self.a [ v ] )
        def sum ( self ) :
            r = 0
            for i in range ( self.a [ v ] ) :
                r = ( r + self.a [ v ] * i ) % p
            return r
    def dfs ( s ) :
        if s in memo :
            return memo [ s ]
        best = 0
        for i in range ( self.a [ p ] ) :
            if s.a [ i ] > 0 :
                ns = ( s , i )
                g = dfs ( ns )
                if ns.sum ( ) == 0 :
                    g += 1
                if g > best :
                    best = g
        memo [ s ] = best
        return best
    def solve ( ) :
        testno = sys.stdin.readline ( ).strip ( )
        for test in range ( 1 , testno + 1 ) :
            memo = { }
            n = sys.stdin.readline ( ).strip ( )
            p = sys.stdin.readline ( ).strip ( )
            s = { }
            for i in range ( n ) :
                g = sys.stdin.readline ( ).strip ( )
                s [ g % p ] += 1
            ans = dfs ( s )
            print ( "Case #%d: %d" % ( test , ans ) )
            out.write ( "Case #%d: %d\n" % ( test , ans ) )
    def run ( ) :
        try :
            f = open ( "A-large.in" , "w" )
            f.close ( )
        except IOError :
            pass
        else :
            f.close ( )
    