def pyloop ( ) :
    import Queue
    import os
    import sys
    import os
    import sys
    import os
    import Queue
    import Queue
    class D ( object ) :
        def __init__ ( self ) :
            self.fx , self.fy , self.n , self.m = q.get ( )
            self.di , self.a = [ ] , [ ] , [ ]
        def main ( self ) :
            self.fd = os.open ( 'D-small-attempt0.in' , os.O_RDONLY )
            self.out = os.open ( 'd.out' , os.O_WRONLY )
            self.T = self.n
    def fix ( self ) :
        cx , cy = self.fy , self.n , self.m
        self.fd = os.open ( 'D-small-attempt0.in' , os.O_WRONLY )
        self.out = os.open ( 'd.out' , os.O_WRONLY )
        self.T = self.n
        for tt in range ( 1 , T + 1 ) :
            dd = D ( )
            self.n , self.m = self.n , self.m
            a = [ ]
            dd.n = self.n
            dd.m = self.m
            for i , s in enumerate ( f ) :
                for j , c in enumerate ( s ) :
                    a.append ( 1 if c != '.' else 0 )
                    if c == 'T' and ( i or j ) :
                        dd.fx = i
                        dd.fy = j
            dd.a = a
            dd.di = [ ]
            dd.prev = [ ]
            dd.fd = [ ]
            for ints in dd.di :
                [ ints ] = 1000000
            dd.go ( 0 , 0 )
            dd.fix ( )
            dd.go ( self.fx , self.fy )
            r = 0
            for i in range ( n ) :
                for j in range ( m ) :
                    if a [ i ] [ j ] :
                        r += dd.di [ i ] [ j ]
            print ( 'Case #%d: %d' % ( tt , r ) , file = sys.stderr )
    return
