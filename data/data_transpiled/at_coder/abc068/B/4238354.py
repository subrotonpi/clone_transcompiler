def main ( ) :
    import sys
    from math import pow
    from random import randint
    from math import pow
    from math import log
    from math import log
    from math import log
    n = int ( sys.stdin.read ( ) )
    count = 0
    while int ( pow ( 2 , count ) ) <= n :
        count += 1
    print ( int ( pow ( 2 , count - 1 ) ) )
