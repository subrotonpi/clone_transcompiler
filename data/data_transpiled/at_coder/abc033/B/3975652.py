def main ( ) :
    import sys
    from os import path
    from os import urandom
    from random import randint
    from math import sin
    from math import log
    from math import log
    from math import log
    N = int ( sys.argv [ 1 ] )
    sum = 0
    name = [ ]
    people = [ ]
    for i in range ( N ) :
        name.append ( os.path.basename ( path.join ( path.dirname ( __file__ ) , i ) ) )
        people.append ( randint ( 1 , N ) )
        sum += people [ i ]
    print ( answer )
