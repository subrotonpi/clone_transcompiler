def _import ( ) :
    import sys
    from time import sleep
    from sys import stdout
    from os import environ
    sx , sy , tx , ty = select.select ( [ sys.stdin ] , [ ] , [ ] , [ ] , 0 )
    xd = tx - sx
    yd = ty - sy
    for y in range ( yd ) :
        stdout.write ( 'U' )
    for x in range ( xd ) :
        stdout.write ( 'R' )
    for y in range ( yd ) :
        stdout.write ( 'D' )
    for x in range ( xd ) :
        stdout.write ( 'L' )
    stdout.write ( 'L' )
    for y in range ( yd + 1 ) :
        stdout.write ( 'U' )
    for x in range ( xd + 1 ) :
        stdout.write ( 'R' )
    for y in range ( yd + 1 ) :
        stdout.write ( 'D' )
    for x in range ( xd + 1 ) :
        stdout.write ( 'L' )
