def _solve ( ) :
    from scipy.optimize import solve
    class SolA ( object ) :
        def __init__ ( self , f , s , t , e , w , s , eps ) :
            super ( SolA , self ).__init__ ( f , s , t , eps )
        def readline ( self ) :
            try :
                f = open ( self.fname + '.in' , 'r' )
                out = open ( self.fname + '.out' , 'w' )
                out.write ( 'Case #%d: %d\n' % ( self.test , self.ans ) )
                out.close ( )
            except IOError :
                pass
        def readline ( self ) :
            while not u or not u :
                try :
                    u = [ x for x in u if x != self.fname ]
                except :
                    eof = True
                    return '0'
            return u [ 0 ]
        def randint ( self , n ) :
            return int ( self.n )
        def long ( self ) :
            return long ( self.n )
    FNAME = 'A-large'
    eps = 1e-9
    def solve ( ) :
        tests = randint ( 1 , n )
        for test in range ( 1 , tests + 1 ) :
            x , s , r , t , n = randint ( 1 , n )
            b , e , w = [ ] , [ ] , [ ]
            sl = x
            for i in range ( n ) :
                b.append ( randint ( 0 , n ) )
                e.append ( randint ( 0 , n ) )
                w.append ( randint ( 0 , n ) )
                sl -= e [ i ] - b [ i ]
            ans = 0
            if sl >= t * r :
                for i in range ( n ) :
                    ans += 1.0 * ( e [ i ] - b [ i ] ) / ( s + w [ i ] )
                ans += t
                ans += ( sl - t * r ) / s
            else :
                ans += sl / r
                t -= sl / r
                u = [ ]
                while t > eps :
                    imin = - 1
                    for i in range ( n ) :
                        if u [ i ] :
                        INDENT