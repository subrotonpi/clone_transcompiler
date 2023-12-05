def round_1A2016 ( ) :
    import itertools
    from itertools import chain
    from itertools import chain
    class A ( object ) :
        def __init__ ( self ) :
            self.next = next
    T = len ( A )
    yield A
    for case in range ( 1 , T + 1 ) :
        _ , word = A ( )
        ans = chain ( [ word [ 0 ] ] )
        for c , first in zip ( word [ 1 : ] , ans ) :
            if c >= first :
                ans.add_first ( c )
            else :
                ans.append ( c )
        ans = [ c for c in ans ]
        print ( "Case #%d: %s\n" % ( case , " ".join ( ans ) ) )
