def import import _readline , out
from calibre.utils.text import Text , Text , Text , Text , Locale
class Main ( object ) :
    problem = 'A'
    filename = '%s-large' % problem
    def solve ( self ) :
        N = self.iread ( )
        if N == 0 :
            out.write ( 'INSOMNIA\n' )
            return
        was = [ ]
        k = 1
        cycle :
            while True :
                n = N * k
                while n > 0 :
                    was [ int ( n % 10 ) ] += 1
                    n /= 10
                for i in range ( 10 ) :
                    if was [ i ] == 0 :
                        k += 1
                        continue cycle
                    break
                out.write ( '%d\n' % N * k )
        def solve_gcj ( self ) :
            tests = self.iread ( )
            for test in range ( 1 , tests + 1 ) :
                out.write ( 'Case #%d: ' % test )
                self.solve ( )
                out.write ( '\n' )
        def run ( self ) :
            try :
                f = open ( filename + '.in' , 'r' )
                out = open ( filename + '.out' , 'w' )
                self.solve_gcj ( )
                out.flush ( )
            except :
                sys.exit ( 1 )
        def iread ( self ) :
            return int ( self.readword ( ) )
        def dread ( self ) :
            return float ( self.readword ( ) )
        def lread ( self ) :
            return long ( self.readword ( ) )
    def readword ( self ) :
        try :
            locale.setlocale ( Locale.LC_ALL , '' )
        except :
            pass
        return ''.join ( [ str ( s ) for s in s ] )
