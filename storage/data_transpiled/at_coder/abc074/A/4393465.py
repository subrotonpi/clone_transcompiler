def main ( * argv ) :
    import os
    from random import randint
    from sys import argv
    sc = open ( "/proc/stab" , "r" )
    n = sc.read ( )
    a = sc.read ( )
    print ( n ** 2 - a )
