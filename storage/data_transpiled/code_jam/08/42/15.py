def _ _ main _ _ ( ) :
    import sys
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    class B ( object ) :
        def __call__ ( self ) :
            with builtins.open ( 'r' , 'rb' ) as sc :
                on = sc.__next__ ( )
                loop :
                for o in range ( 1 , on + 1 ) :
                    print ( 'Case #%d: ' % o , end = '' )
                    n , m , a = sc.__next__ ( )
                    for x1 in range ( 0 , n + 1 ) :
                        for y1 in range ( 0 , m + 1 ) :
                            for x2 in range ( 0 , n + 1 ) :
                                for y2 in range ( 0 , m + 1 ) :
                                    if x1 * y2 - y1 * x2 == a :
                                        print ( '%d %d %d %d %d %d' % ( 0 , 0 , x1 , y1 , x2 , y2 ) , end = '' )
                                        continue loop
                print ( 'IMPOSSIBLE' )
        def debug ( * os ) :
            print ( * os , end = '' )
    builtins.debug = debug
