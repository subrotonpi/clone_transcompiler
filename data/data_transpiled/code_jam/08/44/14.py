def _import ( * args , ** kwargs ) :
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import chain
    class D ( object ) :
        def __init__ ( self ) :
            self._import ( )
        def __call__ ( self ) :
            with self._import ( ) :
                on = next ( itertools )
                for o in range ( 1 , on + 1 ) :
                    print ( "Case #%d: " % o , end = "" )
                    n = next ( itertools )
                    self._cs = chain ( * chain ( self._cs , self._used , 0 ) )
                    print ( permrec ( chain ( a , used ) , p ) )
        def permrec ( a , used , p ) :
            if p == len ( a ) :
                last = None
                res = 0
                for i in range ( 0 , len ( cs ) , n ) :
                    for j in range ( n ) :
                        c = cs [ i + a [ j ] ]
                        if c != last :
                            res += 1
                            last = c
                return res
            else :
                res = chain ( a , used )
                for a in range ( p ) :
                    if not used [ a [ p ] ] :
                        used [ a [ p ] ] = True
                        res = min ( res , permrec ( a , used , p + 1 ) )
                        used [ a [ p ] ] = False
                    return res
        def debug ( * os ) :
            print ( * map ( pformat , args ) , file = sys.stderr )
    def debug ( * args , ** kwargs ) :
        print ( * args , file = sys.stderr )
