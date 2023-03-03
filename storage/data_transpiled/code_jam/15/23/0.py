def import readline , randint , choice , string , count , line , sys ) : return int ( readline ( ) )
class C2 ( object ) :
    SIZE = 500000
    a = [ ]
    b = [ ]
    n = 0
    class Event ( object ) :
        def __init__ ( self , i , s , t ) :
            self.i = i
            self.s = s
            self.t = t
        def __lt__ ( self , o ) :
            if t != o.t :
                return cmp ( t , o.t )
            if s != o.s :
                return cmp ( o.s , s )
            return cmp ( o.i , i )
    def solve_test2 ( self ) :
        seen = [ ]
        for i in range ( n ) :
            t = b [ i ] * ( 360 - a [ i ] )
            seen.append ( ( i , - 1 , t ) )
        q = 0
        res = self.n
        s = self.n
        while not seen :
            e = seen.pop ( )
            s += e.s
            if e.s > 0 :
                q += 1
            if q == self.n :
                break
            res = min ( res , s )
            e.s = 1
            e.t += ( b [ e.i ] * 360 )
            seen.append ( e )
        return res
    def solve ( self ) :
        m = randint ( 0 , min ( [ len ( a ) , n ] ) )
        n = 0
        for i in range ( m ) :
            d , h , mm = select ( [ ] , [ ] , [ ] , [ ] )
            for j in range ( h ) :
                a [ n ] = d
                b [ n ] = mm
                n += 1
        return solve_test2 ( self )
    def solve ( self ) :
        n = randint ( 0 , min ( [ len ( a ) , n ] ) )
        for i in range ( n ) :
            res = solve_test ( self )
            print ( "Case #%d: %d" % ( i + 1 , res ) )
            print ( "Case #%d: %d" % ( i + 1 , res ) )
        return res
    