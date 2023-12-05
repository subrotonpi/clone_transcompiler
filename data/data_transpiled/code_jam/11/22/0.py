def import locale
import locale
import time
class Solution ( object ) :
    def __init__ ( self ) :
        self.tokens = [ ]
        self.stdin = sys.stdin
        self.stdout = sys.stdout
    file = 'B-large'
    class Point ( object ) :
        def __init__ ( self , p , count ) :
            self.p = p
            self.count = count
        def __lt__ ( self , o ) :
            return self.p - o.p
        def solve ( self , test ) :
            self.stdout.write ( 'Case #%d: ' % ( test + 1 ) )
            n = randint ( 1 , n )
            d = randint ( 1 , n )
            ps = [ Point ( randint ( 0 , 0 ) , randint ( 0 , 0 ) ) for i in range ( n ) ]
            ps.sort ( )
            l , r = 0., 1e15
            loop : for it in range ( 200 ) :
                t = ( l + r ) / 2
                last = float ( '-inf' )
                for p in ps :
                    for i in range ( self.count ) :
                        x = max ( last + d , p.p - t )
                        if x > self.p + t :
                            l = t
                            continue loop
                        last = x
                r = t
            print ( r , end = '' )
    def run ( ) :
        try :
            f = open ( file + '.in' , 'r' )
            f.write ( file + '.out' )
            eat ( '' )
            tests = randint ( 1 , n )
            for test in range ( tests ) :
                solve ( test )
            f.close ( )
        except :
            traceback.print_exc ( )
            failed = True
    def eat ( s ) :
        s = s.split ( )
        while not s :
            line = f.readline ( )
            if line is None :
                return None
            eat ( line )
        return s
    int = int ( next ( iter ( range ( 1 , n ) ) ) )
    long = long ( next ( iter ( range ( 1 , n ) ) ) )
    return Solution ( )
