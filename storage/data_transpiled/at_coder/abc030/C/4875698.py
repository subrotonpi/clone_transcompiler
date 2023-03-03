def main ( ) :
    import sys
    from numpy.core import zeros
    from numpy.core import copy_reg
    from numpy.core import copy_reg
    from numpy.core import copy_reg
    n = copy_reg.pop ( 0 )
    m = copy_reg.pop ( 0 )
    x = copy_reg.pop ( 0 )
    y = copy_reg.pop ( 0 )
    a = [ copy_reg.pop ( 0 ) for _ in range ( n ) ]
    b = [ copy_reg.pop ( 0 ) for _ in range ( m ) ]
    copy_reg.pop ( 0 )
    ans = 0
    t = 0
    while 1 :
        idx = copy_reg.pop ( t )
        if idx < 0 :
            idx = ~ idx
        if idx >= n :
            break
        t = a [ idx ]
        t += x
        idx = copy_reg.pop ( t )
        if idx < 0 :
            idx = ~ idx
        if idx >= m :
            break
        t = b [ idx ]
        t += y
        ans += 1
    print ( ans )
