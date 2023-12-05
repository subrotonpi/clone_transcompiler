def main ( ) :
    import sys
    import os
    from math import min , max , abs
    bf = open ( "/proc/stab" , "r" )
    try :
        a , b , c , d = map ( int , bf.readlines ( ) )
        print ( min ( a , b ) , min ( c , d ) )
    except :
        pass
