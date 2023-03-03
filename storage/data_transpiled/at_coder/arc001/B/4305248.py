def main ( ) :
    import sys
    from math import sin , cos , pi
    sc = Scanner ( )
    change = [ 10 , 5 , 1 ]
    border = [ 7.5 , 3.5 , 0.5 ]
    need = abs ( sin ( pi * change ) - cos ( pi * change ) )
    count = 0
    for i in range ( 3 ) :
        while need >= border [ i ] :
            need = abs ( need - change [ i ] )
            count += 1
    print ( count )
