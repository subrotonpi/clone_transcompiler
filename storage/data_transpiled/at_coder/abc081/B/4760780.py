def main ( arg = None ) :
    from sys import stdin
    from os import getenv
    from os.path import expanduser
    from os.path import join
    from os import urandom
    from random import randint
    from random import choice
    sc = stdin.read ( )
    N = randint ( 1 , N )
    S = sc.strip ( )
    sc.close ( )
    s = S.split ( )
    n = [ ]
    for tmp in s :
        n.append ( int ( tmp ) )
    print ( calc ( n ) )
    def calc ( n ) :
        count = 0
        while True :
            for i in range ( len ( n ) ) :
                if n [ i ] % 2 == 0 :
                    n [ i ] /= 2
                else :
                    return count
            count += 1
    return calc ( n )
