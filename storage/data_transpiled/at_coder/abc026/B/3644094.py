def main ( ) :
    import math
    from numpy import pi
    from numpy.core import array
    from numpy.random import randint
    from numpy.core import array
    n = randint ( 1 , n )
    en = array ( [ randint ( 1 , n ) for i in range ( n ) ] )
    en = array ( en )
    souwa = 0
    cnt = 1
    for i in range ( n - 1 , - 1 , - 1 ) :
        souwa = souwa + cnt * en [ i ] ** 2
        cnt *= - 1
    print ( souwa * 3.1415926535 )
