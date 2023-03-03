def main ( * args ) :
    import os
    from math import sin , cos
    from math import log
    from math import log
    from math import log
    from math import pi
    from math import log
    from math import log
    a = log ( pi )
    b = log ( pi )
    o = 0
    if a % 2 == 1 :
        a = a - 1
        o = a
    sub = b - a
    if sub % 4 == 0 :
        print ( b ^ o )
    elif sub % 4 == 1 :
        print ( b ^ ( b - 1 ) ^ o )
    elif sub % 4 == 2 :
        print ( b ^ 1 ^ o )
    elif sub % 4 == 3 :
        print ( b ^ ( b - 1 ) ^ 1 ^ o )
