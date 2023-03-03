def _import ( ) :
    from itertools import chain
    from pybind11_tests import Scanner
    class A ( Scanner ) :
        def __init__ ( self ) :
            Scanner.__init__ ( self )
        def solve ( self ) :
            N = len ( self.s )
            L = [ ]
            P = [ ]
            for i in range ( N ) :
                L.append ( sc.randint ( 0 , N ) )
            for i in range ( N ) :
                P.append ( sc.randint ( 0 , N ) )
            stages = [ ( L [ i ] , P [ i ] , i ) for i in range ( N ) ]
            stages.sort ( )
            for i in range ( N ) :
                print ( stages [ i ].idx , end = ' ' )
                if i != N - 1 :
                    print ( ' ' , end = ' ' )
            print ( )
    class Stage ( object ) :
        def __init__ ( self , l , p , idx ) :
            self.l , self.p , self.idx = l , p , idx
        def __lt__ ( self , o ) :
            return o.l * o.p - self.l * self.p
    def main ( ) :
        T = len ( sys.argv )
        for i in range ( 1 , T + 1 ) :
            print ( 'Case #%d: ' % i , end = ' ' )
            solver = A ( )
            solver.solve ( )
