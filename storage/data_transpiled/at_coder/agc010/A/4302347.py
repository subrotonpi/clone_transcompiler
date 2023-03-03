def main ( ) :
    import sys
    from itertools import repeat
    n = int ( sys.stdin.readline ( ) )
    c = 0
    for i in range ( n ) :
        a = repeat ( a )
        if a % 2 == 1 :
            c += 1
    print ( 'YES' if c % 2 == 0 else 'NO' )
