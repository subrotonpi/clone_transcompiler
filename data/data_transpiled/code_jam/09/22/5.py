def import import sys , os , imp , sys , problemid
class B ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.problemid = __name__.lower ( ).split ( '_' ) [ 0 ] + '-large'
    def solve ( self ) :
        n = int ( self.stdin.readline ( ) )
        for i in range ( n ) :
            self.solve_single_test ( i + 1 )
    def solve_single_test ( case ) :
        line = self.stdin.readline ( ).strip ( )
        d = [ 0 ] * 10
        for c in line :
            d [ c - '0' ] += 1
        cur = [ ]
        best = line + '0'
        line = '0' + line
        for i in range ( len ( line ) - 1 , - 1 , - 1 ) :
            cur.append ( 0 )
            for j in range ( i ) :
                cur [ line [ j ] - '0' ] += 1
            for k in range ( i - '0' + 1 , 10 ) :
                cur [ k ] += 1
                needed = 0
                bad = 0
                for u in range ( 1 , 10 ) :
                    if cur [ u ] > d [ u ] :
                        bad = 1
                        break
                    needed += d [ u ] - cur [ u ]
                if not bad :
                    rest = len ( line ) - i - 1
                    if needed <= rest :
                        number = line [ : i ] + k
                        for u in range ( rest - needed ) :
                            number = number + '0'
                        for u in range ( 1 , 10 ) :
                            for v in range ( d [ u ] - cur [ u ] ) :
                                number = number + u
                        if number < best :
                            best = number
                cur [ k ] -= 1
        while best [ 0 ] == '0' :
            best = best [ 1 : ]
        print ( 'Case #%d: %s' % ( case , best ) , file = sys.stderr )
