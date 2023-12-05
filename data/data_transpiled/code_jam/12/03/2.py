def import import sys , StringIO , traceback
class C ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = StringIO ( )
        self.stdout.write ( "\n" )
        self.stdin.seek ( 0 )
        self.stdin.seek ( 0 )
        self.stdout.write ( "\n" )
        self.stdin.seek ( 0 )
        self.stdin.seek ( 0 )
        self.stdout.write ( "\n" )
        for i in range ( 1 , self.cases + 1 ) :
            self.stdout.write ( "Case #%d: " % i )
            self.printResult ( )
            self.stdout.write ( "\n" )
    def printResult ( self ) :
        a , b = sys.stdin.read ( ) , sys.stdin.read ( )
        i = a
        first_digit = 1
        num_digits = 0
        while i > 0 :
            i //= 10
            first_digit *= 10
            num_digits += 1
        already_done = [ ]
        first_digit //= 10
        cur , m = 0 , 0
        tot = 0
        not_done = [ ]
        for i in range ( a , b ) :
            cur = i
            for j in range ( 1 , num_digits ) :
                already_done.append ( - 1 )
            for j in range ( 1 , num_digits ) :
                m = cur % 10
                cur = ( cur // 10 ) + ( m * first_digit )
                if cur > i and cur <= b :
                    not_done = True
                    for k in range ( 1 , j ) :
                        if already_done [ k ] == cur :
                            not_done = False
                            break
                    if not_done :
                        already_done.append ( cur )
                        tot += 1
        print ( tot , file = sys.stdout )
