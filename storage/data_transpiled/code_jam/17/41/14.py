def _import ( ) :
    from os import getenv
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import expanduser
    from os.open import expanduser
    from os.path import join
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os import chdir
    from os import sep
    from os import chdir
    from random import randint
    from random import random
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import chdir
    N = int ( chdir ( join ( expanduser ( '~' ) , '..' ) ) )
    for c in range ( 1 , N + 1 ) :
        res = solve ( )
        print ( 'Case #%d: %s\n' % ( c , res ) , file = sys.stderr )
    if chdir ( join ( chdir ( dirname ( __file__ ) ) , '..' ) ) :
        print ( 'All done' , file = sys.stderr )
    if chdir ( join ( chdir ( dirname ( __file__ ) , '..' ) , '..' ) ) :
        return
    res = 0
    if not p1 + p2 + p3 :
        return
    if p1 > 0 :
        x = doit ( ( r + 1 ) % P , p1 - 1 , p2 , p3 )
        res = max ( res , x )
    if p2 > 0 :
        x = doit ( ( r + 2 ) % P , p1 , p2 - 1 , p3 )
        res = max ( res , x )
    if p3 > 0 :
        x = doit ( ( r + 3 ) % P , p1 , p2 , p3 - 1 )
        res = max ( res , x )
    if not res :
        res += 1
    return M [ r ] [ p1 ] [ p2 ] [ p3 ]
