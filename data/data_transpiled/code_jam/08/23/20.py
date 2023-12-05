def _import ( ) :
    from itertools import chain
    from itertools import chain
    from random import randint
    class R1B_C ( object ) :
        def __init__ ( self ) :
            self.scin = sys.stdin
            N = len ( self.scin )
            for z in range ( 1 , N + 1 ) :
                K , n = next ( self.scin )
                inds = [ ]
                ans = [ ]
                for i in range ( n ) :
                    inds.append ( self.scin )
                lst = chain ( * [ i for i in range ( K ) if i not in inds ] )
                curr = 0
                for i in range ( K ) :
                    curr = ( curr + i ) % len ( lst )
                    ind = lst.pop ( curr )
                    ans.append ( i )
                print ( "Case #{}:".format ( z ) , end = "" )
                for ind in inds :
                    print ( " {}".format ( ans [ ind - 1 ] + 1 ) , end = "" )
                print ( )
