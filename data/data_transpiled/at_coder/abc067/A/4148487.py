def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from pydev_ipython.util import pydev_ipython
    from pydev_ipython.util import pydev_ipython
    a = randint ( 1 , 3 )
    b = randint ( 1 , 3 )
    print ( 'Possible' if ( a % 3 == 0 or b % 3 == 0 or ( a + b ) % 3 == 0 ) else 'Impossible' )
