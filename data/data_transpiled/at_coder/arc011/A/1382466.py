def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , log
    from math import log
    from math import log
    from math import pi
    from math import log
    from math import log
    from math import pi
    m = log ( pi )
    n = log ( pi )
    N = log ( pi )
    pused = N
    result = pused
    while pused >= m :
        precycle = pused // m
        pused -= precycle * m
        pused += precycle * n
        result += precycle * n
    print ( result )
