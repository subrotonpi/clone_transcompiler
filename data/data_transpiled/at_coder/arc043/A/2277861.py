def main ( ) :
    import sys
    from numpy import linspace
    from numpy.core import zeros
    from numpy.core import sin , cos , sin
    from numpy.random import randint
    n = linspace ( 0 , 1 , n )
    a = linspace ( 0 , 1 , n )
    b = linspace ( 0 , 1 , n )
    arr = [ ]
    max = float ( 0 )
    min = float ( 0 )
    ave = 0
    for i in range ( n ) :
        arr.append ( randint ( 0 , 1 ) )
        if arr [ i ] > max :
            max = arr [ i ]
        if arr [ i ] < min :
            min = arr [ i ]
        ave += float ( arr [ i ] ) / n
    sa = max - min
    p = float ( b ) / sa
    q = float ( a ) - float ( ave ) * p
    if not ( p == 0 or q == 0 ) :
        print ( - 1 )
        return
    print ( p , q )
