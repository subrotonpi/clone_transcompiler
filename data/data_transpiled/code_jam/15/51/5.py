def _ _ main _ _ ( ) : return 0
def main ( args ) :
    global n
    global diff
    global s0 , as , cs , rs , m0 , am , cm , rm
    class A ( object ) :
        def __init__ ( self ) :
            self.n = n
            self.diff = diff
            self.s0 = s0
            self.as = sa.to_int ( )
            self.cs = sa.to_int ( )
            self.rs = sa.to_int ( )
            self.m0 = sa.to_int ( )
            self.cm = sa.to_int ( )
            self.rm = sa.to_int ( )
            self.run ( )
            self.s = [ ]
            self.m = [ ]
            self.run ( )
        def run ( self ) :
            self.run ( )
            self.s.append ( self.s0 )
            self.m0 = m0
            for t in range ( 1 , self.n ) :
                self.run ( )
        def run ( self ) :
            self.run ( )
        def run ( self ) :
            self.s.append ( self.s [ - 1 ] )
            self.m.append ( self.m0 )
        def run ( self ) :
            self.run ( )
    if nThreads > 1 :
        executor = multiprocessing.Pool ( processes = 4 )
        @ executor
        def run ( self ) :
            for t in range ( self.n ) :
                self.run ( )
    else :
        for t in range ( self.n ) :
            self.run ( )
    return run
