def _import ( ) :
    import sys
    import os
    import sys
    import os
    import os
    import sys
    import os
    import sys
    class ProblemA ( object ) :
        IMP = 'NOT POSSIBLE'
        def __init__ ( self ) :
            self.req = [ ]
        for f in self.flow :
            if f in self.req :
                self.req.remove ( f )
    def change ( flow , req ) :
        L = len ( flow )
        change = [ ]
        for cn in range ( 1 , T + 1 ) :
            N = len ( flow )
            L = len ( flow )
            flow = [ ]
            for i in range ( N ) :
                flow.append ( flow [ i ].decode ( 'utf-8' ) )
            req = [ ]
            for i in range ( N ) :
                req.append ( flow [ i ].decode ( 'utf-8' ) )
            print ( 'Case #%d: %s' % ( cn , solve ( flow , req ) ) , file = sys.stderr )
        sys.stderr.flush ( )
    def solve ( flow , req ) :
        N = len ( flow )
        L = len ( flow [ 0 ] )
        minimum_flip = sys.maxint
        for i in range ( N ) :
            for j in range ( N ) :
                need_flip = change ( flow [ i ] , req [ j ] )
                if candoit ( flow , req , need_flip ) :
                    fliped = 0
                    for k in range ( L ) :
                        if need_flip [ k ] :
                            fliped += 1
                    minimum_flip = min ( minimum_flip , fliped )
        return ( minimum_flip , IMP )
    def candoit ( flow , req , need_flip ) :
        N = len ( flow )
        L = len ( need_flip )
        flows = set ( )
        for i in range ( N ) :
            flows.add ( flow [ i ].decode ( 'utf-8' ) )
        return ( flow , req )
    return solve
