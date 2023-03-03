def _import ( ) :
    from sys import stdin
    from os import system
    class B ( object ) :
        def check ( e ) :
            if not e :
                raise Error ( )
        def run ( self , args ) :
            with open ( '/dev/null' , 'w' ) as f :
                return f.read ( )
        def start ( self , sum ) :
            n = int ( math.sqrt ( sum ) )
            while n > 1 and n * ( n + 1 ) / 2 >= sum :
                n -= 1
            while n * ( n + 1 ) / 2 < sum :
                n += 1
            return n
        def solve_one ( x , y , n ) :
            s = [ ]
            for i in range ( n , 1 , - 1 ) :
                if abs ( x ) > abs ( y ) :
                    if x < 0 :
                        x += i
                        s.append ( 'E' )
                    else :
                        x -= i
                        s.append ( 'W' )
                else :
                    if y < 0 :
                        y += i
                        s.append ( 'N' )
                    else :
                        y -= i
                        s.append ( 'S' )
            if x == 0 and y == 0 :
                s.reverse ( )
                return ''.join ( s )
            else :
                return None
        def check ( self , x_r , y_r , s ) :
            x = 0
            y = 0
            for i in range ( 1 , len ( s ) + 1 ) :
                c = s [ i - 1 ]
                if c == 'N' :
                    y += i
                elif c == 'S' :
                    y -= i
                elif c == 'E' :
                    x += i
                elif c == 'W' :
                    x -= i
                else :
                    raise Error ( )
            self.check ( x == x_r and y == y_r )
        def solve ( self , ntests = 1 ) :
            n0 = self.start ( abs ( x ) + abs ( y ) )
            for n in n0 :
                s = solve_one ( self , - n )
                if s :
                    self.