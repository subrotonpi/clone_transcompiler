def round1c ( ) :
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import math
    import collections
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import stat
    import math
    r = [ ]
    d = { }
    for i in r :
        d [ i ] = i + 1
    cum = [ ]
    for i in range ( len ( r ) ) :
        update ( cum , d [ i ] , 1 + calc ( cum , s [ i ] ) - 1 )
    res = calc ( cum , len ( cum ) - 1 )
    os.write ( os.path.join ( os.path.dirname ( os.path.abspath ( __file__ ) ) , "Case #%d: %d\n" % ( test , res ) ) , "%d\n" % ( res ) )
    os.close ( wr )
