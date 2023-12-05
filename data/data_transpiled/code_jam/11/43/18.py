def _import ( ) :
    from os import system , read , decode
    class SolC ( object ) :
        def __init__ ( self ) :
            super ( SolC , self ).__init__ ( )
            self._import ( )
        def solve ( self ) :
            try :
                f = open ( FNAME + '.in' , 'r' )
                out = open ( FNAME + '.out' , 'w' )
                self.solve ( )
                out.close ( )
            except IOError :
                pass
            else :
                while not f or not f.readline ( ) :
                    try :
                        f = f.readline ( )
                    except :
                        eof = True
                        return '0'
                return f.readline ( )
        def randint ( self ) :
            return int ( self._import ( ) )
        def randint ( self ) :
            return long ( self._import ( ) )
        FNAME = 'C-large'
        def solve ( self ) :
            tests = randint ( )
            max = 1000001
            np = [ True ] * max
            for i in range ( 2 , max ) :
                if not np [ i ] :
                    j = 2 * i
                    while j < max :
                        np [ j ] = True
                        j += i
            for test in range ( 1 , tests + 1 ) :
                out.write ( 'Case #%d: ' % test )
                n = randint ( )
                ans = 0
                if n > 1 :
                    ans += 1
                for i in range ( 2 , i * n + 1 ) :
                    if np [ int ( i ) ] :
                        continue
                    j = i * i
                    while j <= n :
                        ans += 1
                        j *= i
                out.write ( ans )
    return SolC
