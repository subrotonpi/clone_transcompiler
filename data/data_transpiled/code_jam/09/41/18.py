def import readline
import readline
import sys
class A ( object ) :
    def __init__ ( self ) :
        self.readline = readline
    def run ( self ) :
        readline.parse_and_bind ( )
    def run ( self ) :
        import locale
        try :
            f = open ( self.FN + '.in' )
            out = open ( self.FN + '.out' , 'w' )
            T = randint ( 0 , 1 )
            for i in range ( T ) :
                solve ( i + 1 )
            out.close ( )
        except ( IOError , EOFError ) :
            sys.exit ( 239 )
    def readline ( self ) :
        while not self.readline or not self.readline.startswith ( '#' ) :
            try :
                self.readline ( )
            except :
                eof = True
                return '0'
        return self.readline ( )
    def randint ( self ) :
        return int ( self.readline ( ) )
    def long ( self ) :
        return long ( self.readline ( ) )
    def uniform ( self ) :
        return float ( self.uniform ( ) )
    def solve ( self ) :
        N = randint ( 0 , 1 )
        a = [ ]
        b = [ ]
        for i in range ( N ) :
            for j in range ( N ) :
                a [ i ] = readline ( ) - '0'
                if a [ i ] == 1 :
                    b.append ( j )
            f.readline ( )
        res = 0
        for i in range ( N ) :
            if b [ i ] > i :
                j = i + 1
                while j < N :
                    if b [ j ] <= i :
                        res += j - i
                        for k in range ( j , i - 1 , - 1 ) :
                            b [ k ] = b [ k - 1 ]
                        break
                    j += 1
                if j == N :
                    sys.stderr.write ( 'FUCK\n' )
        out.write ( 'Case #%d: %d\n' % ( T , res ) )
