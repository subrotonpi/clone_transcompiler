def import readline
import readline
import readline
import readline
import readline
import readline
class Cake ( readline ) :
    def __init__ ( self ) :
        readline.__init__ ( self )
        self.stdin = open ( FNAME + '.in' , 'r' )
        self.stdout = open ( FNAME + '.out' , 'w' )
        self.stdout.write ( '\n' )
        self.eof = False
    def readline ( ) :
        while not self.eof or not self.eof :
            try :
                self.stdin.readline ( )
            except :
                self.eof = True
                return '0'
        return self.stdin.readline ( )
    def readline ( ) :
        while not self.eof :
            try :
                self.stdin.readline ( )
            except :
                self.eof = True
                return '0'
        return self.stdin.readline ( )
    def readline ( ) :
        return readline ( )
    def readline ( ) :
        return readline ( )
    def next_lypond ( ) :
        return long ( readline ( ) )
    FNAME = 'a'
    def solve ( self ) :
        tests = self.__next__ ( )
        self.__next__ = next_lypond
        for test in range ( 1 , tests + 1 ) :
            print ( 'Case #%d: ' % test , end = ' ' )
            n = self.__next__ ( )
            m = self.__next__ ( )
            a = [ [ ] for _ in range ( n ) ]
            for i in range ( n ) :
                for j in range ( m ) :
                    if a [ i ] [ j ] == '?' and j > 0 :
                        a [ i ] [ j ] = a [ i ] [ j - 1 ]
                for j in range ( n - 1 , m - 1 ) :
                    if j + 1 < len ( a [ i ] ) and a [ i ] [ j ] == '?' :
                        a [ i ] [ j ] = a [ i ] [ j + 1 ]
        return a
