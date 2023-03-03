def import import sys , StringIO , QQ , N
class SolA ( object ) :
    def __init__ ( self ) :
        try :
            super ( SolA , self ).__init__ ( )
        except :
            pass
    def solve ( ) :
        f = open ( FNAME + '.in' , 'r' )
        out = open ( FNAME + '.out' , 'w' )
        solve ( )
        out.close ( )
    def __next__ ( ) :
        while not eof or not next ( ) :
            try :
                next ( f )
            except StopIteration :
                eof = True
                return '0'
        return next ( )
    def __next__ ( ) :
        return int ( __next__ ( ) )
    def __next__ ( ) :
        return long ( __next__ ( ) )
    FNAME = 'A-large'
    def compare ( a , b , c , d ) :
        t1 = QQ ( a , d ) * QQ ( b , d )
        t2 = QQ ( c , b ) * QQ ( b , d )
        return t1 >= t2
    def solve ( ) :
        tests = __next__ ( )
        for test in range ( 1 , tests + 1 ) :
            out.write ( 'Case #%d: ' % test )
            p = __next__ ( )
            q = __next__ ( )
            d = QQ ( p , q )
            p //= d
            q //= d
            if sum ( q ) != 1 or p > q or q > ( 1l << 40 ) :
                out.write ( 'impossible' )
            else :
                ans = 1
                pp = 1
                qq = 2
                while not compare ( p , q , pp , qq ) :
                    qq *= 2
                    ans += 1
                out.write ( ans )
