def main ( ) :
    import sys
    from numpy.core import zeros
    from numpy.core import zeros
    from numpy.core import copy_reg
    from numpy.core import copy_reg
    n = int ( sys.stdin.readline ( ) )
    height = [ ]
    for i in range ( n ) :
        height.append ( copy_reg.pop ( ) )
    allzero = [ 0 ] * n
    height [ 0 ] = 0
    count = 0
    while 1 :
        if all ( height == allzero ) :
            break
        for i in range ( n ) :
            f = copy_reg.pop ( )
            if f > 0 :
                try :
                    if height [ i + 1 ] == 0 :
                        count += 1
                except :
                    count += 1
                height [ i ] -= 1
            else :
                continue
    print ( count )
