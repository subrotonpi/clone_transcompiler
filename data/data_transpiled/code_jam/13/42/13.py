def r2_2013 ( ) :
    import os
    import sys
    import random
    import sys
    import os
    import sys
    import random
    class B ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
        def write ( self , stream ) :
            for t , cs in enumerate ( stream ) :
                stream.write ( 'Case #%d: ' % cs )
                n = int ( stream.read ( ) )
                p = int ( stream.read ( ) )
                def lowest ( n , md ) :
                    lo , hi = 0 , ( 1 << n ) - 1
                    while lo < hi :
                        md = ( lo + hi + 1 ) / 2
                        lowest = lowest ( n , md )
                        if lowest > p - 1 :
                            hi = md - 1
                        else :
                            lo = md
                    stream.write ( lo )
                def highest ( n , md ) :
                    lo , hi = 0 , ( 1 << n ) - 1
                    while lo < hi :
                        md = ( lo + hi + 1 ) / 2
                        highest = highest ( n , md )
                        if highest <= p - 1 :
                            lo = md
                        else :
                            hi = md - 1
                    stream.write ( ' %d' % lo )
                stream.write ( '\n' )
            stream.flush ( )
    lowest = B ( )
    highest = B ( )
    if not lowest :
        return lowest
    if not highest :
        return highest
    return lowest
