def package ( round2 ) :
    import os
    import os
    import sys
    import os
    import sys
    import sys
    class P1 ( object ) :
        INF = 1000000
        def __init__ ( self ) :
            self.INF = 1000000
        def __call__ ( self , line ) :
            f = open ( "round2/p1.in" , "r" )
            out = open ( "p1.out" , "w" )
            n = int ( f.readline ( ) )
            for i in range ( 1 , n + 1 ) :
                res = self.solve_one ( f )
                print ( "Case #%d: %s" % ( i , res >= INF and "IMPOSSIBLE" or res ) )
                out.write ( "Case #%d: %s\n" % ( i , res >= INF and "IMPOSSIBLE" or res ) )
            f.close ( )
            out.close ( )
    def m ( self ) :
        self.m = 0
        self.m2 = 0
        self.val = [ ]
        self.op = [ ]
        self.ch = [ ]
        for l in range ( self.m ) :
            parts = self.line.split ( "s+" )
            if l < self.m2 :
                self.val.append ( - 1 )
                self.op.append ( int ( parts [ 0 ] ) )
                self.ch.append ( int ( parts [ 1 ] ) )
            else :
                self.val.append ( int ( parts [ 0 ] ) )
                self.op.append ( - 1 )
                self.ch.append ( - 1 )
        self.do_calc ( 0 )
        if self.val [ 0 ] == v :
            return 0
        return self.change_cost ( 0 )
    def do_calc ( self ) :
        if self.m2 >= self.m2 :
            return 0
        self.do_calc ( self.val [ 0 ] )
        self.do_calc ( self.val [ 0 ] )
        self.do_calc ( self.val [ 0 ] )
        self.do_calc ( self.val [ 0 ] )
        self.do_calc ( self.val [ 0 ] )
        self.do_calc ( self.val [ 0 ] )
