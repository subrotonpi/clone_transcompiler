def main ( ) :
    import sys
    from itertools import repeat
    n = int ( sys.stdin.readline ( ) )
    if n % 2 == 1 :
        print ( n / 2 + 1 )
    else :
        print ( n / 2 )
