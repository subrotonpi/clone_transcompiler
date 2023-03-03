def _import ( ) :
    from os import system , read , decode
    class SolA ( object ) :
        def __init__ ( self ) :
            super ( SolA , self ).__init__ ( )
            self.f = open ( FNAME + '.in' , 'r' )
            self.f = open ( FNAME + '.out' , 'w' )
            self.solve ( )
            self.f.close ( )
    if sys.version_info [ 0 ] < 3 or sys.version_info [ 1 ] < 3 :
        try :
            lines = read ( ).splitlines ( )
        except :
            eof = True
            return '0'
    else :
        lines = [ ]
    def __next__ ( ) :
        while not lines or not lines [ - 1 ] :
            try :
                lines = decode ( line.decode ( 'utf-8' ) ).splitlines ( )
            except :
                eof = True
                return '0'
        return lines [ - 1 ]
    def __next__ ( ) :
        return int ( __next__ )
    def __next__ ( ) :
        return float ( __next__ )
    def __next__ ( ) :
        return long ( __next__ )
    FNAME = 'A-large'
    def iscons ( ch ) :
        if ch in [ 'a' , 'e' , 'i' , 'o' , 'u' ] :
            return 0
        return 1
    def solve ( ) :
        tests = randint ( 1 , 4 )
        for test in range ( 1 , tests + 1 ) :
            print ( 'Case #%d: ' % test , end = ' ' )
            s = __next__ ( )
            m = randint ( 1 , 4 )
            n = len ( s )
            good = [ ]
            cnt = 0
            for i in range ( n ) :
                if iscons ( s [ i ] ) == 1 :
                    cnt += 1
                else :
                    cnt = 0
                if cnt >= m :
                    good.append ( True )
            last = int ( n )
            ans = 0
            for i in range ( n - m , - 1 , - 1 ) :
                if good [ i + m - 1 ] :
                    last = i + m -