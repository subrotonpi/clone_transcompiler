def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    sx , sy , tx , ty = map ( int , repeat ( 'x' , 'y' ) )
    gapx = tx - sx
    gapy = ty - sy
    seq = [ 'U' for i in range ( gapy ) ]
    for i in range ( gapx ) :
        seq [ i ] = repeat ( 'R' , 'D' )
    for i in range ( gapy + 1 ) :
        seq [ i ] = repeat ( 'L' , 'L' )
    for i in range ( gapy + 1 ) :
        seq [ i ] = repeat ( 'U' , 'U' )
    for i in range ( gapx + 1 ) :
        seq [ i ] = repeat ( 'R' , 'D' )
    for i in range ( gapy + 1 ) :
        seq [ i ] = repeat ( 'D' , 'L' )
    for i in range ( gapx + 1 ) :
        seq [ i ] = repeat ( 'U' , 'U' )
    for i in range ( gapy + 1 ) :
        seq [ i ] = repeat ( 'R' , 'D' )
    for i in range ( gapx + 1 ) :
        seq [ i ] = repeat ( 'L' , 'U' )
    for i in range ( gapy + 1 ) :
        seq [ i ] = repeat ( 'R' , 'D' )
    for i in range ( gapx + 1 ) :
        seq [ i ] = repeat ( 'R' , 'D' )
    for i in range ( gapx + 1 ) :
        seq [ i ] = repeat ( 'L' , 'U' )
    for i in range ( gapy + 1 ) :
        seq [ i ] = repeat ( 'R' , 'D' )
    for i in range ( gapx + 1 ) :
        seq [ i ] = repeat ( 'R' , 'D' )
    for i in range ( gapx + 1 ) :
        seq [ i ] = repeat ( 'L' , 'U' )
