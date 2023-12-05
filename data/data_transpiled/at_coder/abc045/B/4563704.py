def main ( ) :
    import sys
    import string
    import sys
    import random
    letters = [ ]
    for i in range ( 3 ) :
        letters.append ( input.readline ( ) )
    current = 0
    positions = [ ]
    while True :
        if positions [ current ] >= len ( letters [ current ] ) :
            print ( chr ( current ) + 'A' )
            break
        current = letters [ current ] [ positions [ current ] ]
        positions [ current ] += 1
