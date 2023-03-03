def import _main
class B ( object ) :
    def __init__ ( self , dr = [ 0 , 1 , 0 , - 1 ] ) :
        self.dr = [ 0 , 1 , 0 , - 1 ]
        self.dc = [ 1 , 0 , - 1 , 0 ]
    def main ( self , args ) :
        Scanner = _main
        EPS = 1e-14
        T = scan ( )
        for ca in range ( 1 , T + 1 ) :
            h = scan ( )
            m = scan ( )
            n = scan ( )
            c = [ ]
            f = [ ]
            for i in range ( m ) :
                for j in range ( n ) :
                    c.append ( [ i , j ] )
            for i in range ( m ) :
                for j in range ( n ) :
                    f.append ( [ i , j ] )
            d = [ ]
            for i in range ( m ) :
                for j in range ( n ) :
                    [ d [ i ] [ j ] ] = 999999999
            q = PriorityQueue ( )
            q.put ( ( 0 , 0 , h , 0 ) )
            d [ 0 ] [ 0 ] [ h ] = 0
            rtn = 999999999
            while not q.empty ( ) :
                s = q.get ( )
                dist = d [ s.r ] [ s.c ] [ s.h ]
                if s.d > dist : continue
                if s.r == m - 1 and s.c == n - 1 :
                    rtn = s.d
                    break
                if s.h > 0 and dist + 1 < d [ s.r ] [ s.c ] [ s.h - 1 ] :
                    q.put ( ( s.r , s.c , s.h - 1 , dist + 1 ) )
                    d [ s.r ] [ s.c ] [ s.h - 1 ] = dist
        return rtn
